import org.testng.annotations.Test;

public class TF1 {

    @Test
    void setup(){
        System.out.println("we're on home page");
    }

    @Test
    public void login() {
        System.out.println("login test");
    }

    @Test
    public void teardown() {
        System.out.println("we're out of the browser");
    }
}
