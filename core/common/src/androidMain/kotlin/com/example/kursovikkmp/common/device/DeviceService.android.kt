package com.example.kursovikkmp.common.device

actual class DeviceService {
    actual fun openUrl(url: String) {
    }

    actual fun isIOS(): Boolean = false

    actual val osType: OsType = OsType.Android
}
