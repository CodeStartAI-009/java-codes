interface Playable {
    void play();
}

abstract class Instrument {
    abstract void tune();
}

class Guitar extends Instrument implements Playable {
    public void play() {
        System.out.println("Playing guitar");
    }
    
    void tune() {
        System.out.println("Tuning guitar");
    }
}

public class InterfaceVsAbstract {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.tune();
        g.play();
    }
}
