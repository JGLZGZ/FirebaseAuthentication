package com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP;

import com.estholon.authentication.domain.repositories.AuthenticationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class VerifyOTPViewModel_Factory implements Factory<VerifyOTPViewModel> {
  private final Provider<AuthenticationRepository> authenticationRepositoryProvider;

  private VerifyOTPViewModel_Factory(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
  }

  @Override
  public VerifyOTPViewModel get() {
    return newInstance(authenticationRepositoryProvider.get());
  }

  public static VerifyOTPViewModel_Factory create(
      Provider<AuthenticationRepository> authenticationRepositoryProvider) {
    return new VerifyOTPViewModel_Factory(authenticationRepositoryProvider);
  }

  public static VerifyOTPViewModel newInstance(AuthenticationRepository authenticationRepository) {
    return new VerifyOTPViewModel(authenticationRepository);
  }
}
