package com.estholon.firebaseauthentication.data.datasources.analytics;

import com.google.firebase.analytics.FirebaseAnalytics;
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
public final class FirebaseAnalyticsDataSource_Factory implements Factory<FirebaseAnalyticsDataSource> {
  private final Provider<FirebaseAnalytics> firebaseAnalyticsProvider;

  public FirebaseAnalyticsDataSource_Factory(
      Provider<FirebaseAnalytics> firebaseAnalyticsProvider) {
    this.firebaseAnalyticsProvider = firebaseAnalyticsProvider;
  }

  @Override
  public FirebaseAnalyticsDataSource get() {
    return newInstance(firebaseAnalyticsProvider.get());
  }

  public static FirebaseAnalyticsDataSource_Factory create(
      Provider<FirebaseAnalytics> firebaseAnalyticsProvider) {
    return new FirebaseAnalyticsDataSource_Factory(firebaseAnalyticsProvider);
  }

  public static FirebaseAnalyticsDataSource newInstance(FirebaseAnalytics firebaseAnalytics) {
    return new FirebaseAnalyticsDataSource(firebaseAnalytics);
  }
}
