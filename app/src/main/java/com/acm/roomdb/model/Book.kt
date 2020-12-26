package com.acm.roomdb.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book(
    @PrimaryKey
    @ColumnInfo(name="book_id")
    var bookID:Int,

    @ColumnInfo(name = "book_name")
    var booName:String
)