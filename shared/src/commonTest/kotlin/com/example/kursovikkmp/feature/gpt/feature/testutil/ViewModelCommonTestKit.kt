package com.example.kursovikkmp.gpt.feature.testutil

import com.example.kursovikkmp.common.mvvm.LceStateManager
import com.example.kursovikkmp.feature.device.DeviceService
import com.example.kursovikkmp.feature.device.ResourceService
import com.example.kursovikkmp.navigation.NavigationAction
import com.example.kursovikkmp.navigation.NavigationService
import dev.icerock.moko.resources.StringResource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import kotlin.test.AfterTest
import kotlin.test.BeforeTest

@OptIn(ExperimentalCoroutinesApi::class)
abstract class BaseViewModelCommonTest {
    protected val dispatcher = StandardTestDispatcher()

    protected lateinit var navigationService: TestNavigationService
    protected lateinit var resourceService: TestResourceService
    protected lateinit var deviceService: TestDeviceService

    @BeforeTest
    open fun baseSetUp() {
        Dispatchers.setMain(dispatcher)
        stopKoin()

        navigationService = TestNavigationService()
        resourceService = TestResourceService()
        deviceService = TestDeviceService()

        startKoin {
            modules(
                module {
                    single<NavigationService> { navigationService }
                    single<ResourceService> { resourceService }
                    single<DeviceService> { deviceService }
                    factory { LceStateManager() }
                }
            )
        }
    }

    @AfterTest
    open fun baseTearDown() {
        stopKoin()
        Dispatchers.resetMain()
    }
}

class TestNavigationService : NavigationService {
    private val _currentDestination = MutableStateFlow("")
    private val _actions = MutableSharedFlow<NavigationAction>(extraBufferCapacity = 32)
    val actions = _actions.asSharedFlow()
    val recordedActions = mutableListOf<NavigationAction>()

    override val currentDestination: StateFlow<String> = _currentDestination

    override fun navigate(action: NavigationAction) {
        recordedActions += action
        _actions.tryEmit(action)
    }

    override fun navigateBack() {
        recordedActions += NavigationAction.NavigateBack
        _actions.tryEmit(NavigationAction.NavigateBack)
    }

    override fun <T> setPreviousBackStackEntry(key: String, value: T) = Unit
    override fun <T> getCurrentBackStackEntry(key: String): T? = null
    override fun <T> clearCurrentBackStackEntry(key: String) = Unit
}

class TestResourceService : ResourceService {
    override fun getString(stringRes: StringResource): String = "value"
    override fun getString(stringRes: StringResource, args: List<String>): String = "value"
}

class TestDeviceService : DeviceService {
    val openedUrls = mutableListOf<String>()
    val supportMails = mutableListOf<String>()

    override fun isAndroid(): Boolean = true
    override fun isIOS(): Boolean = false

    override fun openMailToSupport(mail: String) {
        supportMails += mail
    }

    override fun openUrl(urlString: String) {
        openedUrls += urlString
    }
}
