package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import com.example.myawesomeapp.element.MainScreenElement
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed

class MainScreenStep {
    private val mainScreenElement = MainScreenElement()

    fun checkMainScreenIsDisplayed() {
        mainScreenElement.mainScreenElement
            .check(matches(isDisplayed()))
    }
}