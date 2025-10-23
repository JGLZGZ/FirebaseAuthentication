package com.estholon.firebaseauthentication.domain.usecases.analytics;

import com.estholon.firebaseauthentication.domain.repositories.AnalyticsRepository;
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
public final class SendEventUseCaseImpl_Factory implements Factory<SendEventUseCaseImpl> {
  private final Provider<AnalyticsRepository> analyticsRepositoryProvider;

  public SendEventUseCaseImpl_Factory(Provider<AnalyticsRepository> analyticsRepositoryProvider) {
    this.analyticsRepositoryProvider = analyticsRepositoryProvider;
  }

  @Override
  public SendEventUseCaseImpl get() {
    return newInstance(analyticsRepositoryProvider.get());
  }

  public static SendEventUseCaseImpl_Factory create(
      Provider<AnalyticsRepository> analyticsRepositoryProvider) {
    return new SendEventUseCaseImpl_Factory(analyticsRepositoryProvider);
  }

  public static SendEventUseCaseImpl newInstance(AnalyticsRepository analyticsRepository) {
    return new SendEventUseCaseImpl(analyticsRepository);
  }
}
