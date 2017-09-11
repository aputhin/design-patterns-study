public class ServerPool {
    private final long expirationTime = 3600;

    private HashSet<Server> inUse;
    private HashSet<Server> available;

    public void create() {
        available.add(new Server());
    }

    public synchronized Server checkOut() {
        // warning: might be good to do some validation, actually!
        if (availabe.size() == 0) {
            create();
        }
        Server server = available.iterator().next();
        available.remove(server);
        inUse.add(server);
        return server;
    }

    public synchronized void checkIn(Server server){
        inUse.remove(server);
        available.add(server);
    }
}
