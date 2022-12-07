package com.dicoding.tourismapp.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TourismResponse(
    @field:SerializedName("idTeam")
    val id: String,

    @field:SerializedName("strTeam")
    val name: String,

    @field:SerializedName("strDescriptionEN")
    val description: String,

    @field:SerializedName("strTeamBadge")
    val image: String
)

