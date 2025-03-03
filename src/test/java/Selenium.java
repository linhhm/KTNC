import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium {
    EdgeDriver edgeDriver;
    @BeforeEach
    public void setup(){
        WebDriverManager.edgedriver().setup();
        edgeDriver = new EdgeDriver();
    }
    @Test
    public void testDky(){
        edgeDriver.get("https://vitimex.com.vn/dang-ky.html");
        WebElement name = edgeDriver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("linh");
        WebElement sdt = edgeDriver.findElement(By.xpath("//input[@id='phone']"));
        sdt.sendKeys("1234567890");
        WebElement email = edgeDriver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("linh@123");
        WebElement mk = edgeDriver.findElement(By.xpath("//input[@id='pass-regis']"));
        mk.sendKeys("123456");
        WebElement xnmk = edgeDriver.findElement(By.xpath("//input[@id='pass-confirm']"));
        xnmk.sendKeys("123456");
        WebElement btndk = edgeDriver.findElement(By.xpath("//a[@id='register-btn']"));
        btndk.click();
    }
    @Test
    public void testDN(){
    edgeDriver.get("https://vitimex.com.vn/");
    WebElement icon = edgeDriver.findElement(By.xpath("//div[@class='li_log']//a[@data-bs-toggle='modal']//*[name()='svg']"));
    icon.click();
//    WebElement sdt = edgeDriver.findElement(By.xpath(" //input[@id='account']"));
//    sdt.sendKeys("0123456789");
        WebDriverWait wait = new WebDriverWait(edgeDriver, Duration.ofSeconds(10));
        WebElement sdt = wait.until(ExpectedConditions.elementToBeClickable(By.id("account")));
        sdt.sendKeys("0123456789");
    }
}
