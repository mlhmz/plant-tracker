package xyz.mlhmz.planttracker.models

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date
import org.jetbrains.exposed.v1.core.Table

object Plant : Table("plants") {
    val id = integer("id").autoIncrement()
    val name = varchar("name", 255)
    val species = varchar("species", 255).nullable()
    
    val lastWateredDate = date("last_watered_date")
    val wateringIntervalDays = integer("watering_interval_days").nullable()

    val lastFertilizedDate = date("last_fertilized_date")
    val fertilizingIntervalDays = integer("fertilizing_interval_days").nullable()

    override val primaryKey = PrimaryKey(id)
}