import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseOperations
{
    public void insertNameToDatabase(String name)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaPostgresqlDatabase", "tanerduzceer", "107761Taner");
            System.out.println("Database connected...");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO List (names) VALUES ('" + name + "')" );
            ResultSet resultSet = statement.executeQuery();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //take names from database and write to string arraylist
    public void getAllNamesFromDatabase()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaPostgresqlDatabase", "tanerduzceer", "107761Taner");
            System.out.println("Database connected...");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM List");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                //This "1" is coloumn index
                System.out.println(resultSet.getString(1));
            }
            resultSet.close();
            preparedStatement.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}

