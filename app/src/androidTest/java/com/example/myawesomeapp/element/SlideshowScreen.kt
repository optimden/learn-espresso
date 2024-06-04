package com.example.myawesomeapp.element

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.Espresso.onView
import org.hamcrest.core.AllOf.allOf
import com.example.myawesomeapp.R
import androidx.test.espresso.matcher.ViewMatchers.withId
import android.widget.Toolbar
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription


class SlideshowScreen {

    fun slideshowScreenToolbarText(): ViewInteraction {
        return onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )
    }

    fun slideshowScreenText(): ViewInteraction {
        return onView(
            withId(R.id.text_slideshow)
        )
    }
}