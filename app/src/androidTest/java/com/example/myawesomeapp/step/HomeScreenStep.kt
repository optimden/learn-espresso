package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import com.example.myawesomeapp.element.HomeScreen
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.Toolbar

class HomeScreenStep {
    private val homeScreen = HomeScreen()
    private val toolbar = Toolbar("Home")

    // Just for the further refactoring:
    // Using 'check' in TestCase name is a bad practice
    // Usually it can be omitted due to it's considered under the hood

    fun checkHomeScreenIsDisplayed() {
        homeScreen.centralScreenText
            .check(matches(isDisplayed()))
    }

    fun checkToolbarIsDisplayed() {
        toolbar.toolbar
            .check(matches(isDisplayed()))
    }

    fun checkToolbarTitleIsCorrect() {
        toolbar.toolbarTitle
            .check(matches(isDisplayed()))
    }

    fun checkToolbarContainsMenuButton() {
        toolbar.toolbarMenuButton
            .check(matches(isDisplayed()))
    }

    fun checkToolbarContainsOptionsButton() {
        toolbar.toolbarOptionsButton
            .check(matches(isDisplayed()))
    }

    fun checkFloatingActionButtonIsDisplayed() {
        homeScreen.floatingActionButton.floatingActionButton
            .check(matches(isDisplayed()))
    }

    fun clickOnFloatingActionButton() {
        homeScreen.floatingActionButton.floatingActionButton
            .perform(click())
    }

    fun checkFloatingActionButtonNotificationIsDisplayed() {
        homeScreen.floatingActionButton.floatingActionButtonNotification
            .check(matches(isDisplayed()))
    }

    fun checkFloatingActionButtonNotificationNotDisplayed() {
        homeScreen.floatingActionButton.floatingActionButtonNotification
            .check(doesNotExist())
    }

    fun smashFloatingActionButtonNotification() {
        homeScreen.floatingActionButton.floatingActionButtonNotification
            .perform(swipeRight())
    }
}