package music.string;

import music.Playable;

/*
 * Write a class called Veena which implements Playable interface. 
 * Let this class be placed in a package music.string
 */

public class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Veena: Melodious classical string sounds.");
    }
}