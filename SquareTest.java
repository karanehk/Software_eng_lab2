import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void testComputeArea() {
        Square square = new Square(4);
        double expectedArea = 16;
        double actualArea = square.computeArea();
        assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void testGetSide() {
        Square square = new Square(4);
        double expectedSide = 4;
        double actualSide = square.getSide();
        assertEquals(expectedSide, actualSide, 0.001);
    }

    @Test
    public void testSetSide() {
        Square square = new Square(4);
        square.setSide(5);
        double expectedSide = 5;
        double actualSide = square.getSide();
        assertEquals(expectedSide, actualSide, 0.001);
    }
}