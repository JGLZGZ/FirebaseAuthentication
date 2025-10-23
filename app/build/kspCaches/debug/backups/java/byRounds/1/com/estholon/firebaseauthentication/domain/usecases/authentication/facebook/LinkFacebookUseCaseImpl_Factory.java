package com.estholon.firebaseauthentication.domain.usecases.authentication.facebook;

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
public final class LinkFacebookUseCaseImpl_Factory implements Factory<LinkFacebookUseCaseImpl> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  public LinkFacebookUseCaseImpl_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public LinkFacebookUseCaseImpl get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static LinkFacebookUseCaseImpl_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new LinkFacebookUseCaseImpl_Factory(authenticationRepositoryProvider);
  }

  public static LinkFacebookUseCaseImpl newInstance(
      AuthenticationRepository authenticationRepository) {
    return new LinkFacebookUseCaseImpl(authenticationRepository);
  }
}
