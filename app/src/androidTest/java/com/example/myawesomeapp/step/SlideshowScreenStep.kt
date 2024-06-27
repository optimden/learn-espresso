package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SlideshowScreenElement
import com.example.myawesomeapp.element.ToolbarElement

class SlideshowScreenStep {
    private val slideshowScreen = SlideshowScreenElement()
    private val toolbar = ToolbarElement()

    fun checkSlideshowScreenTextIsDisplayed() {
        slideshowScreen.slideshowScreenText().check(matches(isDisplayed()))
        toolbar.toolBarText("Slideshow").check(matches(isDisplayed()))
    }
}
