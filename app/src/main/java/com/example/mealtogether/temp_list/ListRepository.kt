package com.example.mealtogether.temp_list

object ListRepository {

    private val itemList = mutableListOf<ListItem>()


    init {
        for (i in 0 until 20) {
            val item = ListItem("Name$i", (i*2.5).toInt())
            addItem(item)
        }
    }

    private fun addItem(item: ListItem) {
        itemList.add(item)
    }

    fun getList(): MutableList<ListItem> {
        return itemList
    }
}