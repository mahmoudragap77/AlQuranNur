package com.training.alqurannur.model


import com.google.gson.annotations.SerializedName

data class QuranResponse(
    @SerializedName("data")
    val `data`: List<Data?>? = null,
    @SerializedName("code")
    val code: Int? = null,
    @SerializedName("status")
    val status: String? = null
)

