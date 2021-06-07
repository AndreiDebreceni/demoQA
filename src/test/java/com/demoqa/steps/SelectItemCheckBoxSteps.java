package com.demoqa.steps;

import com.demoqa.pages.CheckBoxPage;
import com.demoqa.pages.ElementsMenuPage;
import com.demoqa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SelectItemCheckBoxSteps {
    private HomePage homePage;
    private ElementsMenuPage elementsMenuPage;
    private CheckBoxPage checkBoxPage;

    @Step
    public void navigateToCheckBoxPage(){
        homePage.open();
        homePage.clickOnElementsButton();
        elementsMenuPage.clickOnCheckBoxLink();
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
