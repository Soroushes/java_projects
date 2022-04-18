import java.sql.*;

public class person {
    public int code , age ;
    public String username , email , pass , education ;
    public void DBcom() {

        try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver") ;
            PreparedStatement preparedStatement = connection.prepareStatement("insert into person(age,code,username,email,pass,education) values (?,?,?,?,?,?)");
            preparedStatement.setInt(1,age);
            preparedStatement.setInt(2,code);
            preparedStatement.setString(3,username);
            preparedStatement.setString(4,email);
            preparedStatement.setString(5,pass);
            preparedStatement.setString(6,education);


        }
        catch (Exception e) {
            System.out.println(e);
        }
    }public void update() {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("update person set pass=? where code=? ");
            preparedStatement.setString(1,pass);
            preparedStatement.setInt(2,code);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    }