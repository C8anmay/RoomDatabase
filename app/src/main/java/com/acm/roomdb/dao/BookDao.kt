package com.acm.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.acm.roomdb.model.Book
@Dao
interface BookDao {
    //INSERT INTO(COLUMN,COLUMN) VALUE(VALUE,VALUE)
    @Insert
    fun saveBooks(book:Book)//object from Book
    //select * from
    @Query(value = "SELECT * FROM Book")
    fun getAllBook():List<Book>//form book table row .one row is object
}