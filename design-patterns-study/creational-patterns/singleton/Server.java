public class Server {
    private static Server serverInstance;

    private Server() {}

    public static Server getInstance() {
        if (serverInstance == null) {
            serverInstance = new Server();
        }
        return serverInstance;
    }

    public void doConnect() {
        /*...*/
    }
}

// Using Enum
public enum Server{
    INSTANCE;

    public void doConnect() {
        /*...*/
    }
}