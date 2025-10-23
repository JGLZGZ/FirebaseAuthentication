package com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment;

import com.estholon.firebaseauthentication.domain.usecases.authentication.multifactor.StartEnrollPhoneUseCase;
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
public final class StartEnrollViewModel_Factory implements Factory<StartEnrollViewModel> {
  private final Provider<StartEnrollPhoneUseCase> startEnrollPhoneUseCaseProvider;

  public StartEnrollViewModel_Factory(
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
