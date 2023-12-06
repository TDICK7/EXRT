package com.exrtcoding.EXRTComposeMultiplatform.core.di

import org.koin.core.module.Module
import org.koin.dsl.module

fun commonModule() = module {
}

expect fun platformModule(): Module
