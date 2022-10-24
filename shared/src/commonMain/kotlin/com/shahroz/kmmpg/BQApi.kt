package com.shahroz.kmmpg

import com.shahroz.kmmpg.entity.HockeyPlayer

class BQApi(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = DataBaseHelper(databaseDriverFactory)

    init {
        database.insertDummyPlayer()
    }

    @Throws(Exception::class)
    fun getPlayers(): List<HockeyPlayer> {
        return database.getAllPlayers()
    }
}

