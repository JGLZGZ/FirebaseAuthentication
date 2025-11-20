package com.estholon.analytics.data.repositories

import com.estholon.analytics.data.datasources.AnalyticsDataSource
import com.estholon.analytics.data.mappers.AnalyticsMapper
import com.estholon.analytics.domain.models.AnalyticsModel
import com.estholon.analytics.domain.repositories.AnalyticsRepository
import javax.inject.Inject

class AnalyticsRepositoryImpl @Inject constructor(
    private val analyticsDataSource: AnalyticsDataSource,
    private val analyticsMapper: AnalyticsMapper
) : AnalyticsRepository {

    override fun sendEvent(analytics: AnalyticsModel) {
        val analyticsDto = analyticsMapper.analyticsDomainToDto(analytics)
        analyticsDataSource.sendEvent(analyticsDto)
    }

}