package org.example.test;
import org.example.page.main;
import org.example.base.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class mainTest extends BaseTest {

    main main;

    @Before
    public void before() {
        main = new main(getWebDriver());
    }

    @Test
    @Ignore
    public void testAll() throws InterruptedException {
        main.genderSelect().
            gotoLoginPage().
            enterEmail().
            enterPassword().
            clickLoginButton().
            searchProduct();
    }
    @Test
    public void urunRandomTest() throws InterruptedException {
        main.scroolDown().getRandomProduct().switchWindow(1).selectRandomColour().selectRandomSize().getProductPriceInPage().addToCart().waitUntilProductAddAndGoCart().getAllProductsOnCart();

    }

    @Test
    public void sepetUrunKontrol() {
        main.getProductPriceInPage();
    }

    @After
    public void after() {
        tearDown();
    }

}
