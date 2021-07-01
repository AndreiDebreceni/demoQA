package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.io.File;

public class DownloadPage extends PageObject {
    @FindBy(css = "#downloadButton")
    private WebElementFacade downloadButton;

    public void setDownloadButton() {
        clickOn(downloadButton);
    }


    public String isFileDownloaded(String fileName) {
        String dirPath = "src/test/resources/downloads";
        System.out.println(new File(dirPath).getAbsolutePath());
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        for (int i = 1; i < files.length; i++) {
            if (files[i].getName().contains(fileName)) {
                System.out.println("filles: " + files[i].getName());
                return files[i].getName();
            }
        }
        return null;
    }


    public static void main(String[] args) {
//        String dirPath = "src/test/resources/downloads";
//        File dir = new File(dirPath);
        DownloadPage dp = new DownloadPage();
        System.out.println(dp.isFileDownloaded("text.txt"));

    }


}
