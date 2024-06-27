package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import com.google.android.material.snackbar.Snackbar

class SnackebarElement {
    fun snackBarText(snackBarText: String): ViewInteraction =
        onView(
            ViewMatchers.withText(snackBarText),
        )

    fun snackBarElement(): ViewInteraction =
        onView(
            isAssignableFrom(Snackbar.SnackbarLayout::class.java),
        )
}
