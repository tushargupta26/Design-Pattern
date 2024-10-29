package lld.creationalPattern.objectPool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private List<DBConnection> freeConnectionPool = new ArrayList<>();
    private List<DBConnection> connectionCurrentlyInUse = new ArrayList<>();
    private static int INITIAL_PPOL_SIZE = 3;
    private static int MAX_POOL_SIZE = 6;

    private static DBConnectionPoolManager dbConnectionPoolManager = null;

    private DBConnectionPoolManager() {
        for (int i = 0; i < INITIAL_PPOL_SIZE; i++) {
            freeConnectionPool.add(new DBConnection());
        }
    }

    public static DBConnectionPoolManager getInstance(){
        if (dbConnectionPoolManager == null){
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManager == null){
                    dbConnectionPoolManager = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    public synchronized DBConnection getDBConnection() {
        if(freeConnectionPool.isEmpty() && connectionCurrentlyInUse.size() < MAX_POOL_SIZE){
            freeConnectionPool.add(new DBConnection());
            System.out.println("creating new connection and putting into the pool, free pool size: " + freeConnectionPool.size());
        } else if(freeConnectionPool.isEmpty() && connectionCurrentlyInUse.size() >= MAX_POOL_SIZE) {
            System.out.println("can not create new DB connection as limit is reached");
            return null;
        }
        DBConnection dbConnection = freeConnectionPool.remove(freeConnectionPool.size() - 1);
        connectionCurrentlyInUse.add(dbConnection);
        System.out.println("Adding db connection into pool use, size: " + connectionCurrentlyInUse.size());
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConnection dbConnection){
        if(dbConnection != null){
            connectionCurrentlyInUse.remove(dbConnection);
            System.out.println("Removing db connection from pool use, size: " + connectionCurrentlyInUse.size());
            freeConnectionPool.add(dbConnection);
            System.out.println("Adding db connection into pool free, size: " + freeConnectionPool.size());
        }
    }

}
