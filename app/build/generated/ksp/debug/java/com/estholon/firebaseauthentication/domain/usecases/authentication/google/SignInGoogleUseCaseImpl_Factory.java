package com.estholon.firebaseauthentication.domain.usecases.authentication.google;

import com.estholon.firebaseauthentication.domain.repositories.AuthenticationRepository;
import com.estholon.firebaseauthentication.domain.usecases.analytics.SendEventUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.multifactor.SendVerificationEmailUseCase;
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
public final class SignInGoogleUseCaseImpl_Factory implements Factory<SignInGoogleUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  private final Provider<SendVerificationEmailUseCase> sendVerificationEmailUseCaseProvider;

  private final Provider<SendEventUseCase> sendEventUseCaseProvider;

  public SignInGoogleUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider,
      Provider<SendVerificationEmailUseCase> sendVerificationEmailUseCaseProvider,
      Provider<SendEventUseCase> sendEventUseCaseProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
    this.sendVerificationEmailUseCaseProvider = sendVerificationEmailUseCaseProvider;
    this.sendEventUseCaseProvider = sendEventUseCaseProvider;
  }

  @Override
  public SignInGoogleUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get(), sendVerificationEmailUseCaseProvider.get(), sendEventUseCaseProvider.get());
  }

  public static SignInGoogleUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider,
      Provider<SendVerificationEmailUseCase> sendVerificationEmailUseCaseProvider,
      Provider<SendEventUseCase> sendEventUseCaseProvider) {
    return new SignInGoogleUseCaseImpl_Factory(authenticationRepositoryProvider, sendVerificationEmailUseCaseProvider, sendEventUseCaseProvider);
  }

  public static SignInGoogleUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository,
      SendVerificationEmailUseCase sendVerificationEmailUseCase,
      SendEventUseCase sendEventUseCase) {
    return new SignInGoogleUseCaseImpl(authenticationRepository, sendVerificationEmailUseCase, sendEventUseCase);
  }
}
