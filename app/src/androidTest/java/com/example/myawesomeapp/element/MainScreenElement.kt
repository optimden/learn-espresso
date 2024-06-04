package com.example.myawesomeapp.element

import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.Espresso.onView
import org.hamcrest.core.AllOf.allOf
import com.example.myawesomeapp.R
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription


class MainScreenElement {

    fun mainScreenText(): ViewInteraction {
        return onView(
            allOf(
                withId(R.id.text_home),
                withText("This is home Fragment")
            )
        )
    }

    fun mainScreenNavigationButton(): ViewInteraction {
        return onView(
            withContentDescription("Открыть панель навигации")
        )
    }
}