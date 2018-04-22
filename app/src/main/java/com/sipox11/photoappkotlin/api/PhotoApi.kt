package com.sipox11.photoappkotlin.api

import com.sipox11.photoappkotlin.data.local.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoApi {

    @GET("?key=871991-65fb0782a61d6d29c13142307&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}