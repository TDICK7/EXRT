package com.plcoding.EXRTComposeMultiplatform.profile.data

/*import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.exrt.exrtcomposemultiplatform.database.ExrtDatabase
import com.plcoding.EXRTComposeMultiplatform.profile.domain.Profile
import com.plcoding.EXRTComposeMultiplatform.profile.domain.ProfileDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SqlDelightProfileDataSource(db: ExrtDatabase): ProfileDataSource {
    private val queries = db.profileQueries
    override fun getProfile(): Flow<List<Profile>> {
        return queries
            .getProfile()
            .asFlow()
            .mapToList(Dispatchers.IO)
            .map {profilesEnitites ->
                profilesEnitites.map { profileEntity ->
                    profileEntity.toProfile()
                }
            }
    }

    override suspend fun insertProfile(profile: Profile) {
        //queries.
    }

    override suspend fun deleteProfile(id: Long) {
        TODO("Not yet implemented")
    }
}
*/
