import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static DataBase database;

    private DataBase(){

    }

    public static DataBase getInstance(){
        if (DataBase.database == null){
            database = new DataBase();
        }
        return database;
    }

    public Connection getDbConnection() throws SQLException, ClassNotFoundException {

        String connectionString = "jdbc:mysql://localhost:3306/max";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(connectionString, "root", "root");
    }



}
