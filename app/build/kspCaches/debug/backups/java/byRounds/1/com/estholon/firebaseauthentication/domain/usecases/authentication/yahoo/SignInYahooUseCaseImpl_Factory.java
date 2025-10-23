package com.estholon.firebaseauthentication.domain.usecases.authentication.yahoo;

import com.estholon.firebaseauthentication.domain.repositories.AuthenticationRepository;
import com.estholon.firebaseauthentication.domain.usecases.analytics.SendEventUseCase;
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
public final class SignInYahooUseCaseImpl_Factory implements Factory<SignInYahooUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  private final Provider<SendEventUseCase> sendEventUseCaseProvider;

  public SignInYahooUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider,
      Provider<SendEventUseCase> sendEventUseCaseProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
    this.sendEventUseCaseProvider = sendEventUseCaseProvider;
  }

  @Override
  public SignInYahooUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get(), sendEventUseCaseProvider.get());
  }

  public static SignInYahooUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider,
      Provider<SendEventUseCase> sendEventUseCaseProvider) {
    return new SignInYahooUseCaseImpl_Factory(authenticationRepositoryProvider, sendEventUseCaseProvider);
  }

  public static SignInYahooUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository, SendEventUseCase sendEventUseCase) {
    return new SignInYahooUseCaseImpl(authenticationRepository, sendEventUseCase);
  }
}
