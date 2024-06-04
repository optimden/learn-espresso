package com.example.myawesomeapp.step
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.action.ViewActions.click
import com.example.myawesomeapp.element.SlideshowScreen


class SlideshowScreenStep {

    private val slideshowScreen = SlideshowScreen()

    fun checkSlideshowscreenTextIsDisplayed(){
        slideshowScreen.slideshowScreenText().check(matches(isDisplayed()))
    }

}