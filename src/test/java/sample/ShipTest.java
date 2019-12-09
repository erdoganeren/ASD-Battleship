package sample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShipTest {
    private int xTest = 400;
    private int yTest = 500;
    private int lengthTest = 2;
    private Direction direction = Direction.RIGHT;
    private int divXTest = 420;
    private int divYTest = 520;
    private Ship shipTest = new Ship(xTest,yTest,lengthTest,direction,divXTest,divYTest);

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getX() {
        int actualX = shipTest.getX();
        assertEquals(xTest, actualX);
    }

    @Test
    void getY() {
    }

    @Test
    void getDivX() {
    }

    @Test
    void getDivY() {
    }

    @Test
    void getLength() {
    }

    @Test
    void getDirection() {
    }

    @Test
    void getShipParts() {
    }

    @Test
    void attack() {
    }

    @Test
    void checkIfDestroyed() {
    }
}