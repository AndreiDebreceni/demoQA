package com.demoqa.features;

import com.demoqa.steps.AddWebTableSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class WebTableTest extends BaseTest {
    @Steps
    private AddWebTableSteps addWebTableSteps;
    @Test
    public void addNewWebTable(){
        addWebTableSteps.navigateToWebElementPage();
        addWebTableSteps.addNewWebTable();
        addWebTableSteps.insertCredentials("alex","ionescu",
                "name@gmail.com","30","1300","it");
        addWebTableSteps.submitWebTable();
        addWebTableSteps.checkWebTableInList("cucu");

    }

}
