package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SlideshowScreen

class SlideshowScreenStep {
    private val slideshowScreen = SlideshowScreen()

    fun checkSlideshowScreenIsDisplayed() {
        slideshowScreen.slideshowScreen.check(matches(isDisplayed()))
    }
}