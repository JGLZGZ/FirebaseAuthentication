package com.estholon.firebaseauthentication.data.datasources.authentication.common;

import com.estholon.firebaseauthentication.data.datasources.authentication.google.GoogleAuthenticationDataSource;
import com.google.firebase.auth.FirebaseAuth;
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
public final class CommonFirebaseAuthenticationDataSource_Factory implements Factory<CommonFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  private final Provider<GoogleAuthenticationDataSource> googleAuthenticationDataSourceProvider;

  public CommonFirebaseAuthenticationDataSource_Factory(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<GoogleAuthenticationDataSource> googleAuthenticationDataSourceProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
    this.googleAuthenticationDataSourceProvider = googleAuthenticationDataSourceProvider;
  }

  @Override
  public CommonFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get(), googleAuthenticationDataSourceProvider.get());
  }

  public static CommonFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<GoogleAuthenticationDataSource> googleAuthenticationDataSourceProvider) {
    return new CommonFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider, googleAuthenticationDataSourceProvider);
  }

  public static CommonFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth,
      GoogleAuthenticationDataSource googleAuthenticationDataSource) {
    return new CommonFirebaseAuthenticationDataSource(firebaseAuth, googleAuthenticationDataSource);
  }
}
