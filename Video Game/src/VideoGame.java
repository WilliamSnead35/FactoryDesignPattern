public class VideoGame {
    public void play() {
        AlienFactory af = new AlienFactory();
        Alien [] a = new Alien[10];
        for(int i =0; i<10;i++){
            a[i]= af.getAlien();
        }
    }
}
