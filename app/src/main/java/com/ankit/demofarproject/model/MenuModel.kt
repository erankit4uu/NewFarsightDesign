package com.ankit.demofarproject.model

object MenuModel {

    data class MainMenuModel(
        val title : String,
        val innerList : List<InnerMenuModel>
    )

    data class InnerMenuModel(
        val title : String,
        val image : Int
    )
}