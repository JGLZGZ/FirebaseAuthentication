package com.estholon.firebaseauthentication.ui.screens.authentication.recover;

import com.estholon.firebaseauthentication.domain.usecases.authentication.email.IsEmailValidUseCase;
import com.estholon.firebaseauthentication.domain.usecases.authentication.email.ResetPasswordUseCase;
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
public final class RecoverViewModel_Factory implements Factory<RecoverViewModel> {
  private final Provider<ResetPasswordUseCase> resetPasswordUseCaseProvider;

  private final Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider;

  public RecoverViewModel_Factory(Provider<ResetPasswordUseCase> resetPasswordUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider) {
    this.resetPasswordUseCaseProvider = resetPasswordUseCaseProvider;
    this.isEmailValidUseCaseProvider = isEmailValidUseCaseProvider;
  }

  @Override
  public RecoverViewModel get() {
    return newInstance(resetPasswordUseCaseProvider.get(), isEmailValidUseCaseProvider.get());
  }

  public static RecoverViewModel_Factory create(
      Provider<ResetPasswordUseCase> resetPasswordUseCaseProvider,
      Provider<IsEmailValidUseCase> isEmailValidUseCaseProvider) {
    return new RecoverViewModel_Factory(resetPasswordUseCaseProvider, isEmailValidUseCaseProvider);
  }

  public static RecoverViewModel newInstance(ResetPasswordUseCase resetPasswordUseCase,
      IsEmailValidUseCase isEmailValidUseCase) {
    return new RecoverViewModel(resetPasswordUseCase, isEmailValidUseCase);
  }
}
