package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import org.hamcrest.core.AllOf.allOf
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.action.ViewActions.click
import com.example.myawesomeapp.element.PanelOfNavigation

class PanelOfNavigationStep {

    private val navPanel = PanelOfNavigation()

    fun panelOfNavigationTextIsDisplayed() {
        navPanel.navigationPanelText().check(matches(isDisplayed()))
    }

    fun panelOfNavigationButtonsIsDisplayed() {
            navPanel.gallleryButton().check(matches(isDisplayed()))
            navPanel.slideshowButton().check(matches(isDisplayed()))
            navPanel.homeButton().check(matches(isDisplayed()))
    }

    fun callSlideshowScreenFromNavigationPanel() {

        navPanel.slideshowButton().perform(click())
    }

    fun headerOfNavigationPanelIsDisplayed() {
        navPanel.headerUserPictures().check(matches(isDisplayed()))
        navPanel.headerUserPictures().check(matches(isDisplayed()))
    }

    fun goHomeScreen() {
        navPanel.homeButton().perform(click())
    }
}