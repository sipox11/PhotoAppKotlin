package com.sipox11.photoappkotlin.data.model

import java.io.Serializable

/**
 * Created by jcmontero on 22/04/2018
 *
 * This class will hold the photo information
 */

data class Photo(val id: String,
                 val likes: Int,
                 val favorites: Int,
                 val tags: String,
                 val previewUrl: String,
                 val webFormatUrl: String) : Serializable {

}