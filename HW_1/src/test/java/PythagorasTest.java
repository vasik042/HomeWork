import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PythagorasTest {

    private Pythagoras pythagoras;

    @Before
    public void beforeTest() {
        pythagoras = new Pythagoras();
    }

    @Test
    public void theoremTest(){
        double realSum = pythagoras.theorem(3.0, 4.0);
        double expectedSum = 5;
        boolean fine = false;
        if (expectedSum == realSum){
            fine = true;
        }
        Assert.assertTrue(fine);
    }

    @After
    public void afterTest() {
        pythagoras = null;
    }
}
