package com.example.myawesomeapp.element

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.Espresso.onView
import org.hamcrest.core.AllOf.allOf
import com.example.myawesomeapp.R
import androidx.test.espresso.matcher.ViewMatchers.withId
import android.widget.Toolbar
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription


class SlideshowScreen {

    fun slideshowScreenText(): ViewInteraction {
        return onView(
            allOf(
                //check navibar and screen (doesn't work text checking on Toolbar)
                //isDescendantOfA(
                //   allOf(
                //    isAssignableFrom(Toolbar::class.java),
                //     withText("Slideshow")
                // )
                // ),
                withId(R.id.text_slideshow),

                )
        )
    }
}