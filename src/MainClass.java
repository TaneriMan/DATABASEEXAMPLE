public class MainClass
{


    public static void main(String args[])  //static method
    {
        DatabaseOperations databaseOperations = new DatabaseOperations();
        databaseOperations.insertNameToDatabase("Berkay");
        databaseOperations.getAllNamesFromDatabase();

    }
}

