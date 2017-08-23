package DatabaseNew;

import java.sql.SQLException;

import com.sun.corba.se.pept.transport.Connection;

public class bookijfo {
	private static String name;
	private static String author;
	private static String productId;
	private static String category ;
	
	public void setName(String name){ this.name = name ;}
	public String getName(){return name;}
	
	public void setAuthor(String author){this.author = author;}
	public String getAuthor(){return author;}
	
	public void setProductId(String productId){this.productId = productId;}
	public String getProductId(){return productId;}
	
	public void setCategory(String category){this.category = category;}
	public String getCategory(){return category;}
	
}
