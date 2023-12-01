package com.plcoding.EXRTComposeMultiplatform.core.util

import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings
import platform.Foundation.NSUserDefaults

actual class MultiplatformSettingsWrapper {
    actual fun createSettings(): Settings {
       val delegate = NSUserDefaults.standardUserDefaults
        return NSUserDefaultsSettings(delegate)
    }
}
