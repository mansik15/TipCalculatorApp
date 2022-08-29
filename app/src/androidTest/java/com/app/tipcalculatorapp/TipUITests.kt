package com.app.tipcalculatorapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.app.tipcalculatorapp.ui.theme.TipCalculatorAppTheme
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TipCalculatorAppTheme {
                TipTimeScreen()
            }
        }
        composeTestRule.onNodeWithText("Bill Amount")
            .performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        composeTestRule.onNodeWithText("Tip amount: $2.00").assertExists()
    }

}