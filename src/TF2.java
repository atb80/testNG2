import org.testng.Assert;
import org.testng.annotations.Test;

public class TF2 {
    @Test (priority = 1)
    void setup(){
        System.out.println("we're on OVB home page");
    }

    @Test
    void SearchAgent() {
        System.out.println("search agent test");
        Assert.assertEquals(1,1);
    }
    @Test
    void AddAgent() {
        System.out.println("login test");
    }

    @Test
    void teardown() {
        System.out.println("we're out of the browser");
    }
}

