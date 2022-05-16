package com.kizitonwose.calendarview.model

data class CalendarDayState(
    val todayOrLater: Boolean,
    val dateIsSelected: Boolean,
    val isFirstRangeDay: Boolean,
    val isFullBlockingDay: Boolean,
)
