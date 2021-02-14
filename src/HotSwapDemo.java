import java.util.Random;

public class HotSwapDemo {

    public static final int ITERATIONS = 100;

    public static void main(String[] args) {
        HotSwapDemo demo = new HotSwapDemo();
        System.out.println("Starting HotSwap demo with Java on Truffle: 'java.vm.name' = " + System.getProperty("java.vm.name"));
        // run something in a loop
        for (int i = 1; i < ITERATIONS; i++) {
            demo.runDemo(i);
        }
        System.out.println("Completed HotSwap demo with Java on Truffle");
    }

    private void runDemo(int iteration) {
       printRandom(iteration);
    }

    public static void printRandom(int iteration) {
        int random = new Random().nextInt(iteration);
        System.out.printf("\titeration %d ran with result: %d\n", iteration, random);
    }
}
