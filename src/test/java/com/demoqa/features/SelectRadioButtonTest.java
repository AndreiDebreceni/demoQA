package com.demoqa.features;

import com.demoqa.steps.SelectRadioButtonSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SelectRadioButtonTest extends BaseTest {
    @Steps
    private SelectRadioButtonSteps selectRadioButtonSteps;
    @Test
    public void selectRadioButton(){
        selectRadioButtonSteps.navigateToRadioBpage();
        selectRadioButtonSteps.selectRadioButton();
        selectRadioButtonSteps.checkRadioButtonIsChecked();
    }

}
