package com.estholon.firebaseauthentication.data.datasources.authentication.phone;

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
public final class PhoneFirebaseAuthenticationDataSource_Factory implements Factory<PhoneFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  public PhoneFirebaseAuthenticationDataSource_Factory(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
  }

  @Override
  public PhoneFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get());
  }

  public static PhoneFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider) {
    return new PhoneFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider);
  }

  public static PhoneFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth) {
    return new PhoneFirebaseAuthenticationDataSource(firebaseAuth);
  }
}
