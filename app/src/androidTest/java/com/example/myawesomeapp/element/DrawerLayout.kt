package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myawesomeapp.R

class DrawerLayout {
    private val drawerLayoutID = R.id.drawer_layout

    val drawerLayout: ViewInteraction
        get() {
            return onView(withId(drawerLayoutID))
        }
}