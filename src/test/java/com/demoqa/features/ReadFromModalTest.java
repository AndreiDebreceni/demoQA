package com.demoqa.features;

import com.demoqa.steps.GenerateModalSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class ReadFromModalTest extends BaseTest {
    @Steps
    private GenerateModalSteps generateModalSteps;
    @Test
    public void readTextFromModal(){
        generateModalSteps.navigateToModalPage();
        generateModalSteps.generateModal();
        generateModalSteps.confirmModalText("This is a small modal. It has very less content");
    }

}
