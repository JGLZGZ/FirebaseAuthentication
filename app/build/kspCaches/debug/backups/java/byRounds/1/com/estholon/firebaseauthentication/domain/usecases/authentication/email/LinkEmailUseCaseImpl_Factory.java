package com.estholon.firebaseauthentication.domain.usecases.authentication.email;

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
public final class LinkEmailUseCaseImpl_Factory implements Factory<LinkEmailUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  public LinkEmailUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public LinkEmailUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static LinkEmailUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new LinkEmailUseCaseImpl_Factory(authenticationRepositoryProvider);
  }

  public static LinkEmailUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository) {
    return new LinkEmailUseCaseImpl(authenticationRepository);
  }
}
