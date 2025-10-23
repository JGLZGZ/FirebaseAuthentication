package com.estholon.firebaseauthentication.di;

import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class FirebaseModule_Companion_ProvideFirebaseAnalyticsFactory implements Factory<FirebaseAnalytics> {
  @Override
  public FirebaseAnalytics get() {
    return provideFirebaseAnalytics();
  }

  public static FirebaseModule_Companion_ProvideFirebaseAnalyticsFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseAnalytics provideFirebaseAnalytics() {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.Companion.provideFirebaseAnalytics());
  }

  private static final class InstanceHolder {
    private static final FirebaseModule_Companion_ProvideFirebaseAnalyticsFactory INSTANCE = new FirebaseModule_Companion_ProvideFirebaseAnalyticsFactory();
  }
}
