package com.dicoding.tourismapp.core.data.source.remote.network

import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import retrofit2.http.GET

interface ApiService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    suspend fun getList(): ListTourismResponse
}
