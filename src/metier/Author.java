package metier;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Author implements Serializable{
		
		private int id;
		private String lastName;
		private String firstName;
		
		public Author() {
		}
		
		public Author( int id, String lastName, String prelastName) {
			super();
			this.lastName = lastName;
			this.firstName = prelastName;
			this.id = id;
		}
		
		
		public String getlastName() {
			return lastName;
		}
		public void setlastName(String lastName) {
			this.lastName = lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String prelastName) {
			this.firstName = prelastName;
		}
		
		
}
