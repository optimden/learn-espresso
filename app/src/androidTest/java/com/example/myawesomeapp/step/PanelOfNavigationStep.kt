package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.PanelOfNavigationElement

class PanelOfNavigationStep {
    private val navPanel = PanelOfNavigationElement()

    fun checkPanelOfNavigationTextIsDisplayed() {
        navPanel.navigationPanelText().check(matches(isDisplayed()))
    }

    fun checkUserEmailIsDisplayed() {
        navPanel.headerUserEmailElement().check(matches(isDisplayed()))
    }

    fun checkPanelOfNavigationButtonsIsDisplayed() {
        navPanel.gallleryButtonElement().check(matches(isDisplayed()))
        navPanel.slideshowButtonElement().check(matches(isDisplayed()))
        navPanel.homeButtonElement().check(matches(isDisplayed()))
    }

    fun clickOnSlideshowScreenFromNavigationPanel() {
        navPanel.slideshowButtonElement().perform(click())
    }

    fun checkHeaderOfNavigationPanelIsDisplayed() {
        navPanel.headerUserPicturesElement().check(matches(isDisplayed()))
        navPanel.headerUserPicturesElement().check(matches(isDisplayed()))
    }

    fun clickOnHomeScreenButton() {
        navPanel.homeButtonElement().perform(click())
    }
}
