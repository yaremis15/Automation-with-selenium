package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ClaseTest {

    static WebDriver driver;

    @BeforeMethod
     void setupClass() {
        /*
         * Configuracion e inicialización del chrome driver
         * por medio de la libreria de WebdriverManager
         * que se encarga de la descarga y configuración del driver
         */
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //Maximiza la pantalla
    }

    @AfterMethod
     void teardown(){
        driver.quit(); //cierra la instancia del driver despues de ejecutarse el test
    }

    @Test
    public void ejercicio1() {
        driver.get("https://www.google.com");
        String titlePage = driver.getTitle(); //obtiene el titulo de la page
        String urlPage = driver.getCurrentUrl(); //obtiene la url de la pagina

        System.out.println(titlePage);
        System.out.println(urlPage);

        assertThat(titlePage).contains("Google"); //valida si el nombre de la pagina contiene el texto Google
        assertThat(urlPage).isEqualTo("https://www.google.com/"); // valida si la url obtenida del navegador es igual a la esperada
    }
}
