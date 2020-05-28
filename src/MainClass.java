public class MainClass
{


    public static void main(String args[])  //static method
    {
        DatabaseOperations databaseOperations = new DatabaseOperations();
////        databaseOperations.createTable("NamesAndPhones");
//
//        databaseOperations.addColumntoTable( "javaPostgresqlDatabase", "tanerduzceer" , "107761Taner", "namesAndPhones", "names" );
//        databaseOperations.addColumntoTable( "javaPostgresqlDatabase", "tanerduzceer" , "107761Taner", "namesAndPhones", "phoneNumber" );
//
//        databaseOperations.insertValueToDatabase("javaPostgresqlDatabase", "tanerduzceer", "107761Taner", "NamesAndPhones", "names", "Berkay");
//        databaseOperations.insertValueToDatabase("javaPostgresqlDatabase", "tanerduzceer", "107761Taner", "NamesAndPhones", "phoneNumber", "04845757");
        databaseOperations.getAllTableRows("javaPostgresqlDatabase", "tanerduzceer" , "107761Taner", "namesAndPhones");

        //databaseOperations.createTable("b");
        //databaseOperations.createTable("c");
        //databaseOperations.deleteTable("list");
        //databaseOperations.deleteAllTables();
        //databaseOperations.createDatabase("test");
        //databaseOperations.deleteDatabase("test");

    }
}

