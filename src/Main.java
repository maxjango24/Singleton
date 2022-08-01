import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = DataBase.getInstance().getDbConnection();
            String result = "SELECT firstname FROM max.users";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(result);
            while (resultSet.next()){
                System.out.println(resultSet.getString("firstname"));
                System.out.println("Shinrai Tensei");
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
