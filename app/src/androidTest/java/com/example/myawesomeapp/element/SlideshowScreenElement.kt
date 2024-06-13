package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class SlideshowScreenElement {
    fun slideshowScreenToolbarText(): ViewInteraction =
        onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.toolbar)),
            ),
        )

    fun slideshowScreenText(): ViewInteraction =
        onView(
            withId(R.id.text_slideshow),
        )
}
