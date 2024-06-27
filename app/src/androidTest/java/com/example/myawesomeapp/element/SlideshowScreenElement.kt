package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myawesomeapp.R

class SlideshowScreenElement {
    fun slideshowScreenText(): ViewInteraction =
        onView(
            withId(R.id.text_slideshow),
        )
}
