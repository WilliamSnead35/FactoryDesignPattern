import java.util.Random;

public class Alien {
    private final String NAME;
    private static Random r = new Random();

    public Alien(String type){
        this.NAME = type + r.nextInt(100);
    }

    public String getNAME(){
        return this.NAME;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "NAME='" + NAME + '\'' +
                '}';
    }
}
}
