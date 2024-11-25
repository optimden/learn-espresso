package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.core.AllOf.allOf
import com.example.myawesomeapp.R

class FloatingActionButton {
    private val fabButtonNotificationTextID = com.google.android.material.R.id.snackbar_text
    private val fabButtonNotificationText = "Replace with your own action"
    private val floatingActionButtonID = R.id.fab

    val floatingActionButton: ViewInteraction
        get() {
            return onView(withId(floatingActionButtonID))
        }

    val floatingActionButtonNotification: ViewInteraction
        get() {
            return onView(
                allOf(
                withId(fabButtonNotificationTextID),
                withText(fabButtonNotificationText)
                )
            )
        }
}