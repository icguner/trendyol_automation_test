package org.example.base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    static WebDriver webDriver=null;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\testinium\\Desktop\\seleniumOdev\\src\\test\\java\\org\\example\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("user-agent=\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36 OPR/60.0.3255.170\"");
        options.addArguments("--incognito");
        setWebDriver(new ChromeDriver(options));
        //getWebDriver().navigate().to("https://www.trendyol.com");
        getWebDriver().navigate().to("https://www.trendyol.com/sr?q=Kazak&qt=Kazak&st=Kazak&os=1");
    }

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        BaseTest.webDriver = webDriver;

    }

    public void tearDown() {
        getWebDriver().quit();
    }
}
