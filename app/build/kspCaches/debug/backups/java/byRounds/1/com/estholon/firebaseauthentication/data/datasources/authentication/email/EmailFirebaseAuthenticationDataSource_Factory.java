package com.estholon.firebaseauthentication.data.datasources.authentication.email;

import android.content.Context;
import com.estholon.firebaseauthentication.data.mapper.UserMapper;
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
public final class EmailFirebaseAuthenticationDataSource_Factory implements Factory<EmailFirebaseAuthenticationDataSource> {
  private final Provider<FirebaseAuth> firebaseAuthProvider;

  private final Provider<UserMapper> userMapperProvider;

  private final Provider<Context> contextProvider;

  public EmailFirebaseAuthenticationDataSource_Factory(Provider<FirebaseAuth> firebaseAuthProvider,
      Provider<UserMapper> userMapperProvider, Provider<Context> contextProvider) {
    this.firebaseAuthProvider = firebaseAuthProvider;
    this.userMapperProvider = userMapperProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public EmailFirebaseAuthenticationDataSource get() {
    return newInstance(firebaseAuthProvider.get(), userMapperProvider.get(), contextProvider.get());
  }

  public static EmailFirebaseAuthenticationDataSource_Factory create(
      Provider<FirebaseAuth> firebaseAuthProvider, Provider<UserMapper> userMapperProvider,
      Provider<Context> contextProvider) {
    return new EmailFirebaseAuthenticationDataSource_Factory(firebaseAuthProvider, userMapperProvider, contextProvider);
  }

  public static EmailFirebaseAuthenticationDataSource newInstance(FirebaseAuth firebaseAuth,
      UserMapper userMapper, Context context) {
    return new EmailFirebaseAuthenticationDataSource(firebaseAuth, userMapper, context);
  }
}
