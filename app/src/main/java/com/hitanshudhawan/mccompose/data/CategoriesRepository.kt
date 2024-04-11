package com.hitanshudhawan.mccompose.data

import com.hitanshudhawan.mccompose.model.Category

object CategoriesRepository {

    fun getCategoriesData(): List<Category> {
        return listOf(
            Category(
                id = 1,
                name = "Fête",//tsy aiko zzzz
                //mtest
                image = ""
            ),
            Category(
                id = 2,
                name = "Sport",
                image =""
            ),
            Category(
                id = 3,
                name = "Conférence",
                image = ""
            ),
            Category(
                id = 4,
                name = "Concours",
                image = ""
            ),
            Category(
                id = 5,
                name = "Sponsoring",
                image = ""
            ),
            Category(
                id = 6,
                name = "Céremonie",
                image = ""
            )
        )
    }

}