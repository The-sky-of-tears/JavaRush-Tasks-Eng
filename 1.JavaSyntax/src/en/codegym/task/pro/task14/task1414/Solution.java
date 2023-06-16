package en.codegym.task.pro.task14.task1414;

/* 
Making cocktails
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "The %s method was called on line %d of the %s class in the file %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (var info : stackTrace) {
            System.out.printf(OUTPUT_FORMAT, info.getMethodName(), info.getLineNumber(),
                    info.getClassName(), info.getFileName());
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
