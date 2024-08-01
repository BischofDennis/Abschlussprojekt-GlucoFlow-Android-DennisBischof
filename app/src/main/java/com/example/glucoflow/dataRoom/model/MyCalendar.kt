package com.example.glucoflow.dataRoom.model

import androidx.room.Entity
import androidx.room.PrimaryKey
/**@Entity
 * Gibt an, dass aus dieser Klasse eine Tabelle für die Datenbank generiert werden kann
 *
 * @PrimaryKey(autoGenerate = true)
 * Gibt an, dass die nachfolgende Variable als Primärschlüssel dient und, wenn nicht angegeben,
 * eine Id generiert werden soll
 */
@Entity
data class MyCalendar (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val date: String,
    val time: String,
    val haufigkeit: String? = null
)