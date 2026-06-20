package com.example.kursovikkmp.common.device

import platform.UIKit.UIApplication

actual class DeviceService {
    actual fun openUrl(url: String) {
        val nsUrl = platform.Foundation.NSURL.URLWithString(url) ?: return
        UIApplication.sharedApplication.openURL(nsUrl)
    }

    actual fun isIOS(): Boolean = true

    actual val osType: OsType = OsType.IOS
}
