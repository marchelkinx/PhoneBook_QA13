//package tests;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class LoginTest extends TestBase{
//
////    WebDriver wd;
////
////    @BeforeMethod
////    public void init(){
////        wd = new ChromeDriver();
////        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
////        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
////
////    }
//
//    @BeforeMethod
//    public void preCondition(){
////        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
//        if(app.getUser().isLogged()){
//            app.getUser().logout();
//        }
//
//    }
//
//    @Test
//    public void loginPositiveTest(){
//        String email = "marchelkinx@gmail.com";
//        String password = "89Ar95tr$";
//
//        app.getUser().openLoginRegistrationForm();
//        app.getUser().fillLoginRegistrationForm(email, password);
//        app.getUser().submitLogin();
//
//        pause(3000);
//
////        Assert.assertTrue(isElementPresent(By.xpath("//button")));
//
//    }
//
//    @Test
//    public void loginPositiveTestOld(){
//        wd.findElement(By.xpath("//*[text()='LOGIN']")).click();
//
//        WebElement emailInput = wd.findElement(By.xpath("//input[@placeholder='Email']"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("marchelkinx@gmail.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("89Ar95tr$");
//
//        // click login button
//        wd.findElement(By.xpath("//button[1]")).click();
//
//        // Assert if logout button present
//        Assert.assertTrue(wd.findElement(By.xpath("//button")) != null);
//
//
//    }
//
//    @Test
//    public void loginNegativeTest() {
//        wd.findElement(By.xpath("//*[text()='LOGIN']")).click();
//
//        WebElement emailInput = wd.findElement(By.xpath("//input[@placeholder='Email']"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("marchelkinxgmail.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("89Ar95tr$");
//
//        // click login button
//        wd.findElement(By.xpath("//button[1]")).click();
//
//    }
////
////        @AfterMethod
////    public void tearDown(){
//////        wd.quit();
////    }
//}
