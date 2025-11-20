package com.estholon.firebaseauthentication.ui.screens.authentication.verificationEmail;

import com.example.authentication.domain.usecases.common.IsEmailVerifiedUseCase;
import com.example.authentication.domain.usecases.multifactor.SendVerificationEmailUseCase;
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
public final class VerificationEmailViewModel_Factory implements Factory<VerificationEmailViewModel> {
  private final Provider<IsEmailVerifiedUseCase> isEmailVerifiedUseCaseProvider;

  private final Provider<SendVerificationEmailUseCase> sendVerificationEmailUseCaseProvider;

  private VerificationEmailViewModel_Factory(
      Provider<IsEmailVerifiedUseCase> isEmailVerifiedUseCaseProvider,
      Provider<SendVerificationEmailUseCase> sendVerificationEmailUseCaseProvider) {
    this.isEmailVerifiedUseCaseProvider = isEmailVerifiedUseCaseProvider;
    this.sendVerificationEmailUseCaseProvider = sendVerificationEmailUseCaseProvider;
  }

  @Override
  public VerificationEmailViewModel get() {
    return newInstance(isEmailVerifiedUseCaseProvider.get(), sendVerificationEmailUseCaseProvider.get());
  }

  public static VerificationEmailViewModel_Factory create(
      Provider<IsEmailVerifiedUseCase> isEmailVerifiedUseCaseProvider,
      Provider<SendVerificationEmailUseCase> sendVerificationEmailUseCaseProvider) {
    return new VerificationEmailViewModel_Factory(isEmailVerifiedUseCaseProvider, sendVerificationEmailUseCaseProvider);
  }

  public static VerificationEmailViewModel newInstance(
      IsEmailVerifiedUseCase isEmailVerifiedUseCase,
      SendVerificationEmailUseCase sendVerificationEmailUseCase) {
    return new VerificationEmailViewModel(isEmailVerifiedUseCase, sendVerificationEmailUseCase);
  }
}
