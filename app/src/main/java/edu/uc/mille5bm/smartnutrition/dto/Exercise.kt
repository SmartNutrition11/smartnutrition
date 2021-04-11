package edu.uc.mille5bm.smartnutrition.dto

import com.google.gson.annotations.SerializedName

data class Exercise(@SerializedName("id")var id: String, @SerializedName("name") var name: String, @SerializedName("video") var videoURL: String) {
    override fun toString(): String{
        return name
    }
}