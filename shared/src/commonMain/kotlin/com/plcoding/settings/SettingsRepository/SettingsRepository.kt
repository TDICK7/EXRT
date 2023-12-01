package com.plcoding.settings.SettingsRepository

import kotlinx.coroutines.flow.Flow

interface SettingsRepository {
    fun getAppTheme(): Flow<Int?>
}
