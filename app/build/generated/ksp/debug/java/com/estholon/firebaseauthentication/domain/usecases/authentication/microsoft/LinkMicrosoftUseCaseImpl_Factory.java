package com.estholon.firebaseauthentication.domain.usecases.authentication.microsoft;

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
public final class LinkMicrosoftUseCaseImpl_Factory implements Factory<LinkMicrosoftUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  public LinkMicrosoftUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public LinkMicrosoftUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static LinkMicrosoftUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new LinkMicrosoftUseCaseImpl_Factory(authenticationRepositoryProvider);
  }

  public static LinkMicrosoftUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository) {
    return new LinkMicrosoftUseCaseImpl(authenticationRepository);
  }
}
