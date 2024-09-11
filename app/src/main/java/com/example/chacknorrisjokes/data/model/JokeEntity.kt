package com.example.chacknorrisjokes.data.model

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

data class JokeEntity(
    @SerializedName("categories") val categories: ArrayList<String>?,
    @SerializedName("created_at") val createdAt: String,
    @SerializedName("icon_url") val iconUrl: String,
    @SerializedName("id") val id: String,
    @SerializedName("url") val url: String?,
    @SerializedName("value") val value: String?,
)
