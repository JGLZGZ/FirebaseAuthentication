package com.estholon.firebaseauthentication.data.repositories;

import com.estholon.firebaseauthentication.data.datasources.analytics.AnalyticsDataSource;
import com.estholon.firebaseauthentication.data.mapper.AnalyticsMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AnalyticsRepositoryImpl_Factory implements Factory<AnalyticsRepositoryImpl> {
  private final Provider<AnalyticsDataSource> analyticsDataSourceProvider;

  private final Provider<AnalyticsMapper> analyticsMapperProvider;

  public AnalyticsRepositoryImpl_Factory(Provider<AnalyticsDataSource> analyticsDataSourceProvider,
      Provider<AnalyticsMapper> analyticsMapperProvider) {
    this.analyticsDataSourceProvider = analyticsDataSourceProvider;
    this.analyticsMapperProvider = analyticsMapperProvider;
  }

  @Override
  public AnalyticsRepositoryImpl get() {
    return newInstance(analyticsDataSourceProvider.get(), analyticsMapperProvider.get());
  }

  public static AnalyticsRepositoryImpl_Factory create(
      Provider<AnalyticsDataSource> analyticsDataSourceProvider,
      Provider<AnalyticsMapper> analyticsMapperProvider) {
    return new AnalyticsRepositoryImpl_Factory(analyticsDataSourceProvider, analyticsMapperProvider);
  }

  public static AnalyticsRepositoryImpl newInstance(AnalyticsDataSource analyticsDataSource,
      AnalyticsMapper analyticsMapper) {
    return new AnalyticsRepositoryImpl(analyticsDataSource, analyticsMapper);
  }
}
