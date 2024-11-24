package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myawesomeapp.R

class SlideshowScreen {
    private val slideshowScreenText = R.id.text_slideshow

    val slideshowScreen: ViewInteraction
        get() {
            return onView(withId(slideshowScreenText))
        }
}