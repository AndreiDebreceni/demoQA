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
//    public Object isFileDownloaded(String fileName) {
//        String dirPath = "C:\\Users\\dbrde\\Downloads";
//        File dir = new File(dirPath);
//        File[] files = dir.listFiles();
//        Assert.assertNotNull(dir.listFiles());
//        System.out.println("list: " +dir.listFiles());
//        for (File listFile : files) {
//            if(listFile.toString().contains("sampleFile.jpeg")){
//                System.out.println("filles:   " +listFile.getName().toString());
//                listFile.getName();
//            }
//        }
//
//
//        return "";
//    }

    public String isFileDownloaded(String fileName){
        String dirPath = "C:\\Users\\dbrde\\Downloads";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        for (int i = 1; i < files.length; i++) {
         if(files[i].getName().contains(fileName)) {
            System.out.println("filles: " + files[i].getName());
           return files[i].getName();
         }
      }
        return null;
    }



}
