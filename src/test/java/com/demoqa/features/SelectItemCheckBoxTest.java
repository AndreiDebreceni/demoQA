package com.demoqa.features;

import com.demoqa.steps.SelectItemCheckBoxSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SelectItemCheckBoxTest extends BaseTest {
    @Steps
    private SelectItemCheckBoxSteps selectItemCheckBoxSteps;
    @Test
    public void selectItemFromCheckBoxList() {
        selectItemCheckBoxSteps.navigateToCheckBoxPage();
        selectItemCheckBoxSteps.selectItemCheckBox();
        selectItemCheckBoxSteps.checkSelectedItem();
        selectItemCheckBoxSteps.verifycheckbox();
    }
}
