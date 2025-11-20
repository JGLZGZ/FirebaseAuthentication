package com.estholon.analytics.di

import com.estholon.analytics.data.datasources.AnalyticsDataSource
import com.estholon.analytics.data.datasources.FirebaseAnalyticsDataSource
import com.estholon.analytics.data.mappers.AnalyticsMapper
import com.estholon.analytics.data.repositories.AnalyticsRepositoryImpl
import com.estholon.analytics.domain.repositories.AnalyticsRepository
import com.estholon.analytics.domain.usecases.SendEventUseCase
import com.estholon.analytics.domain.usecases.SendEventUseCaseImpl
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class FirebaseAnalyticsModule {
    @Binds
    @Singleton
    abstract fun bindAnalyticsDataSource(
        firebaseAnalyticsDataSource: FirebaseAnalyticsDataSource
    ): AnalyticsDataSource

    @Binds
    @Singleton
    abstract fun bindAnalyticsRepository(
        analyticsRepositoryImpl: AnalyticsRepositoryImpl
    ): AnalyticsRepository

    @Binds
    @Singleton
    abstract fun provideSendEventUseCase(
        sendEventUseCaseImpl: SendEventUseCaseImpl
    ): SendEventUseCase

    companion object {

        @Singleton
        @Provides
        fun provideFirebaseAnalytics() = Firebase.analytics

        @Provides
        @Singleton
        fun provideAnalyticsMapper() : AnalyticsMapper = AnalyticsMapper()

    }

}