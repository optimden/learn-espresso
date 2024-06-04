package com.example.myawesomeapp.element


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R

import org.hamcrest.core.AllOf.allOf


class PanelOfNavigation {

    fun navigationPanelText(): ViewInteraction {
        return onView(
            allOf(
                withText(R.string.menu_slideshow),
                withText(R.string.menu_home),
                withText(R.string.menu_gallery)
            )
        )

    }

    fun navigationPanelSlideshowButton(): ViewInteraction {
        return onView(
            withText(R.string.menu_slideshow)
        )
    }


}