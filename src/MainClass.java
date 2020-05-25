public class MainClass
{


    public static void main(String args[])  //static method
    {
        DatabaseOperations databaseOperations = new DatabaseOperations();
        databaseOperations.insertNameToDatabase("Berkay");
        databaseOperations.getAllNamesFromDatabase();
        databaseOperations.createTable("a");
        databaseOperations.createTable("b");
        databaseOperations.createTable("c");
        databaseOperations.deleteTable("list");
        databaseOperations.deleteAllTables();
        databaseOperations.createDatabase("test");
        databaseOperations.deleteDatabase("test");

    }
}

