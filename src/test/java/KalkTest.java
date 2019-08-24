
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class KalkTest {

    //arrange - sätta upp test
    //act - anropa metoden som ska testas
    //assert - junit testar resultatet av metonanropet

    @Test
    public void test_plus (){
    double expected = 4.0;
    double delta = 0;
    double actual = Kalkylator.plus(2.0,2.0);
    assertEquals(expected,actual,delta);
    }


    @Test
    public void test_minus (){
     double expected = 1.0;
     double delta = 0;
     double actual = Kalkylator.minus(3.0,2.0);
     assertEquals(expected,actual,delta);
    }


    @Test
    public void test_ganger (){
        double expected = 4.0;
        double delta = 0;
        double actual = Kalkylator.ganger(2.0,2.0);
        assertEquals(expected,actual,delta);
    }


    @Test
    public void test_delat (){
        double expected = 1.0;
        double delta = 0;
        double actual = Kalkylator.delat(2.0,2.0);

        assertEquals(expected,actual,delta);
    }
    }












