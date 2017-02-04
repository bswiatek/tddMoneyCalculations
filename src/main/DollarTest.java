package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times();
        assertEquals(10, five.amount);
    }
}