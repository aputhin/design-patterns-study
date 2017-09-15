public class Game implements Cloneable {
    private String name;
    private String genre;

    public Game(String name, String genre) { 
        this.name = name;
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Game clone() throws CloneNotSupportedException {
        return new Game(name, genre);
    }
}

public class GameCollection {
    public static void main(String[] args) {
        Game halo = new Game("Halo", "Shooter");
        Game halo2 = halo.clone();
        halo2.setName("Halo 2");
        Game halo3 = halo.clone();
        halo3.setName("Halo 3");
        /** and so on */
    }
}