package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {
    private AudiobookPriceCalculator audiobookPriceCalculator;

    private Audiobook audiobook;
    private Customer customer1;
    private Customer customer2;
    private Customer customer3;
    private Customer customer4;


    @BeforeEach
    public void setUp(){
        audiobookPriceCalculator = new AudiobookPriceCalculator();
        audiobook = new Audiobook("tak", 1000);
        customer1 = new Customer("Alan", Customer.LoyaltyLevel.GOLD, true);
        customer2 = new Customer("Alan2", Customer.LoyaltyLevel.SILVER, false);
        customer3 = new Customer("Alan3", Customer.LoyaltyLevel.GOLD, false);
        customer4 = new Customer("Alan4", Customer.LoyaltyLevel.STANDARD, false);

    }
    //5.1 whitebox

    //5.2 4

    @Test
    public void testIsSubscriber(){
        assertEquals(0.0, audiobookPriceCalculator.calculate(customer1, audiobook));
    }

    @Test
    public void testStartingPriceWithSilver(){
        assertEquals(900, audiobookPriceCalculator.calculate(customer2, audiobook));
    }
    @Test
    public void testStartingPriceWithGold(){
        assertEquals(800, audiobookPriceCalculator.calculate(customer3, audiobook));
    }
    @Test
    public void testStartingPriceWithStandard(){
        assertEquals(1000, audiobookPriceCalculator.calculate(customer4, audiobook));
    }

}