package com.demoqa.features;

import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import com.demoqa.steps.TextBoxSteps;
import com.demoqa.utils.BaseTest;

public class TextBoxTest extends BaseTest {
    @Steps
    private TextBoxSteps textBoxSteps;
    @Test
    public void submitTextBox() throws InterruptedException {

        textBoxSteps.navigateToTextBox();
        textBoxSteps.submitTextBox("UncleBoB", "unclebob@gmail.com",
                "planet mars", "galaxy mars");
        textBoxSteps.checkSubmitResult("Name:UncleBoB");

    }

}
