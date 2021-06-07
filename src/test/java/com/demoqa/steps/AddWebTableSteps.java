package com.demoqa.steps;

import com.demoqa.pages.ElementsMenuPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.WebTablePage;
import net.thucydides.core.annotations.Step;

public class AddWebTableSteps {
    private HomePage homePage;
    private ElementsMenuPage elementsMenuPage;
    private WebTablePage webTablePage;
    @Step
    public void navigateToWebElementPage(){
        homePage.open();
        homePage.clickOnElementsButton();
        elementsMenuPage.clickOnWebTablesLink();

    }
    @Step
    public void addNewWebTable() {
        webTablePage.addNewTable();
    }
    @Step
    public void insertCredentials(String name,String lastName,String email,String age,String salary,String departament) {
        webTablePage.setFirstNameField(name);
        webTablePage.setLastNameField(lastName);
        webTablePage.setUserEmail(email);
        webTablePage.setAgeField(age);
        webTablePage.setSalaryField(salary);
        webTablePage.setDepartamentField(departament);
    }
    @Step
    public void submitWebTable(){

        webTablePage.submitButton();

    }
    @Step
    public void checkWebTableInList(String text){
        webTablePage.isProductInList(text);
    }
}
