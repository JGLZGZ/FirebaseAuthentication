package com.estholon.firebaseauthentication.data.repositories;

import com.estholon.firebaseauthentication.data.datasources.authentication.anonymously.AnonymouslyAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.common.CommonAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.email.EmailAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.facebook.FacebookAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.github.GitHubAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.google.GoogleAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.microsoft.MicrosoftAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.multifactor.MultifactorAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.phone.PhoneAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.twitter.TwitterAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.datasources.authentication.yahoo.YahooAuthenticationDataSource;
import com.estholon.firebaseauthentication.data.mapper.UserMapper;
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
public final class AuthenticationRepositoryImpl_Factory implements Factory<AuthenticationRepositoryImpl> {
  private final Provider<CommonAuthenticationDataSource> commonAuthenticationDataSourceProvider;

  private final Provider<AnonymouslyAuthenticationDataSource> anonymouslyAuthenticationDataSourceProvider;

  private final Provider<EmailAuthenticationDataSource> emailAuthenticationDataSourceProvider;

  private final Provider<GoogleAuthenticationDataSource> googleAuthenticationDataSourceProvider;

  private final Provider<FacebookAuthenticationDataSource> facebookAuthenticationDataSourceProvider;

  private final Provider<GitHubAuthenticationDataSource> gitHubAuthenticationDataSourceProvider;

  private final Provider<MicrosoftAuthenticationDataSource> microsoftAuthenticationDataSourceProvider;

  private final Provider<PhoneAuthenticationDataSource> phoneAuthenticationDataSourceProvider;

  private final Provider<TwitterAuthenticationDataSource> twitterAuthenticationDataSourceProvider;

  private final Provider<YahooAuthenticationDataSource> yahooAuthenticationDataSourceProvider;

  private final Provider<MultifactorAuthenticationDataSource> multifactorAuthenticationDataSourceProvider;

  private final Provider<UserMapper> userMapperProvider;

  public AuthenticationRepositoryImpl_Factory(
      Provider<CommonAuthenticationDataSource> commonAuthenticationDataSourceProvider,
      Provider<AnonymouslyAuthenticationDataSource> anonymouslyAuthenticationDataSourceProvider,
      Provider<EmailAuthenticationDataSource> emailAuthenticationDataSourceProvider,
      Provider<GoogleAuthenticationDataSource> googleAuthenticationDataSourceProvider,
      Provider<FacebookAuthenticationDataSource> facebookAuthenticationDataSourceProvider,
      Provider<GitHubAuthenticationDataSource> gitHubAuthenticationDataSourceProvider,
      Provider<MicrosoftAuthenticationDataSource> microsoftAuthenticationDataSourceProvider,
      Provider<PhoneAuthenticationDataSource> phoneAuthenticationDataSourceProvider,
      Provider<TwitterAuthenticationDataSource> twitterAuthenticationDataSourceProvider,
      Provider<YahooAuthenticationDataSource> yahooAuthenticationDataSourceProvider,
      Provider<MultifactorAuthenticationDataSource> multifactorAuthenticationDataSourceProvider,
      Provider<UserMapper> userMapperProvider) {
    this.commonAuthenticationDataSourceProvider = commonAuthenticationDataSourceProvider;
    this.anonymouslyAuthenticationDataSourceProvider = anonymouslyAuthenticationDataSourceProvider;
    this.emailAuthenticationDataSourceProvider = emailAuthenticationDataSourceProvider;
    this.googleAuthenticationDataSourceProvider = googleAuthenticationDataSourceProvider;
    this.facebookAuthenticationDataSourceProvider = facebookAuthenticationDataSourceProvider;
    this.gitHubAuthenticationDataSourceProvider = gitHubAuthenticationDataSourceProvider;
    this.microsoftAuthenticationDataSourceProvider = microsoftAuthenticationDataSourceProvider;
    this.phoneAuthenticationDataSourceProvider = phoneAuthenticationDataSourceProvider;
    this.twitterAuthenticationDataSourceProvider = twitterAuthenticationDataSourceProvider;
    this.yahooAuthenticationDataSourceProvider = yahooAuthenticationDataSourceProvider;
    this.multifactorAuthenticationDataSourceProvider = multifactorAuthenticationDataSourceProvider;
    this.userMapperProvider = userMapperProvider;
  }

