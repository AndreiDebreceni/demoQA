package com.demoqa.features;

import com.demoqa.steps.SetTimeAndDateSteps;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class SetTimeAndDateTest extends BaseTest {
    @Steps
    private SetTimeAndDateSteps setTimeAndDateSteps;
    @Test
    public void setTimeAndDate(){
        setTimeAndDateSteps.navigateToDatePickerPage();
        setTimeAndDateSteps.setTimeAndDate();
        setTimeAndDateSteps.validDayTime("June 19, 2021 1:15 PM");
    }
}
