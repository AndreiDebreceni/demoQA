package com.demoqa.steps;

import com.demoqa.pages.ElementsMenuPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.WebTablePage;
import com.demoqa.utils.models.Person;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

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
   public void setPersonData(){

   }

    @Step
    public void insertCredentials(Person person) {
        webTablePage.setFirstNameField(person.getFirstName());
        webTablePage.setLastNameField(person.getLastName());
        webTablePage.setUserEmail(person.getEmail());
        webTablePage.setAgeField(person.getAge());
        webTablePage.setSalaryField(person.getSalary());
        webTablePage.setDepartamentField(person.getDepartment());
    }
    @Step
    public void submitWebTable(){

        webTablePage.submitButton();

    }
    @Step
    public void checkWebTableInList(String text){
        Assert.assertTrue(webTablePage.isElementInList(text));
    }

    @Step
    public void verifyPersonDetails(Person expectedPerson){
        Assert.assertEquals(expectedPerson.toString(), webTablePage.getDetailsFromPage().toString());

    }


}

