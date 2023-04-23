import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class InventoryPage {
    WebDriver driver;
    //constructor
    public InventoryPage(WebDriver driver){
        this.driver = driver;
    }
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Tmp\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.saucedemo.com/inventory/");
    }

    @After
    public void tearDown(){
        driver.quit();
    }
    //class = inventory_list
    @FindBy(id = "inventory_container")
    private WebElement inventoryListFiled;
    //element is displayed
}