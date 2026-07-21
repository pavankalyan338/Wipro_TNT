package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

/*
 * Write another class Test (Assignment1) in a package called live. Then,
 * a. Create an instance of Veena and call play() method
 * b. Create an instance of Saxophone and call play() method
 * c. Place the above instances in a variable of type Playable and then call play()
 */

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("=== Direct Instance Calls ===");
        // a. Create an instance of Veena and call play()
        Veena veena = new Veena();
        veena.play();

        // b. Create an instance of Saxophone and call play()
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        System.out.println("\n=== Polymorphic Calls via Playable Interface ===");
        // c. Place instances in a variable of type Playable and call play()
        Playable playable;

        playable = veena;
        playable.play();

        playable = saxophone;
        playable.play();
    }
}