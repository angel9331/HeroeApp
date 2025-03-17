package com.example.heroeapp.data

import com.google.gson.annotations.SerializedName
import java.util.concurrent.Flow.Publisher

class SuperheroResponse (
    val response: String,
    val results: List<Superhero>
) {

}

class Superhero (
    val id: String,
    val name: String,
    val image: Image

)
class Biography (
    val publisher: String,
    @SerializedName ("full-name")

)




    {


}

class Image (val url: String)