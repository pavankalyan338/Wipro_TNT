package music.wind;

import music.Playable;

/*
 * Write a class called Saxophone which implements Playable interface. 
 * Let this class be placed in a package music.wind
 */

public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Saxophone: Smooth jazz wind sounds.");
    }
}