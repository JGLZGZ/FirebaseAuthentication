package com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment;

import com.estholon.authentication.domain.usecases.multifactor.StartEnrollPhoneUseCase;
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
public final class StartEnrollViewModel_Factory implements Factory<StartEnrollViewModel> {
  private final Provider<StartEnrollPhoneUseCase> startEnrollPhoneUseCaseProvider;

  private StartEnrollViewModel_Factory(
      Provider<StartEnrollPhoneUseCase> startEnrollPhoneUseCaseProvider) {
    this.startEnrollPhoneUseCaseProvider = startEnrollPhoneUseCaseProvider;
  }

  @Override
  public StartEnrollViewModel get() {
    return newInstance(startEnrollPhoneUseCaseProvider.get());
  }

  public static StartEnrollViewModel_Factory create(
      Provider<StartEnrollPhoneUseCase> startEnrollPhoneUseCaseProvider) {
    return new StartEnrollViewModel_Factory(startEnrollPhoneUseCaseProvider);
  }

  public static StartEnrollViewModel newInstance(StartEnrollPhoneUseCase startEnrollPhoneUseCase) {
    return new StartEnrollViewModel(startEnrollPhoneUseCase);
  }
}
