package com.demoqa.features;

import com.demoqa.pages.ButtonsPage;
import com.demoqa.steps.RightClickOnButtonSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class RightClickTest extends BaseTest {
    @Steps
    private RightClickOnButtonSteps rightClickOnButtonSteps;
    @Test
    public void rightClickOnButton(){
        rightClickOnButtonSteps.goToButtonsPage();
        rightClickOnButtonSteps.rightClickOnButton();
        rightClickOnButtonSteps.checkIfButtonIsRClick("You have done a right click");
    }
}
