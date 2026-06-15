import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAplicacao {

    private final String URL = "file:///C:/Users/cmatos/Downloads/jornada_selenium%201.html";

    @Test
    public void validarCheckBox() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get(URL);

        WebElement checkbox = driver.findElement(By.id("java-checkbox"));
        checkbox.click();

        Thread.sleep(3000);

        driver.quit();
    }
}