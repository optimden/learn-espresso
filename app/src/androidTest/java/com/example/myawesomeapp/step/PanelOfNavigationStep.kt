package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.action.ViewActions.click
import com.example.myawesomeapp.element.PanelOfNavigation

class PanelOfNavigationStep {

    private val navPanel = PanelOfNavigation()

    fun panelOfNavigationTextIsDisplayed() {
        navPanel.navigationPanelText().check(matches(isDisplayed()))
    }

    fun callSlideshowScreenFromNavigationPanel() {

        navPanel.navigationPanelSlideshowButton().perform(click())
    }

}