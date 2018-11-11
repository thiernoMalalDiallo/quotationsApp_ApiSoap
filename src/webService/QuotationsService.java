package webService;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import DAO.AuthorAccess;
import DAO.DBAcess;
import DAO.QuotationAccess;
import metier.*;

@WebService
public class QuotationsService {
		
		private DBAcess access;
		
		@WebMethod
		public String saveUser(@WebParam(name="user") User user) {
			return "user saved";
		}
		
		@WebMethod
		public String saveQuotation(@WebParam(name="quotation_save") Quotation quotation) {
			this.access = QuotationAccess.getInstance();
			return this.access.save(quotation);
		}
		
		@WebMethod
		public String updateQuotation(@WebParam(name="quotation_update") Quotation quotation){
			this.access = QuotationAccess.getInstance();
			return this.access.update(quotation);
		}
		
		@WebMethod
		public void likeQuotation(@WebParam(name="quotation_like") Quotation quotation){
			
		}
		
		@WebMethod
		public String deleteQuotation(@WebParam(name="quotation_delete") int id){
			this.access = QuotationAccess.getInstance();
			return this.access.delete(id);
		}
		
		@WebMethod
		public ArrayList<Quotation> quotationsList(){
			this.access = QuotationAccess.getInstance();
			return this.access.list();
		}
		
		public ArrayList<Author> authorsList(){
			this.access = AuthorAccess.getInstance();
			return this.access.list();
		}

		
		
		
		
}
