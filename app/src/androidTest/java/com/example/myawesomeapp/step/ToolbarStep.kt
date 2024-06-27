package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions
import com.example.myawesomeapp.element.ToolbarElement

class ToolbarStep {
    private val toolbarElement = ToolbarElement()

    fun clickOnPanelOfNavigation() {
        toolbarElement.navigationButtonElement().perform(ViewActions.click())
    }
}
