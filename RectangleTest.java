import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        double expectedArea = 20;
        double actualArea = rectangle.computeArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

}