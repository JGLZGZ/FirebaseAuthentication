package com.estholon.firebaseauthentication.data.datasources.authentication.yahoo;

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
public final class YahooFirebaseAuthenticationDataSource_Factory implements Factory<YahooFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public YahooFirebaseAuthenticationDataSource_Factory(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public YahooFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static YahooFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    return new YahooFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider);
  }

  public static YahooFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth) {
    return new YahooFirebaseAuthenticationDataSource(firebaseAuth);
  }
}
