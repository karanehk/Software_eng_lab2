import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testComputeArea() {
        Rectangle rectangle = new Rectangle(5, 4);
        double expectedArea = 20;
        double actualArea = rectangle.computeArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testGetWidth() {
        Rectangle rectangle = new Rectangle(5, 4);
        double expectedWidth = 4;
        double actualWidth = rectangle.getWidth();
        assertEquals(expectedWidth, actualWidth, 0.001);
    }

    @Test
    public void testGetHeight() {
        Rectangle rectangle = new Rectangle(5, 4);
        double expectedHeight = 5;
        double actualHeight = rectangle.getHeight();
        assertEquals(expectedHeight, actualHeight, 0.001);
    }

    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle(3, 2);
        rectangle.setHeight(4);
        double expectedHeight = 4;
        double actualHeight = rectangle.getHeight();
        assertEquals(expectedHeight, actualHeight, 0.001);    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(4, 2);
        rectangle.setWidth(3);
        double expectedWidth = 3;
        double actualWidth = rectangle.getWidth();
        assertEquals(expectedWidth, actualWidth, 0.001);
    }
    
}