  @Override
  public AuthenticationRepositoryImpl get() {
    return newInstance(commonAuthenticationDataSourceProvider.get(), anonymouslyAuthenticationDataSourceProvider.get(), emailAuthenticationDataSourceProvider.get(), googleAuthenticationDataSourceProvider.get(), facebookAuthenticationDataSourceProvider.get(), gitHubAuthenticationDataSourceProvider.get(), microsoftAuthenticationDataSourceProvider.get(), phoneAuthenticationDataSourceProvider.get(), twitterAuthenticationDataSourceProvider.get(), yahooAuthenticationDataSourceProvider.get(), multifactorAuthenticationDataSourceProvider.get(), userMapperProvider.get());
  }

  public static AuthenticationRepositoryImpl_Factory create(
      Provider<CommonAuthenticationDataSource> commonAuthenticationDataSourceProvider,
      Provider<AnonymouslyAuthenticationDataSource> anonymouslyAuthenticationDataSourceProvider,
      Provider<EmailAuthenticationDataSource> emailAuthenticationDataSourceProvider,
      Provider<GoogleAuthenticationDataSource> googleAuthenticationDataSourceProvider,
      Provider<FacebookAuthenticationDataSource> facebookAuthenticationDataSourceProvider,
      Provider<GitHubAuthenticationDataSource> gitHubAuthenticationDataSourceProvider,
      Provider<MicrosoftAuthenticationDataSource> microsoftAuthenticationDataSourceProvider,
      Provider<PhoneAuthenticationDataSource> phoneAuthenticationDataSourceProvider,
      Provider<TwitterAuthenticationDataSource> twitterAuthenticationDataSourceProvider,
      Provider<YahooAuthenticationDataSource> yahooAuthenticationDataSourceProvider,
      Provider<MultifactorAuthenticationDataSource> multifactorAuthenticationDataSourceProvider,
      Provider<UserMapper> userMapperProvider) {
    return new AuthenticationRepositoryImpl_Factory(commonAuthenticationDataSourceProvider, anonymouslyAuthenticationDataSourceProvider, emailAuthenticationDataSourceProvider, googleAuthenticationDataSourceProvider, facebookAuthenticationDataSourceProvider, gitHubAuthenticationDataSourceProvider, microsoftAuthenticationDataSourceProvider, phoneAuthenticationDataSourceProvider, twitterAuthenticationDataSourceProvider, yahooAuthenticationDataSourceProvider, multifactorAuthenticationDataSourceProvider, userMapperProvider);
  }

  public static AuthenticationRepositoryImpl newInstance(
      CommonAuthenticationDataSource commonAuthenticationDataSource,
      AnonymouslyAuthenticationDataSource anonymouslyAuthenticationDataSource,
      EmailAuthenticationDataSource emailAuthenticationDataSource,
      GoogleAuthenticationDataSource googleAuthenticationDataSource,
      FacebookAuthenticationDataSource facebookAuthenticationDataSource,
      GitHubAuthenticationDataSource gitHubAuthenticationDataSource,
      MicrosoftAuthenticationDataSource microsoftAuthenticationDataSource,
      PhoneAuthenticationDataSource phoneAuthenticationDataSource,
      TwitterAuthenticationDataSource twitterAuthenticationDataSource,
      YahooAuthenticationDataSource yahooAuthenticationDataSource,
      MultifactorAuthenticationDataSource multifactorAuthenticationDataSource,
      UserMapper userMapper) {
    return new AuthenticationRepositoryImpl(commonAuthenticationDataSource, anonymouslyAuthenticationDataSource, emailAuthenticationDataSource, googleAuthenticationDataSource, facebookAuthenticationDataSource, gitHubAuthenticationDataSource, microsoftAuthenticationDataSource, phoneAuthenticationDataSource, twitterAuthenticationDataSource, yahooAuthenticationDataSource, multifactorAuthenticationDataSource, userMapper);
  }
}
