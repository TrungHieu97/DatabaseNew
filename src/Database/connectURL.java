package DatabaseNew;

import java.sql.*;  

public class connectURL {  
	bookijfo book = new bookijfo();

   public static void main(String[] args) {  
 
      String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
         "databaseName=BookInfo;user=sa;password=sa";  
 
      Connection con = null;  
      Statement stmt = null;  
      ResultSet rs = null;  

      try {  
         
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         con = DriverManager.getConnection(connectionUrl);  

           
         String SQL = "SELECT TOP 10 * FROM Book";  
         stmt = con.createStatement();  
         rs = stmt.executeQuery(SQL);  

         while (rs.next()) {  
            System.out.println(rs.getString(1) + "|" + rs.getString(4));  
         }  
      }  

       
      catch (Exception e) {  
         e.printStackTrace();  
      }  
      finally {  
         if (rs != null) try { rs.close(); } catch(Exception e) {}  
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
         if (con != null) try { con.close(); } catch(Exception e) {}  
      }  
   }  
}
