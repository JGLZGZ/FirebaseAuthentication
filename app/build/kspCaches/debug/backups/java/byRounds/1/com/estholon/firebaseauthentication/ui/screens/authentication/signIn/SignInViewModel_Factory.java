package com.estholon.firebaseauthentication.ui.screens.authentication.signIn;

import com.estholon.authentication.domain.usecases.anonymously.SignInAnonymouslyUseCase;
import com.estholon.authentication.domain.usecases.email.IsEmailValidUseCase;
import com.estholon.authentication.domain.usecases.email.IsPasswordValidUseCase;
import com.estholon.authentication.domain.usecases.email.SignInEmailUseCase;
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
public final class SignInViewModel_Factory implements Factory<SignInViewModel> {
  private final Provider<SignInEmailUseCase> signInEmailUseCaseProvider;

  private final Provider<SignInAnonymouslyUseCase> signInAnonymouslyUseCaseProvider;

  private final Provider<SignInGoogleCredentialManagerUseCase> signInGoogleCredentialManagerUseCaseProvider;

  private final Provider<SignInGoogleUseCase> signInGoogleUseCaseProvider;

  private final Provider<SignInFacebookUseCase> signInFacebookUseCaseProvider;

  private final Provider<SignInGitHubUseCase> signInGitHubUseCaseProvider;

  private final Provider<SignInMicrosoftUseCase> signInMicrosoftUseCaseProvider;

  private final Provider<SignInTwitterUseCase> signInTwitterUseCaseProvider;

  private final Provider<SignInYahooUseCase> signInYahooUseCaseProvider;

  private final Provider<ClearCredentialStateUseCase> clearCredentialStateUseCaseProvider;

  private final Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider;

  private final Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider;

  private SignInViewModel_Factory(Provider<SignInEmailUseCase> signInEmailUseCaseProvider,
      Provider<SignInAnonymouslyUseCase> signInAnonymouslyUseCaseProvider,
      Provider<SignInGoogleCredentialManagerUseCase> signInGoogleCredentialManagerUseCaseProvider,
      Provider<SignInGoogleUseCase> signInGoogleUseCaseProvider,
      Provider<SignInFacebookUseCase> signInFacebookUseCaseProvider,
      Provider<SignInGitHubUseCase> signInGitHubUseCaseProvider,
      Provider<SignInMicrosoftUseCase> signInMicrosoftUseCaseProvider,
      Provider<SignInTwitterUseCase> signInTwitterUseCaseProvider,
      Provider<SignInYahooUseCase> signInYahooUseCaseProvider,
      Provider<ClearCredentialStateUseCase> clearCredentialStateUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider,
      Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider) {
    this.signInEmailUseCaseProvider = signInEmailUseCaseProvider;
    this.signInAnonymouslyUseCaseProvider = signInAnonymouslyUseCaseProvider;
    this.signInGoogleCredentialManagerUseCaseProvider = signInGoogleCredentialManagerUseCaseProvider;
    this.signInGoogleUseCaseProvider = signInGoogleUseCaseProvider;
    this.signInFacebookUseCaseProvider = signInFacebookUseCaseProvider;
    this.signInGitHubUseCaseProvider = signInGitHubUseCaseProvider;
    this.signInMicrosoftUseCaseProvider = signInMicrosoftUseCaseProvider;
    this.signInTwitterUseCaseProvider = signInTwitterUseCaseProvider;
    this.signInYahooUseCaseProvider = signInYahooUseCaseProvider;
    this.clearCredentialStateUseCaseProvider = clearCredentialStateUseCaseProvider;
    this.isEmailValidUseCaseProvider = isEmailValidUseCaseProvider;
    this.isPasswordValidUseCaseProvider = isPasswordValidUseCaseProvider;
  }

  @Override
  public SignInViewModel get() {
    return newInstance(signInEmailUseCaseProvider.get(), signInAnonymouslyUseCaseProvider.get(), signInGoogleCredentialManagerUseCaseProvider.get(), signInGoogleUseCaseProvider.get(), signInFacebookUseCaseProvider.get(), signInGitHubUseCaseProvider.get(), signInMicrosoftUseCaseProvider.get(), signInTwitterUseCaseProvider.get(), signInYahooUseCaseProvider.get(), clearCredentialStateUseCaseProvider.get(), isEmailValidUseCaseProvider.get(), isPasswordValidUseCaseProvider.get());
  }

  public static SignInViewModel_Factory create(
      Provider<SignInEmailUseCase> signInEmailUseCaseProvider,
      Provider<SignInAnonymouslyUseCase> signInAnonymouslyUseCaseProvider,
      Provider<SignInGoogleCredentialManagerUseCase> signInGoogleCredentialManagerUseCaseProvider,
      Provider<SignInGoogleUseCase> signInGoogleUseCaseProvider,
      Provider<SignInFacebookUseCase> signInFacebookUseCaseProvider,
      Provider<SignInGitHubUseCase> signInGitHubUseCaseProvider,
      Provider<SignInMicrosoftUseCase> signInMicrosoftUseCaseProvider,
      Provider<SignInTwitterUseCase> signInTwitterUseCaseProvider,
      Provider<SignInYahooUseCase> signInYahooUseCaseProvider,
      Provider<ClearCredentialStateUseCase> clearCredentialStateUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider,
      Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider) {
    return new SignInViewModel_Factory(signInEmailUseCaseProvider, signInAnonymouslyUseCaseProvider, signInGoogleCredentialManagerUseCaseProvider, signInGoogleUseCaseProvider, signInFacebookUseCaseProvider, signInGitHubUseCaseProvider, signInMicrosoftUseCaseProvider, signInTwitterUseCaseProvider, signInYahooUseCaseProvider, clearCredentialStateUseCaseProvider, isEmailValidUseCaseProvider, isPasswordValidUseCaseProvider);
  }

  public static SignInViewModel newInstance(SignInEmailUseCase signInEmailUseCase,
      SignInAnonymouslyUseCase signInAnonymouslyUseCase,
      SignInGoogleCredentialManagerUseCase signInGoogleCredentialManagerUseCase,
      SignInGoogleUseCase signInGoogleUseCase, SignInFacebookUseCase signInFacebookUseCase,
      SignInGitHubUseCase signInGitHubUseCase, SignInMicrosoftUseCase signInMicrosoftUseCase,
      SignInTwitterUseCase signInTwitterUseCase, SignInYahooUseCase signInYahooUseCase,
      ClearCredentialStateUseCase clearCredentialStateUseCase,
      IsEmailValidUseCase isEmailValidUseCase, IsPasswordValidUseCase isPasswordValidUseCase) {
    return new SignInViewModel(signInEmailUseCase, signInAnonymouslyUseCase, signInGoogleCredentialManagerUseCase, signInGoogleUseCase, signInFacebookUseCase, signInGitHubUseCase, signInMicrosoftUseCase, signInTwitterUseCase, signInYahooUseCase, clearCredentialStateUseCase, isEmailValidUseCase, isPasswordValidUseCase);
  }
}
