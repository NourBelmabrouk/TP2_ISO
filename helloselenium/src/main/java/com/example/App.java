package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));

        // open the website
        driver.get("https://www.tunisianet.com.tn/");
        Thread.sleep(5000);

        //click on the user icon button
        WebElement userIconButton= driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
        userIconButton.click();
        Thread.sleep(5000);

        // click on the connexion button in the dropdown
        WebElement connexionButton= driver.findElement(By.cssSelector("#_desktop_user_info > ul > li > a"));
        connexionButton.click();
        Thread.sleep(5000);

        //input your email
        WebElement emailInput= driver.findElement(By.cssSelector("#login-form > section > div:nth-child(2) > div.col-md-6 > input"));
        emailInput.sendKeys("tp2selenium@gmail.com");
        Thread.sleep(5000);

        //input your password
        WebElement passInput= driver.findElement(By.cssSelector("#login-form > section > div:nth-child(3) > div.col-md-6 > div > input"));
        passInput.sendKeys("tp2iso");
        Thread.sleep(5000);

        // click on the connexion button to finish the authentification
        WebElement authentificationButton= driver.findElement(By.cssSelector("#submit-login"));
        authentificationButton.click();
        Thread.sleep(5000);


        // input whatever you want to search
        WebElement searchInput= driver.findElement(By.cssSelector("#search_query_top"));
        searchInput.sendKeys("PC portable MacBook M1 13.3");
        Thread.sleep(5000);


        //click on the search button
        WebElement searchButton= driver.findElement(By.cssSelector("#sp-btn-search > button"));
        searchButton.click();
        Thread.sleep(5000);


        //click on the first item resulted from the search
        WebElement resultButton= driver.findElement(By.cssSelector("#js-product-list > div > div:nth-child(1) > article > div > div.wb-image-block.col-lg-3.col-xl-3.col-md-4.col-sm-4.col-xs-6 > a"));
        resultButton.click();
        Thread.sleep(5000);


        // click on the add to cart button
        WebElement addToCartButton= driver.findElement(By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button"));
        addToCartButton.click();
        Thread.sleep(5000);


        // click on the commander button in the pop up
        WebElement commanderButton= driver.findElement(By.cssSelector("#blockcart-modal > div > div > div > div.col-xs-12.cart-content > div > div > a"));
        commanderButton.click();
        Thread.sleep(5000);

        // click on the commander button in the cart page
        WebElement confirmerCommandeButton= driver.findElement(By.cssSelector("#main > div > div > div.checkout.cart-detailed-actions.card-block > div > a"));
        confirmerCommandeButton.click();
        Thread.sleep(5000);
    }
}
