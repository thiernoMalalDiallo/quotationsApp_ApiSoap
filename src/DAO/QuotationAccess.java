package DAO;

import java.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import metier.Author;
import metier.Quotation;

public class QuotationAccess extends DBAcess{
	
	private static QuotationAccess myInstance = null;
	private AuthorAccess author = AuthorAccess.getInstance();
	
	private QuotationAccess() {
		super();
	}
	
	public static QuotationAccess getInstance() {
		if(myInstance == null)
			myInstance = new QuotationAccess();
		return myInstance;
	}
	
	
	public String save(Object q) {
		Quotation quotation = (Quotation) q;
		int id_author = Integer.parseInt(this.author.save(quotation.getAuthor()));
		try {
			Statement myStatement = this.connection.createStatement();
			String sql = "insert into Quatations "+
						 "(quotation, source, hashtag, id_author, datecreation)"+
						 " values ('"+quotation.getQuotation()+"','"+quotation.getSource()+"','"+quotation.getHashtag()+"','"+
						 id_author+"','"+new Date()+"')";
			
			myStatement.executeUpdate(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Quotation saved";
	}
	
	public String delete(int id) {
		
		return "Quotation deleted";
	}
	
	public String update(Object o) {
		
		return "Quotation updated";
	}
	
	public ArrayList<Quotation> list() {
		ArrayList<Quotation> list = new ArrayList<>();
		try {
			Statement myStatement = this.connection.createStatement();
			ResultSet result = myStatement.executeQuery("select * from Quotations");
			while (result.next()) {
				 Quotation quotation = new Quotation(result.getInt("id"),result.getString("quotation"),result.getString("source"),result.getString("hashtag"), 
						 			   new Author(), result.getDate("datecreation"));
				list.add(quotation);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
