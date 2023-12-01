package com.plcoding.EXRTComposeMultiplatform.core.DI

import com.plcoding.EXRTComposeMultiplatform.core.util.MultiplatformSettingsWrapper
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single { MultiplatformSettingsWrapper().createSettings() }
}
