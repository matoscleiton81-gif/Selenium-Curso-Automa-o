import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class PrimeiroTesteJava {
 
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/cmatos/Downloads/desafio_final_selenium_java.html");
        System.out.println("Título da Página: " + driver.getTitle());
       
        // campo Usuário swag labs -> user-name
        WebElement campoUsuario = driver.findElement(By.id("login-username"));
        campoUsuario.sendKeys("admin");
        //campoUsuario.clear();
 
        // campo senha swag labs -> password
        WebElement campoSenha = driver.findElement(By.id("login-password"));
        campoSenha.sendKeys("123456");
        campoSenha.submit();
 
        //  botão: Unknown word. login -> login-button
            WebElement btnLogin = driver.findElement(By.id("login-submit"));
            btnLogin.click();

        //  pausa na execução milissegundos
            Thread.sleep(3000); 
            driver.quit();
  
        System.out.println("A url agora é essa: " + driver.getCurrentUrl());
         driver.navigate().back();
         Thread.sleep(3000);
 
        System.out.println("A url agora é essa: " + driver.getCurrentUrl());
        System.out.println("Teste de Login -> Passou!");
 
        driver.quit();
    }
   }