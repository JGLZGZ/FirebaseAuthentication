package com.estholon.analytics.domain.usecases

import com.estholon.analytics.domain.models.AnalyticsModel

interface SendEventUseCase {

    operator fun invoke(analytics: AnalyticsModel)

}