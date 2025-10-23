package com.estholon.firebaseauthentication.domain.usecases.authentication.email;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class IsEmailValidUseCaseImpl_Factory implements Factory<IsEmailValidUseCaseImpl> {
  @Override
  public IsEmailValidUseCaseImpl get() {
    return newInstance();
  }

  public static IsEmailValidUseCaseImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static IsEmailValidUseCaseImpl newInstance() {
    return new IsEmailValidUseCaseImpl();
  }

  private static final class InstanceHolder {
    private static final IsEmailValidUseCaseImpl_Factory INSTANCE = new IsEmailValidUseCaseImpl_Factory();
  }
}
