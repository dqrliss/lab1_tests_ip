import org.junit.jupiter.api.Test;

import java.text.NumberFormat;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @org.junit.jupiter.api.Test
    void getX() {
        calculator c = new calculator(0.99, 3);
        assertEquals(0.99, c.getX());
    }

    @org.junit.jupiter.api.Test
    void setX() {
        calculator c = new calculator(0.99, 3);
        c.setX(-0.999);
        assertEquals(-0.999, c.getX());
    }

    @org.junit.jupiter.api.Test
    void getK() {
        calculator c = new calculator(0.99, 3);
        assertEquals(3, c.getK());
    }

    @org.junit.jupiter.api.Test
    void setK() {
        calculator c = new calculator(0.99, 3);
        c.setK(8);
        assertEquals(8, c.getK());
    }

    @Test
    void testcalc1() {
        calculator c = new calculator(0.999, 8);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc2() {
        calculator c = new calculator(-0.99, -5);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc3() {
        calculator c = new calculator(-0.9, 5);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc4() {
        calculator c = new calculator(0.763, 3);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc5() {
        calculator c = new calculator(-0.32, 13);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc6() {
        calculator c = new calculator(0.00000000000001, 1000);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc7() {
        calculator c = new calculator(-0.0000001, 856);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc8() {
        calculator c = new calculator(-0.671, 12);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc9() {
        calculator c = new calculator(0.22222, 7);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc10() {
        calculator c = new calculator(0, 50);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }

    @Test
    void testcalc11() {
        calculator c = new calculator(0.8889, 14);
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(c.getK());
        assertEquals(formatter.format(1/Math.pow((1+c.getX()), 3)), formatter.format(c.calc()));
    }
}