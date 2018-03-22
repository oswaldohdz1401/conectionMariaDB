public class Conector
{
   public static void main(String args[])
   {
      try
      {
          Class.forName("org.mariadb.jdbc.Driver");
          Connection  connection = DriverManager.getConnection("jdbc:mariadb://localhost:3
          Statement stmt = connection.createStatement();
          stmt.executeUpdate("CREATE TABLE a (id int not null primary key, value varchar(2
          stmt.close();
          connection.close();
      }
      catch (Exception ex)
      {
         System.out.println("Error al registrar el driver de MySQL: " + ex);
      }
   }
}
