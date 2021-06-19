package com.demoqa.features;

import com.demoqa.steps.PerformSlideTest;
import com.demoqa.utils.BaseTest;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

public class ControlSliderTest extends BaseTest {
    @Steps
    private PerformSlideTest performSlideTest;
    @Test
    public void slideBar(){
        performSlideTest.navigateToSliderPage();
        performSlideTest.moveSlideBar();
        performSlideTest.getSlideValue("66");
    }
}
