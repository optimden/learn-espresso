package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MainScreenElement
import com.example.myawesomeapp.element.ToolbarElement

class MainScreenStep {
    private val mainElement = MainScreenElement()
    private val toolbarElement = ToolbarElement()

    fun checkMainScreenTextIsDisplayed() {
        mainElement.mainScreenText().check(matches(isDisplayed()))
        toolbarElement.toolBarText("Home").check(matches(isDisplayed()))
        mainElement.mainScreenOptionsButtonElement().check(matches(isDisplayed()))
    }

    fun checkMailButtonIsDisplayed() {
        mainElement.mailButtonElement().check(matches(isDisplayed()))
    }

    fun clickOnMailButton() {
        mainElement.mailButtonElement().perform(click())
    }
}
