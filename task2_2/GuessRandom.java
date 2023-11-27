package task2_2;
import java.util.Random;

public class GuessRandom{
    private Random random;

    public GuessRandom() {
        random = new Random();
    }

    public GuessRandom(int seed) {
        random = new Random(seed);

    }
    
    public double nextNormal() {
        return nextNormal(0.0, 1.0);
    }

    public double nextNormal(double mean, double sigma) {
        double u1 = random.nextDouble();
        double u2 = random.nextDouble();
        double z0 = Math.sqrt(-2.0 * Math.log(u1)) * Math.cos(2.0 * Math.PI * u2);
        return mean + sigma * z0;
    }
}
