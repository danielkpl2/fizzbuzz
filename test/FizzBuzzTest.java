import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    String[] s;
    @Before
    public void setUp(){
        s = FizzBuzz.fizzbuzz(15);
    }
    @Test
    public void ShouldBeFizz() throws Exception {
        Assert.assertEquals("Fizz", s[3]);
    }
    @Test
    public void ShouldBeBuzz() throws Exception {
        Assert.assertEquals("Buzz", s[5]);
    }
    @Test
    public void ShouldBeFizzBuzz() throws Exception {
        Assert.assertEquals("FizzBuzz", s[15]);
    }
    @Test
    public void ShouldBeNumber2() throws Exception {
        Assert.assertEquals("2", s[2]);
    }

}