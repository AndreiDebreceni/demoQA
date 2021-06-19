package com.demoqa.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class DatePickerPage extends PageObject {
    @FindBy(css = "#dateAndTimePickerInput")
    private WebElementFacade dateAndTimeBox;
    @FindBy(css = " div.react-datepicker__month-dropdown-container.react-datepicker__month-dropdown-container--scroll")
    private WebElementFacade monthDropdownList;
    @FindBy(css = ".react-datepicker__month-dropdown > div:nth-of-type(1)")
    private WebElementFacade selectJanuary;
    @FindBy(css = " div.react-datepicker__year-dropdown-container.react-datepicker__year-dropdown-container--scroll")
    private WebElementFacade yearDropdownList;
    @FindBy(css = ".react-datepicker__year-dropdown > div:nth-of-type(8)")
    private WebElementFacade select2020;
    @FindBy(css = ".react-datepicker__time-list > li:nth-of-type(54)")
    private WebElementFacade setHour;
    @FindBy(css = "#dateAndTimePickerInput")
    private WebElementFacade dateTimebox;


    public void selectMonth(){
        clickOn(dateAndTimeBox);
        clickOn(monthDropdownList);
        clickOn(selectJanuary);



    }
    public void selectYear(){
        clickOn(yearDropdownList);
        clickOn(select2020);

    }
    public void setSetHour(){
        clickOn(setHour);
    }
    public String validateDateAndHour(){
        System.out.println("date and time : " + dateTimebox.getValue());
         return dateAndTimeBox.getValue().toString();

    }



}
