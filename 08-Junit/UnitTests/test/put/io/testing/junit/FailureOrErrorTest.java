package put.io.testing.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//zad4
public class FailureOrErrorTest {

    @Test
    public void test1(){
        assertEquals(10, 5+4);
    }
    @Test
    public void test2(){
        throw new IllegalArgumentException("blad");
    }
    // test1 jest Failure, a test2 Error

    @Test
    public void test3(){
        try{
            assertEquals(10, 5+4);
        }catch (Throwable e){
            System.out.println(e.getClass().getName());
            e.printStackTrace();
        }
    }

}
