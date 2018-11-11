package metier;

import java.io.Serializable;
import java.util.*;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Quotation implements Serializable{
		
		private int id;
		private String quotation;
		private String source;
		private String hashtag;
		private Author author;
		private Date dateCreation;
		
		
		public Quotation() {
		}
	
		public Quotation(int id, String quotation, String source, String hashtag, Author author, Date dateCreation) {
			super();
			this.id = id;
			this.quotation = quotation;
			this.source = source;
			this.hashtag = hashtag;
			this.author = author;
			this.dateCreation = dateCreation;
		}
		
		public int getId() {
			return id;
		}

		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public Author getAuthor() {
			return author;
		}
		public void setAuthor(Author author) {
			this.author = author;
		}
		public Date getDateCreation() {
			return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}
		

		public String getQuotation() {
			return quotation;
		}

		public void setQuotation(String quotation) {
			this.quotation = quotation;
		}

		public String getHashtag() {
			return hashtag;
		}

		public void setHashtag(String hashtag) {
			this.hashtag = hashtag;
		}

}
