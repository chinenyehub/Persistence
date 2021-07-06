package com.chinenye.persistence

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

class ShoppingModel (
    val category: String,
            val description: String,

                    @PrimaryKey(autoGenerate = true)
                    val uid:Int = 0
)