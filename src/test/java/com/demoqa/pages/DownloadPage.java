package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.io.File;

public class DownloadPage extends PageObject {
    @FindBy(css = "#downloadButton")
    private WebElementFacade downloadButton;

    public void setDownloadButton(){
        clickOn(downloadButton);
    }
    public boolean isFileDownloaded(String fileName) {
        boolean flag = false;
        String dirPath = "C:\\Users\\dbrde\\Downloads";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) {
            System.out.println("The directory is empty");
            flag = false;
        } else {
            for (File listFile : files) {
                if (listFile.getName().contains(fileName)) {
                    System.out.println(fileName + " is present");
                    break;
                }
                flag = true;
            }
        }
        return flag;
    }
}
