import java.sql.*;

public class dbperson {
    String email , username , pass ,name ;
    public void insert(){
            try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into information (username,pass,email,neme) values (?,?,?,?)");
                preparedStatement.setString(1,username);
                preparedStatement.setString(2,pass);
                preparedStatement.setString(3,email);
                preparedStatement.setString(4,name);
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    public void DBlogin() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123");
            PreparedStatement preparedStatement = connection.prepareStatement("select password from ?");
            preparedStatement.setString(1 , username);
            ResultSet resultset = preparedStatement.executeQuery() ;
            String password = resultset.getString("pass");
            if (pass==password) System.out.println("you logged in to your account");
            else System.out.println("user name or password is incorrect");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
