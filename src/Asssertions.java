import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Asssertions {


    WebDriver driver = new ChromeDriver();

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "E:\testNG2/chromedriver_win32/chromedriver.exe");
        driver.get("https://www.ovb.pl");

    }

    @Test
    void ifLogoExist() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"ls-global\"]/body/div[2]/header/div[1]/a"));
        Assert.assertTrue(logo.isDisplayed(), "logo is not displayed on the page");
    }

    @Test
    void homePageTitel() {

        String title = driver.getTitle();
        Assert.assertEquals("OVB Allfinanz Polska Spółka Finansowa", title, "Title is not excatly what we expected ");
    }
    @Test
    void oNas() throws InterruptedException {
        WebElement oNas = driver.findElement(By.xpath("//*[@id=\"ls-global\"]/body/div[2]/header/nav/ul[2]/li[1]/a"));
        driver.manage().window().maximize();
        Thread.sleep(10000);
        Assert.assertTrue(oNas.isDisplayed(),"oNas");
        driver.quit();
    }
    @Test
    void rozwiazaniaFinansowe() throws InterruptedException {
        WebElement rozwiazaniaFinansowe = driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul[2]/li[2]/a"));
        driver.manage().window().maximize();
        Thread.sleep(10000);
        Assert.assertTrue(rozwiazaniaFinansowe.isDisplayed(), "rozwiazaniaFinansowe");
        driver.quit();
    }
    @Test
    void blog() throws InterruptedException {
        WebElement Blog = driver.findElement(By.xpath("/html/body/div[1]/header/nav/ul[2]/li[3]/a"));
        driver.manage().window().maximize();
        Thread.sleep(10000);
        Assert.assertTrue(Blog.isDisplayed(), "Blog");
        driver.quit();
    }
    @Test
    void wiecejOnas() throws InterruptedException {
        WebElement WiecejOnas = driver.findElement(By.xpath("//*[@id=\"c14706\"]/div[2]/div/p[2]/a"));
        driver.manage().window().maximize();
        Thread.sleep(10000);
        Assert.assertTrue(WiecejOnas.isDisplayed(), "Blog");
        driver.quit();
    }

    @Test
     void tearDown() {
        driver.quit();
    }
}
