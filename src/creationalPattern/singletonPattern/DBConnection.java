package creationalPattern.singletonPattern;

public class DBConnection {
    private static DBConnection dbConnection;
    public DBConnection(){}

    public static DBConnection getInstance(){
        if(dbConnection == null){
            synchronized (DBConnection.class){
                if(dbConnection == null){
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }

}
