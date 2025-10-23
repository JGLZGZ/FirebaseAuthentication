package com.estholon.firebaseauthentication.domain.usecases.authentication.yahoo;

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
public final class LinkYahooUseCaseImpl_Factory implements Factory<LinkYahooUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  public LinkYahooUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public LinkYahooUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static LinkYahooUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new LinkYahooUseCaseImpl_Factory(authenticationRepositoryProvider);
  }

  public static LinkYahooUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository) {
    return new LinkYahooUseCaseImpl(authenticationRepository);
  }
}
