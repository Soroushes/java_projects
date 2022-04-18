import java.sql.* ;
public class person {
    int code ;
    String melli , father , name , job , hoghogh ;
    public void DBcom(){
    try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123")) {
        Class.forName("oracle.jdbc.driver.OracleDriver") ;
        PreparedStatement preparedStatement = connection.prepareStatement("insert into person1 (code, melli , father , name ,job , hoghogh) values (?,?,?,?,?,?)");
        preparedStatement.setString(2,melli);
        preparedStatement.setInt(1,code);
        preparedStatement.setString(3,father);
        preparedStatement.setString(4, name);
        preparedStatement.setString(5,job);
        preparedStatement.setString(6,hoghogh);


    }
        catch (Exception e) {
        System.out.println(e);
         }
    }
    public void del(){
        try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver") ;
            PreparedStatement preparedStatement = connection.prepareStatement("delete from person1 where code=?");
            preparedStatement.setInt(1,code);

    }        catch (Exception e) {
            System.out.println(e);
        }
}
}
