import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsTest{



     @Test
    public void testMean(){
    
    double [] numbers = [2, 4, 6, 8];
    double expectedValue = 20;
    double actualValue = Statistics.sum(numbers);
    assertEquals (expectedValue, actualValue);

}
    @Test
    public void testMean(){
    
    double [] numbers = [2, 4, 6, 8];
    double expectedValue = 5.0;
    double actualValue = Statistics.mean(numbers);
    assertEquals (expectedValue, actualValue);

}

    @Test
    public void testVariance(){
    
    double [] numbers = [2, 4, 6, 8];
    double expectedValue = 5.0;
    double actualValue = Statistics.variance(numbers);
    assertEquals(expectedValue, actualValue);
}

    @Test
    public void testStandardDeviation(){
    
    double [] numbers = [2, 4, 6, 8];
    double expectedValue = Math.sqrt(5.0); //2.236
    double actualValue = Statistics.standardDeviation(numbers);
    assertEquals(expectedValue, actualValue);

}
