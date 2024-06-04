package com.example.myawesomeapp.element


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withResourceName
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R

import org.hamcrest.core.AllOf.allOf


class PanelOfNavigation {

    fun navigationPanelText(): ViewInteraction {
        return onView(
           allOf(
               withText("Android Studio"),
               isDescendantOfA(withId(R.id.nav_view))
           )
        )

    }

    fun headerOfNavigationPanel(): ViewInteraction {
        return onView(
            withId(R.id.imageView),
        )

    }

    fun slideshowButton(): ViewInteraction {
        return onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.nav_view))
            )
        )
    }

    fun gallleryButton(): ViewInteraction {
        return onView(
            allOf(
                withText("Gallery"),
                isDescendantOfA(withId(R.id.nav_view))
            )
        )
    }

    fun homeButton(): ViewInteraction {
        return onView(
            allOf(
                withText("Home"),
                isDescendantOfA(withId(R.id.nav_view))
            )
        )
    }

}