package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class HomeScreen {
    val floatingActionButton = FloatingActionButton()

    private val homeScreenTextID = R.id.text_home
    private val homeScreenText = "This is home Fragment"

    val centralScreenText: ViewInteraction
        get() {
            return onView(
                allOf(
                    withId(homeScreenTextID),
                    withText(homeScreenText)
                )
            )
        }
}