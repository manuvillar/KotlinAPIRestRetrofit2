package es.iesoretania.ejemploapirestretrofit2.api

import com.google.gson.annotations.SerializedName

data class DogResponse (
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
    )