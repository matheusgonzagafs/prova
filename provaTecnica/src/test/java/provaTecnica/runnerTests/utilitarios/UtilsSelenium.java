package provaTecnica.runnerTests.utilitarios;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class UtilsSelenium {

    private final String URL_SIMULADOR = "https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca";

    private static WebDriver driver;

    @Before("@testes_aceitacao_web")
    public void beforeScenario() throws MalformedURLException, InterruptedException {
        ChromeOptions cap = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://chrome:4444/wd/hub"), cap);
        driver.get(URL_SIMULADOR);

    }

    @After("@testes_aceitacao_web")
    public void afterScenario() {
        driver.close();
        driver.quit();

    }


    public static void waitElementVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebDriver getDriver() {
        return driver;
    }
}