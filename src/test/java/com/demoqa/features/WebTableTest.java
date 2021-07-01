package com.demoqa.features;

import com.demoqa.steps.AddWebTableSteps;
import com.demoqa.utils.BaseTest;
import com.demoqa.utils.models.Person;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;

public class WebTableTest extends BaseTest {
    @Steps
    private AddWebTableSteps addWebTableSteps;


    private Person person = new Person();
    @Before
    public void initPerson(){
        person.setFirstName("asdasdasd");
        person.setLastName("");
        person.setDepartment("");
        person.setAge("1");
        person.setEmail("");
        person.setSalary("");
    }

    @Test
    public void addNewWebTable(){
        addWebTableSteps.navigateToWebElementPage();
        addWebTableSteps.addNewWebTable();

        addWebTableSteps.insertCredentials(person);
        addWebTableSteps.submitWebTable();

        addWebTableSteps.verifyPersonDetails(person);

    }

}
