package DAO;

import java.util.*;
import metier.*;
import java.sql.*;

public class AuthorAccess extends DBAcess{
		
		private static AuthorAccess myInstance = null;
		
		private AuthorAccess() {
			super();
		}
		
		public static AuthorAccess getInstance() {
			if(myInstance == null)
				myInstance = new AuthorAccess();
			return myInstance;
		}
		
		private int exist(Author a) {
			try {
				Statement st = this.connection.createStatement();
				ResultSet result = st.executeQuery("select id from Author where lastname = '"+a.getlastName()+"'and firstname = '"+a.getFirstName()+"'");
				while(result.next())
					return result.getInt("id");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return 0;
		}
		
		public String save(Object a) {
			Author author = (Author) a;
			if(this.exist(author) != 0)
				return ""+this.exist(author);
			try {
				Statement myStatement = this.connection.createStatement();
				String sql = "insert into Author "+
							 "(lastname, firstname) values ('"+author.getlastName()+"','"+author.getFirstName()+"')";
				
				myStatement.executeUpdate(sql);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return ""+this.exist(author);
		}
		
		public String delete(int id) {
			
			return "Author deleted";
		}
		
		public String update(Object o) {
			
			return "Author updated";
		}
		
		public ArrayList<Author> list() {
			ArrayList<Author> list = new ArrayList<>();
			try {
				Statement myStatement = this.connection.createStatement();
				ResultSet result = myStatement.executeQuery("select * from Author");
				while (result.next()) {
					Author a = new Author(result.getInt("id"), result.getString("lastname"),result.getString("firstName"));
					list.add(a);
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return list;
		}
}
