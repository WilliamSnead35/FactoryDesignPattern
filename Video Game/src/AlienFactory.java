import java.util.Random;
public class AlienFactory {
    enum e {SQUID, MONKEY, TIGER, RAT}

    public Alien getAlien() {
        Random r = new Random(4);
        e alien = e.values()[r.nextInt()];
        switch (alien) {
            case SQUID:
                return new SquidAlien();
                break;
            case MONKEY:
                return new MonkeyAlien();
                break;
            case TIGER:
                return new TigerAlien();
                break;
            case RAT:
                return new RatAlien();
                break;
            default:
                return null;
        }
    }
}
