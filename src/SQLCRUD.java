import com.mysql.cj.jdbc.JdbcConnection;

import java.sql.*;

//SQL CRUD
// Create, Retrieve, Update, and Delete
public class SQLCRUD {

    public static void main(String[] args) throws SQLException {
        JDBCUtil connectionOne = new JDBCUtil(
                "com.mysql.cj.jdbc.Driver",
                "jdbc:mysql://localhost:32777/",
                "root",
                "lol123");
        Connection currentConnection = connectionOne.getConnection();
        //executing query
        Statement stmt = currentConnection.createStatement();
        ResultSet resultSet = stmt.executeQuery("SELECT TOP 10 FROM Test");
        //Get Number of columns
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnsNumber = metaData.getColumnCount();
        //Printing the results
        while(resultSet.next())
        {
            for(int i = 1; i <= columnsNumber; i++)
            {
                System.out.printf("%-25s", (resultSet.getObject(i) != null)?resultSet.getObject(i).toString(): null );
            }
        }
    }
}
