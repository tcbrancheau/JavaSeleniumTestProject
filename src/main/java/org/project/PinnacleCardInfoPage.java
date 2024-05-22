package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.net.PortProber;
import org.openqa.selenium.support.ui.WebDriverWait;
*/
public class PinnacleCardInfoPage {
    private final String PageURL = "https://pnfp.myapexcard.com/info";
    private final String linkTextBusinessCards = "View Business Credit Cards";
    private final String linkTextPersonalCards = "View Personal Credit Cards";

    private WebDriver pageDriver;

    public PinnacleCardInfoPage(WebDriver newDriver){
        this.pageDriver = newDriver;
    }

    public void openPage(){
        this.pageDriver.get(this.PageURL);
    }

    private WebElement getCardToggleElement(){
        WebElement toggleLink = this.pageDriver.findElement(
                By.id("productSelector_categorySwitch_link")
        );
        return toggleLink;
    }
    public String toggleCardType(String linkText){
        /*
        toggleCardType
        Input: None
        Returns: text of toggle card link to indicate
                 type of card info being shown
         */
        WebElement toggleLink = this.getCardToggleElement();

        if (toggleLink.isDisplayed()){
            if (!toggleLink.getText().equals(linkText)) {
                toggleLink.click();
            }
        }
        return toggleLink.getText();
    }

    public String viewBusinessCards(){
        return this.toggleCardType(this.linkTextBusinessCards);
    }

    public String viewPersonalCards(){
        return this.toggleCardType(this.linkTextPersonalCards);
    }

    public void clickPlusTermsConditions(String cardName){

    }

}
