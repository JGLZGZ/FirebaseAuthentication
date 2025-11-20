package com.estholon.analytics.domain.usecases

import com.estholon.analytics.domain.models.AnalyticsModel
import com.estholon.analytics.domain.repositories.AnalyticsRepository
import javax.inject.Inject

class SendEventUseCaseImpl @Inject constructor(
    private val analyticsRepository: AnalyticsRepository
) : SendEventUseCase {
    override operator fun invoke (analytics: AnalyticsModel) {
        analyticsRepository.sendEvent(analytics)
    }
}