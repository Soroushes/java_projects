import java.sql.*;
public class db_saipa {
    String name, color, information;
    int model ;
        public void insert(){
            try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into information (name,color,information,model) values (?,?,?,?)");
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,color);
                preparedStatement.setString(3,information);
                preparedStatement.setInt(4,model);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}
