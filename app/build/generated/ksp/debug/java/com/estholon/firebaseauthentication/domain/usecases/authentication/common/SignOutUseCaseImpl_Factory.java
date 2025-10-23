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
public final class SignOutUseCaseImpl_Factory implements Factory<SignOutUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  public SignOutUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public SignOutUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static SignOutUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new SignOutUseCaseImpl_Factory(authenticationRepositoryProvider);
  }

  public static SignOutUseCaseImpl newInstance(AuthenticationRepository authenticationRepository) {
    return new SignOutUseCaseImpl(authenticationRepository);
  }
}
