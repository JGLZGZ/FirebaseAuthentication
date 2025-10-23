package com.estholon.firebaseauthentication.di;

import com.estholon.firebaseauthentication.data.mapper.AnalyticsMapper;
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
public final class FirebaseModule_Companion_ProvideAnalyticsMapperFactory implements Factory<AnalyticsMapper> {
  @Override
  public AnalyticsMapper get() {
    return provideAnalyticsMapper();
  }

  public static FirebaseModule_Companion_ProvideAnalyticsMapperFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AnalyticsMapper provideAnalyticsMapper() {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.Companion.provideAnalyticsMapper());
  }

  private static final class InstanceHolder {
    private static final FirebaseModule_Companion_ProvideAnalyticsMapperFactory INSTANCE = new FirebaseModule_Companion_ProvideAnalyticsMapperFactory();
  }
}
