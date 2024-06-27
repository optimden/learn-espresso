package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SnackebarElement

class SnackebarStep {
    private val snackbar = SnackebarElement()

    fun checkSnackBarIsNotDisplayed() {
        snackbar.snackBarElement().check(doesNotExist())
    }

    fun swipeSnackBar() {
        snackbar.snackBarElement().perform(swipeRight())
    }

    fun checkMainScreenSnackBarTextIsDisplayed() {
        snackbar.snackBarText("Replace with your own action").check(matches(isDisplayed()))
    }

    fun checkFirstItemGalleryTextIsDisplayed() {
        snackbar.snackBarText("Item #1 clicked successfully!").check(matches(isDisplayed()))
    }

    fun checkLastItemGalleryTextIsDisplayed() {
        snackbar.snackBarText("Item #10 clicked successfully!").check(matches(isDisplayed()))
    }
}
