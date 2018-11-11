package DAO;

import metier.*;
import java.sql.*;
import java.util.ArrayList;

public abstract class DBAcess {

		protected Connection connection;
		
		public DBAcess() {
			try {
				this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quotationsApp?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC" 
						,"root", "");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		abstract public String save(Object o);
		
		abstract public String delete(int id);
		
		abstract public String update(Object o);
		
		abstract public ArrayList list();
		
		
}
