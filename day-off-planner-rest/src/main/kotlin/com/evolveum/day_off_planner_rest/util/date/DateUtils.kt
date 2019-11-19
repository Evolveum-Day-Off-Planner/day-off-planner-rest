package com.evolveum.day_off_planner_rest.util.date

import java.sql.Timestamp
import java.time.*
import java.util.*

fun LocalDateTime.toDate(): Date = Date.from(this.atZone(ZoneId.systemDefault()).toInstant())

fun LocalDate.toTimestamp(): Timestamp = Timestamp.valueOf(this.atStartOfDay())

fun LocalDate.isWeekend(): Boolean = this.dayOfWeek == DayOfWeek.SATURDAY || this.dayOfWeek == DayOfWeek.SUNDAY

data class DayStartEnd(val start: Int, val end: Int)