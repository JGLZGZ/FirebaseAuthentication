package com.estholon.analytics.data.datasources

import com.estholon.analytics.data.dtos.AnalyticsDto

interface AnalyticsDataSource {
    fun sendEvent(analytics: AnalyticsDto)
}