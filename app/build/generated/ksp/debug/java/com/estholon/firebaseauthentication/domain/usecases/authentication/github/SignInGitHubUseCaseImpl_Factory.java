package com.estholon.firebaseauthentication.domain.usecases.authentication.github;

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
public final class SignInGitHubUseCaseImpl_Factory implements Factory<SignInGitHubUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  private final Provider<SendEventUseCase> sendEventUseCaseProvider;

  public SignInGitHubUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider,
      Provider<SendEventUseCase> sendEventUseCaseProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
    this.sendEventUseCaseProvider = sendEventUseCaseProvider;
  }

  @Override
  public SignInGitHubUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get(), sendEventUseCaseProvider.get());
  }

  public static SignInGitHubUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider,
      Provider<SendEventUseCase> sendEventUseCaseProvider) {
    return new SignInGitHubUseCaseImpl_Factory(authenticationRepositoryProvider, sendEventUseCaseProvider);
  }

  public static SignInGitHubUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository, SendEventUseCase sendEventUseCase) {
    return new SignInGitHubUseCaseImpl(authenticationRepository, sendEventUseCase);
  }
}
