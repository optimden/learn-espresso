package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class Toolbar(private val toolbarTitleText: String) {
    private val toolbarID = R.id.toolbar

    private val toolbarMenuButtonContentDescription = "Open navigation drawer"
    private val toolbarOptionsButtonContentDescription = "More options"

    val toolbar: ViewInteraction
        get() {
            return onView(withId(toolbarID))
        }

    val toolbarMenuButton: ViewInteraction
        get() {
            return onView(
                allOf(
                    withParent(withId(toolbarID)),
                    withContentDescription(toolbarMenuButtonContentDescription)
                )
            )
        }

    val toolbarOptionsButton: ViewInteraction
        get() {
            return onView(withContentDescription(toolbarOptionsButtonContentDescription))
        }

    val toolbarTitle: ViewInteraction
        get() {
            return onView(
                allOf(
                    withParent(withId(toolbarID)),
                    withText(toolbarTitleText)
                )
            )
        }
}