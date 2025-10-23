package com.estholon.firebaseauthentication.ui.screens.authentication.signUp;

import com.estholon.firebaseauthentication.domain.usecases.authentication.anonymously.SignInAnonymouslyUseCaseImpl;
import com.estholon.firebaseauthentication.domain.usecases.authentication.email.IsEmailValidUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.email.IsPasswordValidUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.email.SignUpEmailUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.facebook.SignInFacebookUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.github.SignInGitHubUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.google.ClearCredentialStateUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.google.SignInGoogleCredentialManagerUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.google.SignInGoogleUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.microsoft.SignInMicrosoftUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.twitter.SignInTwitterUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.yahoo.SignInYahooUseCase;
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

  public SignUpViewModel_Factory(Provider<SignUpEmailUseCase> signUpEmailUseCaseProvider,
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
