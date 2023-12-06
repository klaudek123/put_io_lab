package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    //zad1
    @Test
    public void testAdd(){
        assertEquals(15, calculator.add(5, 10));
        assertEquals(10, calculator.add(-5, 15));

        assertEquals(10, calculator.multiply(2, 5));
        assertEquals(10, calculator.multiply(-2, -5));
    }
    //zad2
    @Test
    public void testAddPositiveNumbers(){
//        assertEquals(3, calculator.addPositiveNumbers(-2, 5));
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->{
            calculator.addPositiveNumbers(-2, 5);
        });
        assertEquals("The arguments must be positive", thrown.getMessage());
    }

    //zad3
    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }
    //Nie działa



}