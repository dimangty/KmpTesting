package com.example.kursovikkmp.gpt.feature.home

import app.cash.turbine.test
import com.example.kursovikkmp.gpt.feature.testutil.BaseViewModelCommonTest
import kotlin.test.Test
import kotlin.test.assertEquals

class HomeViewModelCommonTest : BaseViewModelCommonTest() {

    @Test
    fun initScreenData_updatesTabsState() = kotlinx.coroutines.test.runTest {
        // Given
        val viewModel = com.example.kursovikkmp.feature.home.HomeViewModel()

        // When
        viewModel.initScreenData()

        // Then
        viewModel.flowState.test {
            val state = awaitItem()
            assertEquals(4, state.tabs.size)
            cancelAndIgnoreRemainingEvents()
        }
    }
}
