package com.roynaldi19.dc4_02activitytransition.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: String
) : Parcelable
