package com.estholon.firebaseauthentication.data.datasources.authentication.microsoft;

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
public final class MicrosoftFirebaseAuthenticationDataSource_Factory implements Factory<MicrosoftFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public MicrosoftFirebaseAuthenticationDataSource_Factory(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public MicrosoftFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static MicrosoftFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    return new MicrosoftFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider);
  }

  public static MicrosoftFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth) {
    return new MicrosoftFirebaseAuthenticationDataSource(firebaseAuth);
  }
}
