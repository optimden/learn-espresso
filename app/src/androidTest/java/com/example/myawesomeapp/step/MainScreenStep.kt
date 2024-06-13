package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MainScreenElement

class MainScreenStep {
    private val mainElement = MainScreenElement()

    fun checkMainScreenTextIsDisplayed() {
        mainElement.mainScreenText().check(matches(isDisplayed()))
        mainElement.mainScreenToolbarText().check(matches(isDisplayed()))
        mainElement.mainScreenOptionsButtonElement().check(matches(isDisplayed()))
    }

    fun clickOnPanelOfNavigationFromMainScreen() {
        mainElement.mainScreenNavigationButtonElement().perform(click())
    }

    fun checkMailButtonIsDisplayed() {
        mainElement.mailButtonElement().check(matches(isDisplayed()))
    }

    fun clickOnMailButton() {
        mainElement.mailButtonElement().perform(click())
    }

    fun checkSnackBarIsNotDisplayed() {
        mainElement.snackBarElement().check(doesNotExist())
    }

    fun swipeSnackBar() {
        mainElement.snackBarElement().perform(swipeRight())
    }

    fun checkSnackBarTextIsDisplayed() {
        mainElement.snakBarText().check(matches(isDisplayed()))
    }
}
