package com.shahroz.kmmpg

import com.shahroz.kmmpg.cache.AppDatabase
import com.shahroz.kmmpg.entity.HockeyPlayer

internal class DataBaseHelper(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase(databaseDriverFactory.createDriver())
    private val dbQuery = database.appDatabaseQueries

    internal fun getAllPlayers(): List<HockeyPlayer> {
        return dbQuery.selectAll(mapper = ::HockeyPlayer).executeAsList()
    }

    internal fun insertDummyPlayer() {
        dbQuery.insertFullPlayerObject()
    }
}