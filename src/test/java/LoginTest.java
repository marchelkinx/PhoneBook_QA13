import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver wd;

    @BeforeTest
    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }

    @Test
    public void loginPositiveTest(){
        wd.findElement(By.xpath("//*[text()='LOGIN']")).click();


        WebElement emailInput = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys("marchelkinx@gmail.com");


        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
        passInput.click();
        passInput.clear();
        passInput.sendKeys("89Ar95tr$");

        // click login button
        wd.findElement(By.xpath("//button[1]")).click();

        // Assert if logout button present
        Assert.assertTrue(wd.findElement(By.xpath("//button]")) != null);



    }

    @AfterMethod
    public void tearDown(){
//        wd.quit();
    }
}
