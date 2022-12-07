package com.dicoding.tourismapp.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tourism(
    val tourismId: String,
    val name: String,
    val description: String,
    val image: String,
    val isFavorite: Boolean
) : Parcelable