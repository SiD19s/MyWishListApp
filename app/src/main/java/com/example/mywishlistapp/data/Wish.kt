package com.example.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long  = 0L,
    @ColumnInfo(name="wish-title")
    val title: String = "",
    @ColumnInfo(name="wish-desc")
    val description : String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Samsung watch 6", description = "an Android Watch"),
        Wish(title = "Samsung galaxy 23Fe", description = "an Android Phone"),
        Wish(title = "Samsung Galaxy book 2 pro", description = "an Windows Laptop")
    )
}
