package com.shahroz.kmmpg.entity

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
data class HockeyPlayer(
    @SerialName("player_number") val playerNumber: Long,
    @SerialName("full_name") val fullName: String
)