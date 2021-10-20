package org.example.page;
import static org.example.constants.TrendyolConstant.*;
import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class main extends BasePage {



    private static float priceOnProductPage = 0;
    private static String NameOnProductPage = "";

    public static float getPriceOnProductPage() {
        return priceOnProductPage;
    }


    public static String getNameOnProductPage() {
        return NameOnProductPage;
    }

    public main(WebDriver driver) {
        super(driver);
    }

    public main genderSelect() {
        findElement(GENDER_SELECT_BOX).click();
        return this;
    }

    public main gotoLoginPage() {
        findElement(GO_LOGIN_PAGE_BUTTON).click();
        return this;
    }

    public main enterEmail() {
        sendText(LOGIN_EMAIL_INPUT,"icguner@pm.me");
        return this;
    }

    public main enterPassword() {
        sendText(LOGIN_PASSWORD_INPUT,"241715");
        return this;
    }

    public main clickLoginButton() throws InterruptedException {
        findElement(LOGIN_SUBMIT_BUTTON).click();
        Thread.sleep(2000);
        return this;
    }

    public main searchProduct() {
        sendText(SEARCH_BAR,"Kazak");
        findElement(SEARCH_BAR).sendKeys(Keys.ENTER);
        return this;
    }

        public main getRandomProduct() throws InterruptedException {
            Random rand = new Random();
            List<WebElement> Products = findElements(ALL_PRODUCT);
            WebElement randomElement = Products.get(rand.nextInt(Products.size()));
            randomElement.click();
            return this;
        }

        public main selectRandomSize() {
            if(isElementExist(SIZE_VARIANT)) {
                Random rand = new Random();
                List<WebElement> sizeList = findElements(SIZE_VARIANT);
                WebElement randomElement = sizeList.get(rand.nextInt(sizeList.size()));
                randomElement.click();
            }
            else {

            }
            return this;
        }

        public main addFavorite() {
            findElement(ADD_FAVORITE_BUTTON).click();
            return this;
        }

    public main addToCart() {
        findElement(ADD_CART_BUTTON).click();
        return this;
    }

    public main goCartPageButton() {
        findElement(GO_CART_PAGE_BUTTON).click();
        return this;
    }

        public main deleteOverlay() {
            String overlayString = "return document.querySelector(\".overlay\").remove();";
            runJSExecution(overlayString);
            //findElement(PRODUCT_OVERLAY)
            return this;
        }

        public main waitUntilProductAddAndGoCart () {
            if (isElementExist(PRODUCT_SUCCESSFULY_ADDED_TO_CART)) {
                goCartPageButton();
            }
            else {

            }
            return this;
        }

        public main selectRandomColour() {
            if(isElementExist(COLOUR_VARIANT)) {
                Random rand = new Random();
                List<WebElement> colourList = findElements(COLOUR_VARIANT);
                WebElement randomElement = colourList.get(rand.nextInt(colourList.size()));
                randomElement.click();
            }
            else {

            }
            return this;
        }

        public main switchWindow(int tab) {
            switchWindows(tab);
            return this;
        }

        public main getProductPriceInPage() {
            if (isElementExist(PRODUCT_PRICE_INPAGE_DISC)) {
                priceOnProductPage = fixPrice(PRODUCT_PRICE_INPAGE_DISC);
                System.out.println(priceOnProductPage);
            }
            else {
                priceOnProductPage = fixPrice(PRODUCT_PRICE_INPAGE_NORMAL);
                System.out.println(priceOnProductPage);
            }
            return this;
        }

        public main getProductNameInPage() {
            NameOnProductPage = getText(PRODUCT_NAME_INPAGE);
            return this;
        }

        public LinkedList getAllProductsOnCart() {
            Random rand = new Random();
            LinkedList listProduct = new LinkedList();
            List<WebElement> cartItems = findElements(PRODUCTS_ON_CART);
            for(WebElement item : cartItems) {
                String tempPrice = "";
                String productName = item.findElement(By.xpath("//*[@class=\"pb-item\"]/text()")).getAttribute("innerHTML");
                String productPrice = item.findElement(By.xpath("//*[@class=\"pb-basket-item-price\"]/text()")).getAttribute("innerHTML");
                float fixedPrice = fixPrice(By.xpath("//*[@class=\"pb-basket-item-price\"]/text()"));
                listProduct.add(productName);
                listProduct.add(tempPrice);
            };
            return listProduct;
        }
    /*
            public main getRandomProduct() {
                Random rand = new Random();
                List<WebElement> Products = findElement(ALL_PRODUCT_DIV).findElements(By.className("product-item-wrapper"));
                WebElement randomElement = Products.get(rand.nextInt(Products.size()));
                randomElement.click();
                return this;
            }

            public main isPriceMatch() {
                Float productCartPrice =  fixPrice(PRODUCT_PRICE_IN_CART);
                if (priceOnProductPage == productCartPrice) {
                } else {
                }
                return this;
            }
            */
    public main scroolDown() {
        try {
            scrollToDown();
            Thread.sleep(3000);
            deleteOverlay();
        }
        catch(InterruptedException ie){}
        return this;
    }


}
