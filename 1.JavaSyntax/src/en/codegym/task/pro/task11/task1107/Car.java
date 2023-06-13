package en.codegym.task.pro.task11.task1107;

/* 
The engine — the heart of the car
*/

public class Car {

    class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }

    private Engine engine;
}
