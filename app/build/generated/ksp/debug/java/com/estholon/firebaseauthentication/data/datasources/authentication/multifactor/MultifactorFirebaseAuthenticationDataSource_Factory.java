package com.estholon.firebaseauthentication.data.datasources.authentication.multifactor;

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
public final class MultifactorFirebaseAuthenticationDataSource_Factory implements Factory<MultifactorFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public MultifactorFirebaseAuthenticationDataSource_Factory(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public MultifactorFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static MultifactorFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    return new MultifactorFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider);
  }

  public static MultifactorFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth) {
    return new MultifactorFirebaseAuthenticationDataSource(firebaseAuth);
  }
}
