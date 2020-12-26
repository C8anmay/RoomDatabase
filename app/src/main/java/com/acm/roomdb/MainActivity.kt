package com.acm.roomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.acm.roomdb.database.BookDB
import com.acm.roomdb.model.Book

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //create instance of database
        var db= Room.databaseBuilder(
            applicationContext,
            BookDB::class.java,
            //name of databse
            "BookDB"
        ).build()
        //runn background so may be err
        Thread{
            var book= Book(1,"Flutter")
            db.bookDao().saveBooks(book)

            db.bookDao().getAllBook().forEach {
                Log.d("Database>>","name: ${it.bookID}")
                Log.d("Database>>","name: ${it.booName}")
            }
        }.start()
    }
}