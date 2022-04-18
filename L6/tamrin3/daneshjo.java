import java.sql.* ;
public class daneshjo {
    public String studentcode ,name ;
    public int year , gpa ;
    public void DBcom(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123") ;
            Class.forName("oracle.jdbc.driver.OracleDriver") ;
            PreparedStatement preparedStatement = connection.prepareStatement("insert into person1 (studentcode , name , year , gpa) values (?,?,?,?)");
            preparedStatement.setString(1,studentcode);
            preparedStatement.setString(2,name);
            preparedStatement.setInt(3 ,year);
            preparedStatement.setInt(4, gpa);
            preparedStatement.close();
            connection.close();

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public void del() {
        try (Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123")) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            PreparedStatement preparedStatement = connection.prepareStatement("delete from person1 where code=?");
            preparedStatement.setString(1, studentcode);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
        public void update (){
            try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "soroush", "Soroush123")) {
                Class.forName("oracle.jdbc.driver.OracleDriver") ;
                PreparedStatement preparedStatement = connection.prepareStatement("update person set gpa = ? where studentcode = ?");
                preparedStatement.setInt(1,gpa);
                preparedStatement.setString(2,studentcode);

            }        catch (Exception e) {
                System.out.println(e);
            }

        }
    }
