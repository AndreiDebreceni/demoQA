package com.demoqa.steps;

import com.demoqa.pages.CheckBoxPage;
import com.demoqa.pages.ElementsPage;
import com.demoqa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.junit.Assert;

public class SelectItemCheckBoxStep {
    private HomePage homePage;
    private ElementsPage elementsPage;
    private CheckBoxPage checkBoxPage;

    @Step
    public void navigateToCheckBoxPage(){
        homePage.open();
        homePage.clickOnElementsButton();
        elementsPage.clickOnCheckBoxLing();
    }
    @Step
    public void selectItemCheckBox(){
        checkBoxPage.clickToggleList();
        checkBoxPage.clickToggleDocuments();
        checkBoxPage.clickToggleWorkSpace();
        checkBoxPage.setCheckBoxReact();
    }
    @Step
    public void checkSelectedItem(){
        checkBoxPage.checkResultSelectedItem();
    }
    @Step
    public void verifycheckbox() {
        Assert.assertTrue(checkBoxPage.chCheckBox());
    }
}
