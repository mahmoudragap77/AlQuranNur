package com.training.alqurannur.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("englishName")
    val englishName: String? = null,
    @SerializedName("englishNameTranslation")
    val englishNameTranslation: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("number")
    val number: Int? = null,
    @SerializedName("numberOfAyahs")
    val numberOfAyahs: Int? = null,
    @SerializedName("revelationType")
    val revelationType: String? = null
)