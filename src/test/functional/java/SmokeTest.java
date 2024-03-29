import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest {

    private static WebDriver driver;

    @BeforeClass
    public static void before() {
        driver = new FirefoxDriver();
    }

    @AfterClass
    public static void after() {
        driver.close();
    }

    @Test
    //@Ignore // TODO: create code to complete the CRUD operations for a 'Thingy'
    public void thingyCRUD() {
        driver.get("http://localhost:8080/pair-stairs/pairstairparticipant");
        driver.findElement(By.linkText("New Pair stairs participant")).click();
        driver.findElement(By.name("name")).sendKeys("Bob's Amazing Widget");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

}
