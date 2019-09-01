import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework {

    static float getPercentage(int percentage, int number) {
        return (float)percentage / 100 * number;
    }

    static double getFuelUsage(int volume, int distance) {
        return (double) volume / distance * 100;
    }

    @Test
    public static void main(String[] args) {

        float getPercentageResult;
        getPercentageResult = getPercentage(5, 400);
        Assertions.assertEquals(20.0, getPercentageResult);

        double getFuelUsageResult;
        getFuelUsageResult = getFuelUsage(50, 520);
        Assertions.assertEquals(9.615384615384617, getFuelUsageResult);
    }
}
