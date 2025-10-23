package com.estholon.firebaseauthentication.data.datasources.authentication.facebook;

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
public final class FacebookFirebaseAuthenticationDataSource_Factory implements Factory<FacebookFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public FacebookFirebaseAuthenticationDataSource_Factory(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public FacebookFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static FacebookFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    return new FacebookFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider);
  }

  public static FacebookFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth) {
    return new FacebookFirebaseAuthenticationDataSource(firebaseAuth);
  }
}
