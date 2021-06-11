package com.demoqa.features;

import com.demoqa.steps.DownloadItemSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;



public class DownloadTest extends BaseTest {
    @Steps
    private DownloadItemSteps downloadItemSteps;
    @Test
    public void downloadFileTest(){
        downloadItemSteps.navigateToDownloadPage();
        downloadItemSteps.clickOnDOwLink();
        downloadItemSteps.downloadFile();
        downloadItemSteps.checkIfFileIsDownloaded();
    }
}
