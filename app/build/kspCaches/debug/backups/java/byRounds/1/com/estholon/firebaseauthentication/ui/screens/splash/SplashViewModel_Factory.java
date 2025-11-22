package com.estholon.firebaseauthentication.ui.screens.splash;

import com.estholon.authentication.domain.usecases.common.IsUserLoggedUseCaseImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<IsUserLoggedUseCaseImpl> isUserLoggedUseCaseImplProvider;

  private SplashViewModel_Factory(
      Provider<IsUserLoggedUseCaseImpl> isUserLoggedUseCaseImplProvider) {
    this.isUserLoggedUseCaseImplProvider = isUserLoggedUseCaseImplProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(isUserLoggedUseCaseImplProvider.get());
  }

  public static SplashViewModel_Factory create(
      Provider<IsUserLoggedUseCaseImpl> isUserLoggedUseCaseImplProvider) {
    return new SplashViewModel_Factory(isUserLoggedUseCaseImplProvider);
  }

  public static SplashViewModel newInstance(IsUserLoggedUseCaseImpl isUserLoggedUseCaseImpl) {
    return new SplashViewModel(isUserLoggedUseCaseImpl);
  }
}
