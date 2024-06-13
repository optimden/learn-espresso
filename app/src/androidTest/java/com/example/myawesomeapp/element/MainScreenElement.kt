package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import com.google.android.material.snackbar.Snackbar
import org.hamcrest.core.AllOf.allOf

class MainScreenElement {
    fun mainScreenToolbarText(): ViewInteraction =
        onView(
            allOf(
                withText("Home"),
                isDescendantOfA(withId(R.id.toolbar)),
            ),
        )

    fun mainScreenText(): ViewInteraction =
        onView(
            allOf(
                withId(R.id.text_home),
                withText("This is home Fragment"),
            ),
        )

    fun mainScreenNavigationButtonElement(): ViewInteraction =
        onView(
            withContentDescription("Открыть панель навигации"),
        )

    fun mainScreenOptionsButtonElement(): ViewInteraction =
        onView(
            withContentDescription("Ещё"),
        )

    fun mailButtonElement(): ViewInteraction =
        onView(
            withId(R.id.fab),
        )

    fun snakBarText(): ViewInteraction =
        onView(
            withText("Replace with your own action"),
        )

    fun snackBarElement(): ViewInteraction =
        onView(
            isAssignableFrom(Snackbar.SnackbarLayout::class.java),
        )
}
