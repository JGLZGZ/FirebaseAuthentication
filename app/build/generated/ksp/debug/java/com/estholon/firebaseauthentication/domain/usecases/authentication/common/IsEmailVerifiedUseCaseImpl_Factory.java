package com.estholon.firebaseauthentication.domain.usecases.authentication.common;

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
public final class IsEmailVerifiedUseCaseImpl_Factory implements Factory<IsEmailVerifiedUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  public IsEmailVerifiedUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public IsEmailVerifiedUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static IsEmailVerifiedUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new IsEmailVerifiedUseCaseImpl_Factory(authenticationRepositoryProvider);
  }

  public static IsEmailVerifiedUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository) {
    return new IsEmailVerifiedUseCaseImpl(authenticationRepository);
  }
}
