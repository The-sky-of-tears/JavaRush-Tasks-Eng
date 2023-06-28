package en.codegym.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Mozartville and Chopintown
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());

        for (int i = 0; i < 3; i++) {
            orchestra.add(new Piano());
        }
    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add((new Guitar()));
    }

    public static void playOrchestra() {
        orchestra.forEach(MusicalInstrument::play);
    }
}
