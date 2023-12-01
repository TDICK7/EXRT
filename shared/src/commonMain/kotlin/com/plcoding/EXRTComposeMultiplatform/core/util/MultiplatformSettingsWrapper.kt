package com.plcoding.EXRTComposeMultiplatform.core.util

import com.russhwolf.settings.Settings

expect class MultiplatformSettingsWrapper {
    fun createSettings(): Settings
}
