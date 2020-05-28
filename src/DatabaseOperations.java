import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseOperations
{
    public void createDatabase(String databaseName)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "tanerduzceer", "107761Taner");
            System.out.println("Connected to PostgreSql");
            PreparedStatement statement = connection.prepareStatement("CREATE DATABASE " + databaseName);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("Database Created Successfully");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    //Burası Daha çalışmıyor
    public void deleteDatabase(String databaseName)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "tanerduzceer", "107761Taner");
            System.out.println("Connected to PostgreSql");

            PreparedStatement statement = connection.prepareStatement("REVOKE CONNECT ON DATABASE " + databaseName + " FROM public");
            ResultSet resultSet = statement.executeQuery();

            PreparedStatement statementt = connection.prepareStatement("DROP DATABASE IF EXISTS " + databaseName );
            ResultSet resultSett = statementt.executeQuery();
            System.out.println("Database Deleted Successfully");
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //Create Table in The Database
    public void createTable(String tableName)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaPostgresqlDatabase", "tanerduzceer", "107761Taner");
            System.out.println("Database connected...");
            PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE " + tableName + "()");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Table Created Successfully");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    ////Create Table in The Database
    public void addColumntoTable(String databaseName, String userName , String password, String tableName, String colomnName)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databaseName, userName, password);
            System.out.println("Database connected...");
            PreparedStatement preparedStatement = connection.prepareStatement("ALTER TABLE " + tableName + " ADD COLUMN " + colomnName + " VARCHAR");
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Column Added Successfully");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //Delete a Specific Table From Database
    public void deleteTable(String tableName)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaPostgresqlDatabase", "tanerduzceer", "107761Taner");
            System.out.println("Database connected...");
            PreparedStatement preparedStatement = connection.prepareStatement("DROP TABLE IF EXISTS " + tableName );
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Table Deleted Successfully");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //Delete All Tables drop owned by the_user;
    public void deleteAllTables()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/javaPostgresqlDatabase", "tanerduzceer", "107761Taner");
            System.out.println("Database connected...");
            //tanerduzceer is the name of database user
            PreparedStatement preparedStatement = connection.prepareStatement("DROP OWNED BY tanerduzceer" );
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("All Tables Deleted Successfully");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //Insert a row the table "javaPostgresqlDatabase" is my database name
    public void insertValueToDatabase(String databaseName, String userName , String password, String tableName, String colomnName, String insertValue)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databaseName, userName, password);
            System.out.println("Database connected...");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO " +tableName+ " ("+ colomnName + ") VALUES ('" + insertValue + "')" );
            ResultSet resultSet = statement.executeQuery();
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    //take names from database and write to string arraylist
    public void getAllTableRows(String databaseName, String userName , String password, String tableName)
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databaseName, userName, password);
            System.out.println("Database connected...");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM " + tableName);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                //This "1" is coloumn index
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
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

