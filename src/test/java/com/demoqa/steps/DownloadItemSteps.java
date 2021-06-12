package com.demoqa.steps;

import com.demoqa.pages.DownloadPage;
import com.demoqa.pages.ElementsMenuPage;
import com.demoqa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class DownloadItemSteps {
    private HomePage homePage;
    private ElementsMenuPage elementsMenuPage;
    private DownloadPage downloadPage;
    @Step
    public void navigateToDownloadPage() {
        homePage.open();
        homePage.clickOnElementsButton();
    }
        @Step
       public void clickOnDOwLink() {
            elementsMenuPage.clickOnDownloadUploadLink();
        }

    @Step
    public void downloadFile(){
        downloadPage.setDownloadButton();
    }
    @Step
    public void checkIfFileIsDownloaded(String fileName){
        Assert.assertTrue(fileName.equals(downloadPage.isFileDownloaded(fileName)));
    }
}
