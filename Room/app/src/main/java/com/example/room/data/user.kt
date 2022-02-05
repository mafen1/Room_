package com.example.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userTable")
public data class User(
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name: String,
    val female:String,
    val age: Int
)
