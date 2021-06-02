package com.demoqa.features;

import com.demoqa.steps.SelectItemCheckBoxStep;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SelectItemCheckBoxTest extends BaseTest {
    @Steps
    private SelectItemCheckBoxStep selectItemCheckBoxStep;
    @Test
    public void selectItemFromCheckBoxList() throws InterruptedException {
        selectItemCheckBoxStep.navigateToCheckBoxPage();
        selectItemCheckBoxStep.selectItemCheckBox();
        selectItemCheckBoxStep.checkSelectedItem();
        selectItemCheckBoxStep.verifycheckbox();
    }
}
