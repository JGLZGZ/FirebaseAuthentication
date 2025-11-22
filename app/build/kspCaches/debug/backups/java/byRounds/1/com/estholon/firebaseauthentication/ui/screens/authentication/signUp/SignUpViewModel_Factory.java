package com.estholon.firebaseauthentication.ui.screens.authentication.signUp;

import com.estholon.authentication.domain.usecases.anonymously.SignInAnonymouslyUseCaseImpl;
import com.estholon.authentication.domain.usecases.email.IsEmailValidUseCase;
import com.estholon.authentication.domain.usecases.email.IsPasswordValidUseCase;
import com.estholon.authentication.domain.usecases.email.SignUpEmailUseCase;
import com.estholon.authentication.domain.usecases.facebook.SignInFacebookUseCase;
import com.estholon.authentication.domain.usecases.github.SignInGitHubUseCase;
import com.estholon.authentication.domain.usecases.google.ClearCredentialStateUseCase;
import com.estholon.authentication.domain.usecases.google.SignInGoogleCredentialManagerUseCase;
import com.estholon.authentication.domain.usecases.google.SignInGoogleUseCase;
import com.estholon.authentication.domain.usecases.microsoft.SignInMicrosoftUseCase;
import com.estholon.authentication.domain.usecases.twitter.SignInTwitterUseCase;
import com.estholon.authentication.domain.usecases.yahoo.SignInYahooUseCase;
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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<SignUpEmailUseCase> signUpEmailUseCaseProvider;

  private final Provider<SignInAnonymouslyUseCaseImpl> signInAnonymouslyUseCaseImplProvider;

  private final Provider<SignInFacebookUseCase> signInFacebookUseCaseProvider;

  private final Provider<SignInGoogleCredentialManagerUseCase> signInGoogleCredentialManagerUseCaseProvider;

  private final Provider<SignInGoogleUseCase> signInGoogleUseCaseProvider;

  private final Provider<ClearCredentialStateUseCase> clearCredentialStateUseCaseProvider;

  private final Provider<SignInYahooUseCase> signInYahooUseCaseProvider;

  private final Provider<SignInMicrosoftUseCase> signInMicrosoftUseCaseProvider;

  private final Provider<SignInGitHubUseCase> signInGitHubUseCaseProvider;

  private final Provider<SignInTwitterUseCase> signInTwitterUseCaseProvider;

  private final Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider;

  private final Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider;

  private SignUpViewModel_Factory(Provider<SignUpEmailUseCase> signUpEmailUseCaseProvider,
      Provider<SignInAnonymouslyUseCaseImpl> signInAnonymouslyUseCaseImplProvider,
      Provider<SignInFacebookUseCase> signInFacebookUseCaseProvider,
      Provider<SignInGoogleCredentialManagerUseCase> signInGoogleCredentialManagerUseCaseProvider,
      Provider<SignInGoogleUseCase> signInGoogleUseCaseProvider,
      Provider<ClearCredentialStateUseCase> clearCredentialStateUseCaseProvider,
      Provider<SignInYahooUseCase> signInYahooUseCaseProvider,
      Provider<SignInMicrosoftUseCase> signInMicrosoftUseCaseProvider,
      Provider<SignInGitHubUseCase> signInGitHubUseCaseProvider,
      Provider<SignInTwitterUseCase> signInTwitterUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider,
      Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider) {
    this.signUpEmailUseCaseProvider = signUpEmailUseCaseProvider;
    this.signInAnonymouslyUseCaseImplProvider = signInAnonymouslyUseCaseImplProvider;
    this.signInFacebookUseCaseProvider = signInFacebookUseCaseProvider;
    this.signInGoogleCredentialManagerUseCaseProvider = signInGoogleCredentialManagerUseCaseProvider;
    this.signInGoogleUseCaseProvider = signInGoogleUseCaseProvider;
    this.clearCredentialStateUseCaseProvider = clearCredentialStateUseCaseProvider;
    this.signInYahooUseCaseProvider = signInYahooUseCaseProvider;
    this.signInMicrosoftUseCaseProvider = signInMicrosoftUseCaseProvider;
    this.signInGitHubUseCaseProvider = signInGitHubUseCaseProvider;
    this.signInTwitterUseCaseProvider = signInTwitterUseCaseProvider;
    this.isEmailValidUseCaseProvider = isEmailValidUseCaseProvider;
    this.isPasswordValidUseCaseProvider = isPasswordValidUseCaseProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(signUpEmailUseCaseProvider.get(), signInAnonymouslyUseCaseImplProvider.get(), signInFacebookUseCaseProvider.get(), signInGoogleCredentialManagerUseCaseProvider.get(), signInGoogleUseCaseProvider.get(), clearCredentialStateUseCaseProvider.get(), signInYahooUseCaseProvider.get(), signInMicrosoftUseCaseProvider.get(), signInGitHubUseCaseProvider.get(), signInTwitterUseCaseProvider.get(), isEmailValidUseCaseProvider.get(), isPasswordValidUseCaseProvider.get());
  }

  public static SignUpViewModel_Factory create(
      Provider<SignUpEmailUseCase> signUpEmailUseCaseProvider,
      Provider<SignInAnonymouslyUseCaseImpl> signInAnonymouslyUseCaseImplProvider,
      Provider<SignInFacebookUseCase> signInFacebookUseCaseProvider,
      Provider<SignInGoogleCredentialManagerUseCase> signInGoogleCredentialManagerUseCaseProvider,
      Provider<SignInGoogleUseCase> signInGoogleUseCaseProvider,
      Provider<ClearCredentialStateUseCase> clearCredentialStateUseCaseProvider,
      Provider<SignInYahooUseCase> signInYahooUseCaseProvider,
      Provider<SignInMicrosoftUseCase> signInMicrosoftUseCaseProvider,
      Provider<SignInGitHubUseCase> signInGitHubUseCaseProvider,
      Provider<SignInTwitterUseCase> signInTwitterUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider,
      Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider) {
    return new SignUpViewModel_Factory(signUpEmailUseCaseProvider, signInAnonymouslyUseCaseImplProvider, signInFacebookUseCaseProvider, signInGoogleCredentialManagerUseCaseProvider, signInGoogleUseCaseProvider, clearCredentialStateUseCaseProvider, signInYahooUseCaseProvider, signInMicrosoftUseCaseProvider, signInGitHubUseCaseProvider, signInTwitterUseCaseProvider, isEmailValidUseCaseProvider, isPasswordValidUseCaseProvider);
  }

  public static SignUpViewModel newInstance(SignUpEmailUseCase signUpEmailUseCase,
      SignInAnonymouslyUseCaseImpl signInAnonymouslyUseCaseImpl,
      SignInFacebookUseCase signInFacebookUseCase,
      SignInGoogleCredentialManagerUseCase signInGoogleCredentialManagerUseCase,
      SignInGoogleUseCase signInGoogleUseCase,
      ClearCredentialStateUseCase clearCredentialStateUseCase,
      SignInYahooUseCase signInYahooUseCase, SignInMicrosoftUseCase signInMicrosoftUseCase,
      SignInGitHubUseCase signInGitHubUseCase, SignInTwitterUseCase signInTwitterUseCase,
      IsEmailValidUseCase isEmailValidUseCase, IsPasswordValidUseCase isPasswordValidUseCase) {
    return new SignUpViewModel(signUpEmailUseCase, signInAnonymouslyUseCaseImpl, signInFacebookUseCase, signInGoogleCredentialManagerUseCase, signInGoogleUseCase, clearCredentialStateUseCase, signInYahooUseCase, signInMicrosoftUseCase, signInGitHubUseCase, signInTwitterUseCase, isEmailValidUseCase, isPasswordValidUseCase);
  }
}
