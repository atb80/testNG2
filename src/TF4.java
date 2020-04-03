import org.testng.annotations.*;

public class TF4 {


    public class TF3 {

        @BeforeClass
        void beforeClass() {
            System.out.println("wykona sie przed wywylaniem class");
        }

        @AfterClass
        void afterClass() {
            System.out.println("wykona sie po wywylaniem class");
        }

        @BeforeMethod
        void beforeMethod() {
            System.out.println("this will execute before every method");
        }

        @AfterMethod
        void afterMethod() {
            System.out.println("this will execute after every method");
        }


        @Test
        void TestStep4a() {
            System.out.println("This is TF3");
        }

        @Test
        public void TestStep4b() {
            System.out.println("This is TF3a");
        }
    }
}