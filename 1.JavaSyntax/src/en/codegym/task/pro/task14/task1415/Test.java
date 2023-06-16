package en.codegym.task.pro.task14.task1415;

public class Test {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        for (int i = 0; i < 5; i++) {
            stack.push(Integer.toString(i));
        }

        System.out.println("Top element: " + stack.peek());

        while (!stack.empty()) {
            System.out.println("Current top: " + stack.pop());
        }
    }
}
