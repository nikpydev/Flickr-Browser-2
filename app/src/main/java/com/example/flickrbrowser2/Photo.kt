package com.example.flickrbrowser2

/**
 * This is a class that holds all the data relating to a single photo
 * So it's gonna contain a few properties and very little else
 */

class Photo(
    val title: String,
    val author: String,
    val authorId: String,
    val link: String,
    val tags: String,
    val image: String
) {

    override fun toString(): String {
        return "Photo(title='$title', author='$author', authorId='$authorId', link='$link', tags='$tags', image='$image')"
    }
}