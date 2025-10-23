package com.estholon.firebaseauthentication.data.datasources.authentication.google;

import android.content.Context;
import com.estholon.firebaseauthentication.data.datasources.authentication.email.EmailAuthenticationDataSource;
import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
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
public final class GoogleFirebaseAuthenticationDataSource_Factory implements Factory<GoogleFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  private final Provider<EmailAuthenticationDataSource> emailAuthenticationDataSourceProvider;

  private final Provider<Context> contextProvider;

  public GoogleFirebaseAuthenticationDataSource_Factory(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<EmailAuthenticationDataSource> emailAuthenticationDataSourceProvider,
      Provider<Context> contextProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
    this.emailAuthenticationDataSourceProvider = emailAuthenticationDataSourceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public GoogleFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get(), emailAuthenticationDataSourceProvider.get(), contextProvider.get());
  }

  public static GoogleFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<EmailAuthenticationDataSource> emailAuthenticationDataSourceProvider,
      Provider<Context> contextProvider) {
    return new GoogleFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider, emailAuthenticationDataSourceProvider, contextProvider);
  }

  public static GoogleFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth,
      EmailAuthenticationDataSource emailAuthenticationDataSource, Context context) {
    return new GoogleFirebaseAuthenticationDataSource(firebaseAuth, emailAuthenticationDataSource, context);
  }
}
