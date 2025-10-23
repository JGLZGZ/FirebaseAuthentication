package com.estholon.firebaseauthentication.domain.usecases.authentication.google;

import com.estholon.firebaseauthentication.domain.repositories.AuthenticationRepository;
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
public final class ClearCredentialStateUseCaseImpl_Factory implements Factory<ClearCredentialStateUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  public ClearCredentialStateUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public ClearCredentialStateUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static ClearCredentialStateUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new ClearCredentialStateUseCaseImpl_Factory(authenticationRepositoryProvider);
  }

  public static ClearCredentialStateUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository) {
    return new ClearCredentialStateUseCaseImpl(authenticationRepository);
  }
}
