package org.example.constants;

import org.openqa.selenium.By;

public class TrendyolConstant {
    public static final By GENDER_SELECT_BOX= By.cssSelector("#gender-popup-modal .homepage-popup > div:nth-child(4)");
    public static final By GO_LOGIN_PAGE_BUTTON= By.cssSelector("#account-navigation-container div.link.account-user");
    public static final By LOGIN_EMAIL_INPUT= By.id("login-email");
    public static final By LOGIN_PASSWORD_INPUT= By.id("login-password-input");
    public static final By LOGIN_SUBMIT_BUTTON= By.cssSelector("#login-register .q-primary");
    public static final By SEARCH_BAR= By.cssSelector(".search-box-container > input");
    public static final By ALL_PRODUCT= By.cssSelector(".prdct-cntnr-wrppr > .p-card-wrppr");
    public static final By SIZE_VARIANT= By.cssSelector(".variants > .sp-itm");
    public static final By COLOUR_VARIANT= By.cssSelector(".styles-module_slider__o0fqa > a");
    public static final By ADD_FAVORITE_BUTTON = By.cssSelector(".tooltip-indicator > .fv");
    public static final By ADD_CART_BUTTON = By.cssSelector("#product-detail-app .add-to-basket");
    public static final By GO_CART_PAGE_BUTTON = By.cssSelector("div.account-nav-item.basket-preview > a");
    public static final By PRODUCT_PRICE_INPAGE_DISC = By.cssSelector(".product-price-container .pr-bx-pr-dsc > div > .prc-dsc");
    public static final By PRODUCT_PRICE_INPAGE_NORMAL = By.cssSelector(".product-price-container .prc-slg");
    public static final By PRODUCT_NAME_INPAGE = By.cssSelector("#product-detail-app .pr-new-br span");
    public static final By PRODUCTS_ON_CART = By.cssSelector(".pb-basket-item");
    public static final By PRODUCT_SUCCESSFULY_ADDED_TO_CART = By.cssSelector(".add-to-basket.success");




}