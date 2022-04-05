package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.tripadvisor.com/");


        WebElement button = driver.findElement(By.linkText("Hotels"));
        button.click();

        Thread.sleep(5000);

        //WebDriverWait wait1 = new WebDriverWait(driver, 20);
        //WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.weiIG:nth-child(1) > form:nth-child(2) > input:nth-child(1)")));
        //element1.click();
        //element1.sendKeys("Switzer");

        WebElement search = driver.findElement(By.cssSelector("body:nth-child(2) div.hrjYF:nth-child(4) div.weiIG.Z0.Wh.eoyKC.fRhqZ.eNLxe form.bmTdH.o > input.fhEMT._G.B-.z._J.Cj.R0:nth-child(1)"));
        search.click();
        search.sendKeys("Switzerland");

        Thread.sleep(5000);

        WebElement searchResult = driver.findElement(By.xpath("//div[@class='dPHgr']//div[@class='WlYyy diXIH bQCoY'][contains(text(),'Europe')]"));
        searchResult.click();

        Thread.sleep(3000);

        /*WebElement checkInDate = driver.findElement(By.cssSelector("body.rebrand_2017.js_logging.desktop_web.Hotels:nth-child(2) div.cBtAm.Za.f.e:nth-child(5) div.RGOTE._T.R2.f.e div.pCSDn div.zZROx div.ckcwd div.kAgrN div.dKBct.V div.fZVmW.q.c div.eMrph:nth-child(1) div.nZEkx.notranslate div.fylXE:nth-child(3) > div.fgeHy.Vt.Z1:nth-child(2)"));
        checkInDate.click();*/

        WebElement checkInDate = driver.findElement(By.xpath("//div[contains(@aria-label,'Mon Sep 12 2022')]"));
        checkInDate.click();

        Thread.sleep(3000);

        /*WebElement checkOutDate = driver.findElement(By.cssSelector("body.rebrand_2017.js_logging.desktop_web.Hotels:nth-child(2) div.cBtAm.Za.f.e:nth-child(5) div.RGOTE._T.R2.f.e div.pCSDn div.zZROx div.ckcwd div.kAgrN div.dKBct.V div.fZVmW.q.c div.eMrph:nth-child(1) div.nZEkx.notranslate div.fylXE:nth-child(3) > div.fgeHy.Vt.Z1:nth-child(4)"));
        checkOutDate.click();*/

        WebElement checkOutDate = driver.findElement(By.xpath("//div[contains(@aria-label,'Wed Sep 14 2022')]"));
        checkOutDate.click();

        Thread.sleep(3000);

        WebElement childSelect = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div.ccWaH.S4.z > div:nth-child(3) > div.fiDyZ._m.c.q.B1.Z.R2 > button:nth-child(3) > span"));
        childSelect.click();

        WebElement childAgeSelect = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.cJbNW.Mf.Z._V > div > div > button"));
        childAgeSelect.click();

        Thread.sleep(5000);

        WebElement childAgeYear = driver.findElement(By.xpath("//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[7]/div/div/div/div[2]/button[3]/span"));
        childAgeYear.click();

        WebElement childConfirmSelect = driver.findElement(By.cssSelector("#BODY_BLOCK_JQUERY_REFLOW > div.cBtAm.Za.f.e > div:nth-child(2) > div > div:nth-child(2) > div > div.chkmV.Mf > button"));
        childConfirmSelect.click();

        Thread.sleep(5000);

        WebElement checkBox = driver.findElement(By.cssSelector("#component_13 > div > div.dSlNe.bhcPI > div:nth-child(6) > div.czbRE > div:nth-child(4) > div > label > div > span.eLkFw > span"));
        checkBox.click();

        WebElement getTitle = driver.findElement(By.cssSelector("#property_264882"));
        getTitle.getText();
        System.out.println(getTitle.getText());

        driver.quit();

    }
}
