package com.acm.roomdb.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.acm.roomdb.dao.BookDao
import com.acm.roomdb.model.Book

@Database(entities = [Book::class],version = 1)//add from table to db
abstract class BookDB :RoomDatabase(){
    abstract fun bookDao(): BookDao// add from bookdao to db
}