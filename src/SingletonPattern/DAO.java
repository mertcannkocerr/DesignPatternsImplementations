package SingletonPattern;

public class DAO {
    private static DAO databaseAccessObject = null;
    private String connectionURL = "https://www.google.com";

    private DAO() {
    }

    public static DAO getInstance(){
        if(databaseAccessObject == null){
            databaseAccessObject = new DAO();
        }
        return databaseAccessObject;
    }

    public String getConnectionURL() {
        return connectionURL;
    }
}
