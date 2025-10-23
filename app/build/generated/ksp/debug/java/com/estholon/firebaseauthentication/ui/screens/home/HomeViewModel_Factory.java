package com.estholon.firebaseauthentication.ui.screens.home;

import com.estholon.firebaseauthentication.domain.usecases.authentication.common.SignOutUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.email.IsEmailValidUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.email.IsPasswordValidUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.email.LinkEmailUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.facebook.LinkFacebookUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.github.LinkGitHubUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.google.LinkGoogleUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.microsoft.LinkMicrosoftUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.twitter.LinkTwitterUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.yahoo.LinkYahooUseCase;
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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<SignOutUseCase> signOutUseCaseProvider;

  private final Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider;

  private final Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider;

  private final Provider<LinkEmailUseCase> linkEmailUseCaseProvider;

  private final Provider<LinkGoogleUseCase> linkGoogleUseCaseProvider;

  private final Provider<LinkFacebookUseCase> linkFacebookUseCaseProvider;

  private final Provider<LinkGitHubUseCase> linkGitHubUseCaseProvider;

  private final Provider<LinkMicrosoftUseCase> linkMicrosoftUseCaseProvider;

  private final Provider<LinkYahooUseCase> linkYahooUseCaseProvider;

  private final Provider<LinkTwitterUseCase> linkTwitterUseCaseProvider;

  public HomeViewModel_Factory(Provider<SignOutUseCase> signOutUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider,
      Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider,
      Provider<LinkEmailUseCase> linkEmailUseCaseProvider,
      Provider<LinkGoogleUseCase> linkGoogleUseCaseProvider,
      Provider<LinkFacebookUseCase> linkFacebookUseCaseProvider,
      Provider<LinkGitHubUseCase> linkGitHubUseCaseProvider,
      Provider<LinkMicrosoftUseCase> linkMicrosoftUseCaseProvider,
      Provider<LinkYahooUseCase> linkYahooUseCaseProvider,
      Provider<LinkTwitterUseCase> linkTwitterUseCaseProvider) {
    this.signOutUseCaseProvider = signOutUseCaseProvider;
    this.isEmailValidUseCaseProvider = isEmailValidUseCaseProvider;
    this.isPasswordValidUseCaseProvider = isPasswordValidUseCaseProvider;
    this.linkEmailUseCaseProvider = linkEmailUseCaseProvider;
    this.linkGoogleUseCaseProvider = linkGoogleUseCaseProvider;
    this.linkFacebookUseCaseProvider = linkFacebookUseCaseProvider;
    this.linkGitHubUseCaseProvider = linkGitHubUseCaseProvider;
    this.linkMicrosoftUseCaseProvider = linkMicrosoftUseCaseProvider;
    this.linkYahooUseCaseProvider = linkYahooUseCaseProvider;
    this.linkTwitterUseCaseProvider = linkTwitterUseCaseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(signOutUseCaseProvider.get(), isEmailValidUseCaseProvider.get(), isPasswordValidUseCaseProvider.get(), linkEmailUseCaseProvider.get(), linkGoogleUseCaseProvider.get(), linkFacebookUseCaseProvider.get(), linkGitHubUseCaseProvider.get(), linkMicrosoftUseCaseProvider.get(), linkYahooUseCaseProvider.get(), linkTwitterUseCaseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<SignOutUseCase> signOutUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider,
      Provider<IsPasswordValidUseCase> isPasswordValidUseCaseProvider,
      Provider<LinkEmailUseCase> linkEmailUseCaseProvider,
      Provider<LinkGoogleUseCase> linkGoogleUseCaseProvider,
      Provider<LinkFacebookUseCase> linkFacebookUseCaseProvider,
      Provider<LinkGitHubUseCase> linkGitHubUseCaseProvider,
      Provider<LinkMicrosoftUseCase> linkMicrosoftUseCaseProvider,
      Provider<LinkYahooUseCase> linkYahooUseCaseProvider,
      Provider<LinkTwitterUseCase> linkTwitterUseCaseProvider) {
    return new HomeViewModel_Factory(signOutUseCaseProvider, isEmailValidUseCaseProvider, isPasswordValidUseCaseProvider, linkEmailUseCaseProvider, linkGoogleUseCaseProvider, linkFacebookUseCaseProvider, linkGitHubUseCaseProvider, linkMicrosoftUseCaseProvider, linkYahooUseCaseProvider, linkTwitterUseCaseProvider);
  }

  public static HomeViewModel newInstance(SignOutUseCase signOutUseCase,
      IsEmailValidUseCase isEmailValidUseCase, IsPasswordValidUseCase isPasswordValidUseCase,
      LinkEmailUseCase linkEmailUseCase, LinkGoogleUseCase linkGoogleUseCase,
      LinkFacebookUseCase linkFacebookUseCase, LinkGitHubUseCase linkGitHubUseCase,
      LinkMicrosoftUseCase linkMicrosoftUseCase, LinkYahooUseCase linkYahooUseCase,
      LinkTwitterUseCase linkTwitterUseCase) {
    return new HomeViewModel(signOutUseCase, isEmailValidUseCase, isPasswordValidUseCase, linkEmailUseCase, linkGoogleUseCase, linkFacebookUseCase, linkGitHubUseCase, linkMicrosoftUseCase, linkYahooUseCase, linkTwitterUseCase);
  }
}
