package com.demoqa.features;

import com.demoqa.steps.ConfirmAlertMsgSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class ConfirmAlertMsgTest extends BaseTest {
    @Steps
    private ConfirmAlertMsgSteps confirmAlertMsgSteps;
    @Test
    public void confirmPageAlert(){
        confirmAlertMsgSteps.navigateToAlertPage();
        confirmAlertMsgSteps.clickAndConfirmAlertMsg();
        confirmAlertMsgSteps.checkIfAlertIsConfirmed("You selected Ok");
    }
}
