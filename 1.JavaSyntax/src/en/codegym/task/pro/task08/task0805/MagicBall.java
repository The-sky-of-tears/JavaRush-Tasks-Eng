package en.codegym.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Certainly";
    private static final String DEFINITELY = "Definitely";
    private static final String MOST_LIKELY = "Most likely";
    private static final String OUTLOOK_GOOD = "The outlook is good";
    private static final String ASK_AGAIN_LATER = "Ask later";
    private static final String TRY_AGAIN = "Try again";
    private static final String NO = "My answer is no";
    private static final String VERY_DOUBTFUL = "Very doubtful";

    public static String getPrediction() {

        return switch(new Random().nextInt(8)) {
            case 0 -> CERTAIN;
            case 1 ->DEFINITELY;
            case 2 -> MOST_LIKELY;
            case 3 -> OUTLOOK_GOOD;
            case 4 -> ASK_AGAIN_LATER;
            case 5 -> TRY_AGAIN;
            case 6 -> NO;
            case 7 -> VERY_DOUBTFUL;
            default -> null;
        };
    }
}
