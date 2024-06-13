package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class PanelOfNavigationElement {
    fun navigationPanelText(): ViewInteraction =
        onView(
            allOf(
                withText("Android Studio"),
                isDescendantOfA(withId(R.id.nav_view)),
            ),
        )

    fun headerUserPicturesElement(): ViewInteraction =
        onView(
            withId(R.id.imageView),
        )

    fun headerUserEmailElement(): ViewInteraction =
        onView(
            withId(R.id.textView),
        )

    fun slideshowButtonElement(): ViewInteraction =
        onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.nav_view)),
            ),
        )

    fun gallleryButtonElement(): ViewInteraction =
        onView(
            allOf(
                withText("Gallery"),
                isDescendantOfA(withId(R.id.nav_view)),
            ),
        )

    fun homeButtonElement(): ViewInteraction =
        onView(
            allOf(
                withText("Home"),
                isDescendantOfA(withId(R.id.nav_view)),
            ),
        )
}
