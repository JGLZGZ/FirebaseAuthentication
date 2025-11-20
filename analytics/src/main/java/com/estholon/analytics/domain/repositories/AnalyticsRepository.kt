package com.estholon.analytics.domain.repositories

import com.estholon.analytics.domain.models.AnalyticsModel

interface AnalyticsRepository {
    fun sendEvent(analytics: AnalyticsModel)
}