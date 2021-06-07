package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class WebTablePage extends PageObject {
    @FindBy(css = "#addNewRecordButton")
    private WebElementFacade addNewWebTable;
    @FindBy(css = "#firstName")
    private WebElementFacade firstNameField;
    @FindBy(css = "#lastName")
    private WebElementFacade lastNameField;
    @FindBy(css = "#userEmail")
    private WebElementFacade userEmailField;
    @FindBy(css = "#age")
    private WebElementFacade ageField;
    @FindBy(css = "#salary")
    private WebElementFacade salaryField;
    @FindBy(css = "#department")
    private WebElementFacade departamentField;
    @FindBy(css = "#submit")
    private WebElementFacade submitButton;
    @FindBy(css = "div.rt-table > div.rt-tbody")
    private List<WebElementFacade> listOfWebTable;
    @FindBy(css = "div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div:nth-child(4) > div > div:nth-child(1)")
    private WebElementFacade firstNameinList;

    public void addNewTable(){
        clickOn(addNewWebTable);
    }
    public void setFirstNameField(String text){
        typeInto(firstNameField, text);
    }
    public void setLastNameField(String text){
        typeInto(lastNameField, text);
    }
    public void setUserEmail(String text) {
        typeInto(userEmailField, text);
    }
    public void setAgeField(String text){
        typeInto(ageField, text);
    }
    public void setSalaryField(String text){
        typeInto(salaryField, text);
    }
    public void setDepartamentField(String text){
        typeInto(departamentField,text);
    }
    public void submitButton(){
        clickOn(submitButton);
    }

    public boolean isProductInList(String firstName){
        System.out.println("name: " + listOfWebTable.get(1).getText());
        Assert.assertNotNull(listOfWebTable);
        for (WebElementFacade element : listOfWebTable){
            if (element.findElement(By.cssSelector("div.ReactTable.-striped.-highlight > div.rt-table > div.rt-tbody > div:nth-child(4) > div > div:nth-child(1)"))
                    .getText().equals(firstName)){
                return true;
            }
        }
        return false;

    }

}
