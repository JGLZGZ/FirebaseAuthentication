package com.estholon.firebaseauthentication;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.estholon.analytics.data.datasources.AnalyticsDataSource;
import com.estholon.analytics.data.datasources.FirebaseAnalyticsDataSource;
import com.estholon.analytics.data.mappers.AnalyticsMapper;
import com.estholon.analytics.data.repositories.AnalyticsRepositoryImpl;
import com.estholon.analytics.di.FirebaseAnalyticsModule_Companion_ProvideAnalyticsMapperFactory;
import com.estholon.analytics.di.FirebaseAnalyticsModule_Companion_ProvideFirebaseAnalyticsFactory;
import com.estholon.analytics.domain.repositories.AnalyticsRepository;
import com.estholon.analytics.domain.usecases.SendEventUseCase;
import com.estholon.analytics.domain.usecases.SendEventUseCaseImpl;
import com.estholon.firebaseauthentication.ui.screens.MainActivity;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment.StartEnrollViewModel;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment.StartEnrollViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment.StartEnrollViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment.StartEnrollViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP.VerifyOTPViewModel;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP.VerifyOTPViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP.VerifyOTPViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP.VerifyOTPViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.recover.RecoverViewModel;
import com.estholon.firebaseauthentication.ui.screens.authentication.recover.RecoverViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.authentication.recover.RecoverViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.recover.RecoverViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.signIn.SignInViewModel;
import com.estholon.firebaseauthentication.ui.screens.authentication.signIn.SignInViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.authentication.signIn.SignInViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.signIn.SignInViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.signUp.SignUpViewModel;
import com.estholon.firebaseauthentication.ui.screens.authentication.signUp.SignUpViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.authentication.signUp.SignUpViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.signUp.SignUpViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.verificationEmail.VerificationEmailViewModel;
import com.estholon.firebaseauthentication.ui.screens.authentication.verificationEmail.VerificationEmailViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.authentication.verificationEmail.VerificationEmailViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.authentication.verificationEmail.VerificationEmailViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.home.HomeViewModel;
import com.estholon.firebaseauthentication.ui.screens.home.HomeViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.home.HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.home.HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.splash.SplashViewModel;
import com.estholon.firebaseauthentication.ui.screens.splash.SplashViewModel_HiltModules;
import com.estholon.firebaseauthentication.ui.screens.splash.SplashViewModel_HiltModules_BindsModule_Binds_LazyMapKey;
import com.estholon.firebaseauthentication.ui.screens.splash.SplashViewModel_HiltModules_KeyModule_Provide_LazyMapKey;
import com.example.authentication.data.datasources.anonymously.AnonymouslyAuthenticationDataSource;
import com.example.authentication.data.datasources.anonymously.AnonymouslyFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.common.CommonAuthenticationDataSource;
import com.example.authentication.data.datasources.common.CommonFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.email.EmailAuthenticationDataSource;
import com.example.authentication.data.datasources.email.EmailFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.facebook.FacebookAuthenticationDataSource;
import com.example.authentication.data.datasources.facebook.FacebookFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.github.GitHubAuthenticationDataSource;
import com.example.authentication.data.datasources.github.GitHubFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.google.GoogleAuthenticationDataSource;
import com.example.authentication.data.datasources.google.GoogleFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.microsoft.MicrosoftAuthenticationDataSource;
import com.example.authentication.data.datasources.microsoft.MicrosoftFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.multifactor.MultifactorAuthenticationDataSource;
import com.example.authentication.data.datasources.multifactor.MultifactorFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.phone.PhoneAuthenticationDataSource;
import com.example.authentication.data.datasources.phone.PhoneFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.twitter.TwitterAuthenticationDataSource;
import com.example.authentication.data.datasources.twitter.TwitterFirebaseAuthenticationDataSource;
import com.example.authentication.data.datasources.yahoo.YahooAuthenticationDataSource;
import com.example.authentication.data.datasources.yahoo.YahooFirebaseAuthenticationDataSource;
import com.example.authentication.data.mappers.UserMapper;
import com.example.authentication.data.repositories.AuthenticationRepositoryImpl;
import com.example.authentication.di.FirebaseModule_Companion_ProvideFirebaseAuthFactory;
import com.example.authentication.di.FirebaseModule_Companion_ProvideUserMapperFactory;
import com.example.authentication.domain.repositories.AuthenticationRepository;
import com.example.authentication.domain.usecases.anonymously.SignInAnonymouslyUseCase;
import com.example.authentication.domain.usecases.anonymously.SignInAnonymouslyUseCaseImpl;
import com.example.authentication.domain.usecases.common.IsEmailVerifiedUseCase;
import com.example.authentication.domain.usecases.common.IsEmailVerifiedUseCaseImpl;
import com.example.authentication.domain.usecases.common.IsUserLoggedUseCaseImpl;
import com.example.authentication.domain.usecases.common.SignOutUseCase;
import com.example.authentication.domain.usecases.common.SignOutUseCaseImpl;
import com.example.authentication.domain.usecases.email.IsEmailValidUseCase;
import com.example.authentication.domain.usecases.email.IsEmailValidUseCaseImpl;
import com.example.authentication.domain.usecases.email.IsPasswordValidUseCase;
import com.example.authentication.domain.usecases.email.IsPasswordValidUseCaseImpl;
import com.example.authentication.domain.usecases.email.LinkEmailUseCase;
import com.example.authentication.domain.usecases.email.LinkEmailUseCaseImpl;
import com.example.authentication.domain.usecases.email.ResetPasswordUseCase;
import com.example.authentication.domain.usecases.email.ResetPasswordUseCaseImpl;
import com.example.authentication.domain.usecases.email.SignInEmailUseCase;
import com.example.authentication.domain.usecases.email.SignInEmailUseCaseImpl;
import com.example.authentication.domain.usecases.email.SignUpEmailUseCase;
import com.example.authentication.domain.usecases.email.SignUpEmailUseCaseImpl;
import com.example.authentication.domain.usecases.facebook.LinkFacebookUseCase;
import com.example.authentication.domain.usecases.facebook.LinkFacebookUseCaseImpl;
import com.example.authentication.domain.usecases.facebook.SignInFacebookUseCase;
import com.example.authentication.domain.usecases.facebook.SignInFacebookUseCaseImpl;
import com.example.authentication.domain.usecases.github.LinkGitHubUseCase;
import com.example.authentication.domain.usecases.github.LinkGitHubUseCaseImpl;
import com.example.authentication.domain.usecases.github.SignInGitHubUseCase;
import com.example.authentication.domain.usecases.github.SignInGitHubUseCaseImpl;
import com.example.authentication.domain.usecases.google.ClearCredentialStateUseCase;
import com.example.authentication.domain.usecases.google.ClearCredentialStateUseCaseImpl;
import com.example.authentication.domain.usecases.google.LinkGoogleUseCase;
import com.example.authentication.domain.usecases.google.LinkGoogleUseCaseImpl;
import com.example.authentication.domain.usecases.google.SignInGoogleCredentialManagerUseCase;
import com.example.authentication.domain.usecases.google.SignInGoogleCredentialManagerUseCaseImpl;
import com.example.authentication.domain.usecases.google.SignInGoogleUseCase;
import com.example.authentication.domain.usecases.google.SignInGoogleUseCaseImpl;
import com.example.authentication.domain.usecases.microsoft.LinkMicrosoftUseCase;
import com.example.authentication.domain.usecases.microsoft.LinkMicrosoftUseCaseImpl;
import com.example.authentication.domain.usecases.microsoft.SignInMicrosoftUseCase;
import com.example.authentication.domain.usecases.microsoft.SignInMicrosoftUseCaseImpl;
import com.example.authentication.domain.usecases.multifactor.SendVerificationEmailUseCase;
import com.example.authentication.domain.usecases.multifactor.SendVerificationEmailUseCaseImpl;
import com.example.authentication.domain.usecases.multifactor.StartEnrollPhoneUseCase;
import com.example.authentication.domain.usecases.multifactor.StartEnrollPhoneUseCaseImpl;
import com.example.authentication.domain.usecases.twitter.LinkTwitterUseCase;
import com.example.authentication.domain.usecases.twitter.LinkTwitterUseCaseImpl;
import com.example.authentication.domain.usecases.twitter.SignInTwitterUseCase;
import com.example.authentication.domain.usecases.twitter.SignInTwitterUseCaseImpl;
import com.example.authentication.domain.usecases.yahoo.LinkYahooUseCase;
import com.example.authentication.domain.usecases.yahoo.LinkYahooUseCaseImpl;
import com.example.authentication.domain.usecases.yahoo.SignInYahooUseCase;
import com.example.authentication.domain.usecases.yahoo.SignInYahooUseCaseImpl;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.FirebaseAuth;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

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
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class DaggerFirebaseAuthenticationApp_HiltComponents_SingletonC {
  private DaggerFirebaseAuthenticationApp_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public FirebaseAuthenticationApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements FirebaseAuthenticationApp_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public FirebaseAuthenticationApp_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements FirebaseAuthenticationApp_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public FirebaseAuthenticationApp_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements FirebaseAuthenticationApp_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public FirebaseAuthenticationApp_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements FirebaseAuthenticationApp_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public FirebaseAuthenticationApp_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements FirebaseAuthenticationApp_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public FirebaseAuthenticationApp_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements FirebaseAuthenticationApp_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public FirebaseAuthenticationApp_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements FirebaseAuthenticationApp_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public FirebaseAuthenticationApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends FirebaseAuthenticationApp_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends FirebaseAuthenticationApp_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends FirebaseAuthenticationApp_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends FirebaseAuthenticationApp_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(ImmutableMap.<String, Boolean>builderWithExpectedSize(8).put(HomeViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, HomeViewModel_HiltModules.KeyModule.provide()).put(RecoverViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, RecoverViewModel_HiltModules.KeyModule.provide()).put(SignInViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, SignInViewModel_HiltModules.KeyModule.provide()).put(SignUpViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, SignUpViewModel_HiltModules.KeyModule.provide()).put(SplashViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, SplashViewModel_HiltModules.KeyModule.provide()).put(StartEnrollViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, StartEnrollViewModel_HiltModules.KeyModule.provide()).put(VerificationEmailViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, VerificationEmailViewModel_HiltModules.KeyModule.provide()).put(VerifyOTPViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, VerifyOTPViewModel_HiltModules.KeyModule.provide()).build());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends FirebaseAuthenticationApp_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<HomeViewModel> homeViewModelProvider;

    Provider<RecoverViewModel> recoverViewModelProvider;

    Provider<SignInViewModel> signInViewModelProvider;

    Provider<SignUpViewModel> signUpViewModelProvider;

    Provider<SplashViewModel> splashViewModelProvider;

    Provider<StartEnrollViewModel> startEnrollViewModelProvider;

    Provider<VerificationEmailViewModel> verificationEmailViewModelProvider;

    Provider<VerifyOTPViewModel> verifyOTPViewModelProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    IsUserLoggedUseCaseImpl isUserLoggedUseCaseImpl() {
      return new IsUserLoggedUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.homeViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
      this.recoverViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 1);
      this.signInViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 2);
      this.signUpViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 3);
      this.splashViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 4);
      this.startEnrollViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 5);
      this.verificationEmailViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 6);
      this.verifyOTPViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 7);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(ImmutableMap.<String, javax.inject.Provider<ViewModel>>builderWithExpectedSize(8).put(HomeViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (homeViewModelProvider))).put(RecoverViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (recoverViewModelProvider))).put(SignInViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (signInViewModelProvider))).put(SignUpViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (signUpViewModelProvider))).put(SplashViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (splashViewModelProvider))).put(StartEnrollViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (startEnrollViewModelProvider))).put(VerificationEmailViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (verificationEmailViewModelProvider))).put(VerifyOTPViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (verifyOTPViewModelProvider))).build());
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return ImmutableMap.<Class<?>, Object>of();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // com.estholon.firebaseauthentication.ui.screens.home.HomeViewModel
          return (T) new HomeViewModel(singletonCImpl.provideSignOutUseCaseProvider.get(), singletonCImpl.provideIsEmailValidUseCaseProvider.get(), singletonCImpl.provideIsPasswordValidUseCaseProvider.get(), singletonCImpl.provideLinkEmailUseCaseProvider.get(), singletonCImpl.provideLinkGoogleUseCaseProvider.get(), singletonCImpl.provideLinkFacebookUseCaseProvider.get(), singletonCImpl.provideLinkGitHubUseCaseProvider.get(), singletonCImpl.provideLinkMicrosoftUseCaseProvider.get(), singletonCImpl.provideLinkYahooUseCaseProvider.get(), singletonCImpl.provideLinkTwitterUseCaseProvider.get());

          case 1: // com.estholon.firebaseauthentication.ui.screens.authentication.recover.RecoverViewModel
          return (T) new RecoverViewModel(singletonCImpl.provideResetPasswordUseCaseProvider.get(), singletonCImpl.provideIsEmailValidUseCaseProvider.get());

          case 2: // com.estholon.firebaseauthentication.ui.screens.authentication.signIn.SignInViewModel
          return (T) new SignInViewModel(singletonCImpl.provideSignInEmailUseCaseProvider.get(), singletonCImpl.provideSignInAnonymouslyUseCaseProvider.get(), singletonCImpl.provideSignInGoogleCredentialManagerUseCaseProvider.get(), singletonCImpl.provideSignInGoogleUseCaseProvider.get(), singletonCImpl.provideSignInFacebookUseCaseProvider.get(), singletonCImpl.provideSignInGitHubUseCaseProvider.get(), singletonCImpl.provideSignInMicrosoftUseCaseProvider.get(), singletonCImpl.provideSignInTwitterUseCaseProvider.get(), singletonCImpl.provideSignInYahooUseCaseProvider.get(), singletonCImpl.provideClearCredentialStateUseCaseProvider.get(), singletonCImpl.provideIsEmailValidUseCaseProvider.get(), singletonCImpl.provideIsPasswordValidUseCaseProvider.get());

          case 3: // com.estholon.firebaseauthentication.ui.screens.authentication.signUp.SignUpViewModel
          return (T) new SignUpViewModel(singletonCImpl.provideSignUpEmailUseCaseProvider.get(), singletonCImpl.signInAnonymouslyUseCaseImpl(), singletonCImpl.provideSignInFacebookUseCaseProvider.get(), singletonCImpl.provideSignInGoogleCredentialManagerUseCaseProvider.get(), singletonCImpl.provideSignInGoogleUseCaseProvider.get(), singletonCImpl.provideClearCredentialStateUseCaseProvider.get(), singletonCImpl.provideSignInYahooUseCaseProvider.get(), singletonCImpl.provideSignInMicrosoftUseCaseProvider.get(), singletonCImpl.provideSignInGitHubUseCaseProvider.get(), singletonCImpl.provideSignInTwitterUseCaseProvider.get(), singletonCImpl.provideIsEmailValidUseCaseProvider.get(), singletonCImpl.provideIsPasswordValidUseCaseProvider.get());

          case 4: // com.estholon.firebaseauthentication.ui.screens.splash.SplashViewModel
          return (T) new SplashViewModel(viewModelCImpl.isUserLoggedUseCaseImpl());

          case 5: // com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment.StartEnrollViewModel
          return (T) new StartEnrollViewModel(singletonCImpl.provideStartEnrollPhoneUseCaseProvider.get());

          case 6: // com.estholon.firebaseauthentication.ui.screens.authentication.verificationEmail.VerificationEmailViewModel
          return (T) new VerificationEmailViewModel(singletonCImpl.provideIsEmailVerifiedUseCaseProvider.get(), singletonCImpl.provideSendVerificationEmailUseCaseProvider.get());

          case 7: // com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP.VerifyOTPViewModel
          return (T) new VerifyOTPViewModel(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends FirebaseAuthenticationApp_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends FirebaseAuthenticationApp_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends FirebaseAuthenticationApp_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<FirebaseAuth> provideFirebaseAuthProvider;

    Provider<UserMapper> provideUserMapperProvider;

    Provider<EmailFirebaseAuthenticationDataSource> emailFirebaseAuthenticationDataSourceProvider;

    Provider<EmailAuthenticationDataSource> bindEmailAuthenticationDataSourceProvider;

    Provider<GoogleFirebaseAuthenticationDataSource> googleFirebaseAuthenticationDataSourceProvider;

    Provider<GoogleAuthenticationDataSource> bindGoogleAuthenticationDataSourceProvider;

    Provider<CommonFirebaseAuthenticationDataSource> commonFirebaseAuthenticationDataSourceProvider;

    Provider<CommonAuthenticationDataSource> bindCommonAuthenticationDataSourceProvider;

    Provider<AnonymouslyFirebaseAuthenticationDataSource> anonymouslyFirebaseAuthenticationDataSourceProvider;

    Provider<AnonymouslyAuthenticationDataSource> bindAnonymouslyAuthenticationDataSourceProvider;

    Provider<FacebookFirebaseAuthenticationDataSource> facebookFirebaseAuthenticationDataSourceProvider;

    Provider<FacebookAuthenticationDataSource> bindFacebookAuthenticationDataSourceProvider;

    Provider<GitHubFirebaseAuthenticationDataSource> gitHubFirebaseAuthenticationDataSourceProvider;

    Provider<GitHubAuthenticationDataSource> bindGitHubAuthenticationDataSourceProvider;

    Provider<MicrosoftFirebaseAuthenticationDataSource> microsoftFirebaseAuthenticationDataSourceProvider;

    Provider<MicrosoftAuthenticationDataSource> bindMicrosoftAuthenticationDataSourceProvider;

    Provider<PhoneFirebaseAuthenticationDataSource> phoneFirebaseAuthenticationDataSourceProvider;

    Provider<PhoneAuthenticationDataSource> bindPhoneAuthenticationDataSourceProvider;

    Provider<TwitterFirebaseAuthenticationDataSource> twitterFirebaseAuthenticationDataSourceProvider;

    Provider<TwitterAuthenticationDataSource> bindTwitterAuthenticationDataSourceProvider;

    Provider<YahooFirebaseAuthenticationDataSource> yahooFirebaseAuthenticationDataSourceProvider;

    Provider<YahooAuthenticationDataSource> bindYahooAuthenticationDataSourceProvider;

    Provider<MultifactorFirebaseAuthenticationDataSource> multifactorFirebaseAuthenticationDataSourceProvider;

    Provider<MultifactorAuthenticationDataSource> bindMultifactorAuthenticationDataSourceProvider;

    Provider<AuthenticationRepositoryImpl> authenticationRepositoryImplProvider;

    Provider<AuthenticationRepository> bindAuthenticationRepositoryProvider;

    Provider<SignOutUseCaseImpl> signOutUseCaseImplProvider;

    Provider<SignOutUseCase> provideSignOutUseCaseProvider;

    Provider<IsEmailValidUseCaseImpl> isEmailValidUseCaseImplProvider;

    Provider<IsEmailValidUseCase> provideIsEmailValidUseCaseProvider;

    Provider<IsPasswordValidUseCaseImpl> isPasswordValidUseCaseImplProvider;

    Provider<IsPasswordValidUseCase> provideIsPasswordValidUseCaseProvider;

    Provider<LinkEmailUseCaseImpl> linkEmailUseCaseImplProvider;

    Provider<LinkEmailUseCase> provideLinkEmailUseCaseProvider;

    Provider<LinkGoogleUseCaseImpl> linkGoogleUseCaseImplProvider;

    Provider<LinkGoogleUseCase> provideLinkGoogleUseCaseProvider;

    Provider<LinkFacebookUseCaseImpl> linkFacebookUseCaseImplProvider;

    Provider<LinkFacebookUseCase> provideLinkFacebookUseCaseProvider;

    Provider<LinkGitHubUseCaseImpl> linkGitHubUseCaseImplProvider;

    Provider<LinkGitHubUseCase> provideLinkGitHubUseCaseProvider;

    Provider<LinkMicrosoftUseCaseImpl> linkMicrosoftUseCaseImplProvider;

    Provider<LinkMicrosoftUseCase> provideLinkMicrosoftUseCaseProvider;

    Provider<LinkYahooUseCaseImpl> linkYahooUseCaseImplProvider;

    Provider<LinkYahooUseCase> provideLinkYahooUseCaseProvider;

    Provider<LinkTwitterUseCaseImpl> linkTwitterUseCaseImplProvider;

    Provider<LinkTwitterUseCase> provideLinkTwitterUseCaseProvider;

    Provider<ResetPasswordUseCaseImpl> resetPasswordUseCaseImplProvider;

    Provider<ResetPasswordUseCase> provideResetPasswordUseCaseProvider;

    Provider<FirebaseAnalytics> provideFirebaseAnalyticsProvider;

    Provider<FirebaseAnalyticsDataSource> firebaseAnalyticsDataSourceProvider;

    Provider<AnalyticsDataSource> bindAnalyticsDataSourceProvider;

    Provider<AnalyticsMapper> provideAnalyticsMapperProvider;

    Provider<AnalyticsRepositoryImpl> analyticsRepositoryImplProvider;

    Provider<AnalyticsRepository> bindAnalyticsRepositoryProvider;

    Provider<SendEventUseCaseImpl> sendEventUseCaseImplProvider;

    Provider<SendEventUseCase> provideSendEventUseCaseProvider;

    Provider<SignInEmailUseCaseImpl> signInEmailUseCaseImplProvider;

    Provider<SignInEmailUseCase> provideSignInEmailUseCaseProvider;

    Provider<SignInAnonymouslyUseCaseImpl> signInAnonymouslyUseCaseImplProvider;

    Provider<SignInAnonymouslyUseCase> provideSignInAnonymouslyUseCaseProvider;

    Provider<SignInGoogleCredentialManagerUseCaseImpl> signInGoogleCredentialManagerUseCaseImplProvider;

    Provider<SignInGoogleCredentialManagerUseCase> provideSignInGoogleCredentialManagerUseCaseProvider;

    Provider<SendVerificationEmailUseCaseImpl> sendVerificationEmailUseCaseImplProvider;

    Provider<SendVerificationEmailUseCase> provideSendVerificationEmailUseCaseProvider;

    Provider<SignInGoogleUseCaseImpl> signInGoogleUseCaseImplProvider;

    Provider<SignInGoogleUseCase> provideSignInGoogleUseCaseProvider;

    Provider<SignInFacebookUseCaseImpl> signInFacebookUseCaseImplProvider;

    Provider<SignInFacebookUseCase> provideSignInFacebookUseCaseProvider;

    Provider<SignInGitHubUseCaseImpl> signInGitHubUseCaseImplProvider;

    Provider<SignInGitHubUseCase> provideSignInGitHubUseCaseProvider;

    Provider<SignInMicrosoftUseCaseImpl> signInMicrosoftUseCaseImplProvider;

    Provider<SignInMicrosoftUseCase> provideSignInMicrosoftUseCaseProvider;

    Provider<SignInTwitterUseCaseImpl> signInTwitterUseCaseImplProvider;

    Provider<SignInTwitterUseCase> provideSignInTwitterUseCaseProvider;

    Provider<SignInYahooUseCaseImpl> signInYahooUseCaseImplProvider;

    Provider<SignInYahooUseCase> provideSignInYahooUseCaseProvider;

    Provider<ClearCredentialStateUseCaseImpl> clearCredentialStateUseCaseImplProvider;

    Provider<ClearCredentialStateUseCase> provideClearCredentialStateUseCaseProvider;

    Provider<SignUpEmailUseCaseImpl> signUpEmailUseCaseImplProvider;

    Provider<SignUpEmailUseCase> provideSignUpEmailUseCaseProvider;

    Provider<StartEnrollPhoneUseCaseImpl> startEnrollPhoneUseCaseImplProvider;

    Provider<StartEnrollPhoneUseCase> provideStartEnrollPhoneUseCaseProvider;

    Provider<IsEmailVerifiedUseCaseImpl> isEmailVerifiedUseCaseImplProvider;

    Provider<IsEmailVerifiedUseCase> provideIsEmailVerifiedUseCaseProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);
      initialize2(applicationContextModuleParam);
      initialize3(applicationContextModuleParam);
      initialize4(applicationContextModuleParam);

    }

    SignInAnonymouslyUseCaseImpl signInAnonymouslyUseCaseImpl() {
      return new SignInAnonymouslyUseCaseImpl(bindAuthenticationRepositoryProvider.get(), provideSendEventUseCaseProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideFirebaseAuthProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseAuth>(singletonCImpl, 3));
      this.provideUserMapperProvider = DoubleCheck.provider(new SwitchingProvider<UserMapper>(singletonCImpl, 6));
      this.emailFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 5);
      this.bindEmailAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (emailFirebaseAuthenticationDataSourceProvider));
      this.googleFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 4);
      this.bindGoogleAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (googleFirebaseAuthenticationDataSourceProvider));
      this.commonFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 2);
      this.bindCommonAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (commonFirebaseAuthenticationDataSourceProvider));
      this.anonymouslyFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 7);
      this.bindAnonymouslyAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (anonymouslyFirebaseAuthenticationDataSourceProvider));
      this.facebookFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 8);
      this.bindFacebookAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (facebookFirebaseAuthenticationDataSourceProvider));
      this.gitHubFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 9);
      this.bindGitHubAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (gitHubFirebaseAuthenticationDataSourceProvider));
      this.microsoftFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 10);
      this.bindMicrosoftAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (microsoftFirebaseAuthenticationDataSourceProvider));
      this.phoneFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 11);
      this.bindPhoneAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (phoneFirebaseAuthenticationDataSourceProvider));
      this.twitterFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 12);
      this.bindTwitterAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (twitterFirebaseAuthenticationDataSourceProvider));
      this.yahooFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 13);
      this.bindYahooAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (yahooFirebaseAuthenticationDataSourceProvider));
      this.multifactorFirebaseAuthenticationDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 14);
      this.bindMultifactorAuthenticationDataSourceProvider = DoubleCheck.provider((Provider) (multifactorFirebaseAuthenticationDataSourceProvider));
      this.authenticationRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 1);
    }

    @SuppressWarnings("unchecked")
    private void initialize2(final ApplicationContextModule applicationContextModuleParam) {
      this.bindAuthenticationRepositoryProvider = DoubleCheck.provider((Provider) (authenticationRepositoryImplProvider));
      this.signOutUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 0);
      this.provideSignOutUseCaseProvider = DoubleCheck.provider((Provider) (signOutUseCaseImplProvider));
      this.isEmailValidUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 15);
      this.provideIsEmailValidUseCaseProvider = DoubleCheck.provider((Provider) (isEmailValidUseCaseImplProvider));
      this.isPasswordValidUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 16);
      this.provideIsPasswordValidUseCaseProvider = DoubleCheck.provider((Provider) (isPasswordValidUseCaseImplProvider));
      this.linkEmailUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 17);
      this.provideLinkEmailUseCaseProvider = DoubleCheck.provider((Provider) (linkEmailUseCaseImplProvider));
      this.linkGoogleUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 18);
      this.provideLinkGoogleUseCaseProvider = DoubleCheck.provider((Provider) (linkGoogleUseCaseImplProvider));
      this.linkFacebookUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 19);
      this.provideLinkFacebookUseCaseProvider = DoubleCheck.provider((Provider) (linkFacebookUseCaseImplProvider));
      this.linkGitHubUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 20);
      this.provideLinkGitHubUseCaseProvider = DoubleCheck.provider((Provider) (linkGitHubUseCaseImplProvider));
      this.linkMicrosoftUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 21);
      this.provideLinkMicrosoftUseCaseProvider = DoubleCheck.provider((Provider) (linkMicrosoftUseCaseImplProvider));
      this.linkYahooUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 22);
      this.provideLinkYahooUseCaseProvider = DoubleCheck.provider((Provider) (linkYahooUseCaseImplProvider));
      this.linkTwitterUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 23);
      this.provideLinkTwitterUseCaseProvider = DoubleCheck.provider((Provider) (linkTwitterUseCaseImplProvider));
      this.resetPasswordUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 24);
      this.provideResetPasswordUseCaseProvider = DoubleCheck.provider((Provider) (resetPasswordUseCaseImplProvider));
      this.provideFirebaseAnalyticsProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseAnalytics>(singletonCImpl, 29));
      this.firebaseAnalyticsDataSourceProvider = new SwitchingProvider<>(singletonCImpl, 28);
    }

    @SuppressWarnings("unchecked")
    private void initialize3(final ApplicationContextModule applicationContextModuleParam) {
      this.bindAnalyticsDataSourceProvider = DoubleCheck.provider((Provider) (firebaseAnalyticsDataSourceProvider));
      this.provideAnalyticsMapperProvider = DoubleCheck.provider(new SwitchingProvider<AnalyticsMapper>(singletonCImpl, 30));
      this.analyticsRepositoryImplProvider = new SwitchingProvider<>(singletonCImpl, 27);
      this.bindAnalyticsRepositoryProvider = DoubleCheck.provider((Provider) (analyticsRepositoryImplProvider));
      this.sendEventUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 26);
      this.provideSendEventUseCaseProvider = DoubleCheck.provider((Provider) (sendEventUseCaseImplProvider));
      this.signInEmailUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 25);
      this.provideSignInEmailUseCaseProvider = DoubleCheck.provider((Provider) (signInEmailUseCaseImplProvider));
      this.signInAnonymouslyUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 31);
      this.provideSignInAnonymouslyUseCaseProvider = DoubleCheck.provider((Provider) (signInAnonymouslyUseCaseImplProvider));
      this.signInGoogleCredentialManagerUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 32);
      this.provideSignInGoogleCredentialManagerUseCaseProvider = DoubleCheck.provider((Provider) (signInGoogleCredentialManagerUseCaseImplProvider));
      this.sendVerificationEmailUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 34);
      this.provideSendVerificationEmailUseCaseProvider = DoubleCheck.provider((Provider) (sendVerificationEmailUseCaseImplProvider));
      this.signInGoogleUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 33);
      this.provideSignInGoogleUseCaseProvider = DoubleCheck.provider((Provider) (signInGoogleUseCaseImplProvider));
      this.signInFacebookUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 35);
      this.provideSignInFacebookUseCaseProvider = DoubleCheck.provider((Provider) (signInFacebookUseCaseImplProvider));
      this.signInGitHubUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 36);
      this.provideSignInGitHubUseCaseProvider = DoubleCheck.provider((Provider) (signInGitHubUseCaseImplProvider));
      this.signInMicrosoftUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 37);
      this.provideSignInMicrosoftUseCaseProvider = DoubleCheck.provider((Provider) (signInMicrosoftUseCaseImplProvider));
      this.signInTwitterUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 38);
      this.provideSignInTwitterUseCaseProvider = DoubleCheck.provider((Provider) (signInTwitterUseCaseImplProvider));
      this.signInYahooUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 39);
    }

    @SuppressWarnings("unchecked")
    private void initialize4(final ApplicationContextModule applicationContextModuleParam) {
      this.provideSignInYahooUseCaseProvider = DoubleCheck.provider((Provider) (signInYahooUseCaseImplProvider));
      this.clearCredentialStateUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 40);
      this.provideClearCredentialStateUseCaseProvider = DoubleCheck.provider((Provider) (clearCredentialStateUseCaseImplProvider));
      this.signUpEmailUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 41);
      this.provideSignUpEmailUseCaseProvider = DoubleCheck.provider((Provider) (signUpEmailUseCaseImplProvider));
      this.startEnrollPhoneUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 42);
      this.provideStartEnrollPhoneUseCaseProvider = DoubleCheck.provider((Provider) (startEnrollPhoneUseCaseImplProvider));
      this.isEmailVerifiedUseCaseImplProvider = new SwitchingProvider<>(singletonCImpl, 43);
      this.provideIsEmailVerifiedUseCaseProvider = DoubleCheck.provider((Provider) (isEmailVerifiedUseCaseImplProvider));
    }

    @Override
    public void injectFirebaseAuthenticationApp(FirebaseAuthenticationApp arg0) {
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return ImmutableSet.<Boolean>of();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // com.example.authentication.domain.usecases.common.SignOutUseCaseImpl
          return (T) new SignOutUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 1: // com.example.authentication.data.repositories.AuthenticationRepositoryImpl
          return (T) new AuthenticationRepositoryImpl(singletonCImpl.bindCommonAuthenticationDataSourceProvider.get(), singletonCImpl.bindAnonymouslyAuthenticationDataSourceProvider.get(), singletonCImpl.bindEmailAuthenticationDataSourceProvider.get(), singletonCImpl.bindGoogleAuthenticationDataSourceProvider.get(), singletonCImpl.bindFacebookAuthenticationDataSourceProvider.get(), singletonCImpl.bindGitHubAuthenticationDataSourceProvider.get(), singletonCImpl.bindMicrosoftAuthenticationDataSourceProvider.get(), singletonCImpl.bindPhoneAuthenticationDataSourceProvider.get(), singletonCImpl.bindTwitterAuthenticationDataSourceProvider.get(), singletonCImpl.bindYahooAuthenticationDataSourceProvider.get(), singletonCImpl.bindMultifactorAuthenticationDataSourceProvider.get(), singletonCImpl.provideUserMapperProvider.get());

          case 2: // com.example.authentication.data.datasources.common.CommonFirebaseAuthenticationDataSource
          return (T) new CommonFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get(), singletonCImpl.bindGoogleAuthenticationDataSourceProvider.get());

          case 3: // com.google.firebase.auth.FirebaseAuth
          return (T) FirebaseModule_Companion_ProvideFirebaseAuthFactory.provideFirebaseAuth();

          case 4: // com.example.authentication.data.datasources.google.GoogleFirebaseAuthenticationDataSource
          return (T) new GoogleFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get(), singletonCImpl.bindEmailAuthenticationDataSourceProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 5: // com.example.authentication.data.datasources.email.EmailFirebaseAuthenticationDataSource
          return (T) new EmailFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get(), singletonCImpl.provideUserMapperProvider.get(), ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 6: // com.example.authentication.data.mappers.UserMapper
          return (T) FirebaseModule_Companion_ProvideUserMapperFactory.provideUserMapper();

          case 7: // com.example.authentication.data.datasources.anonymously.AnonymouslyFirebaseAuthenticationDataSource
          return (T) new AnonymouslyFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 8: // com.example.authentication.data.datasources.facebook.FacebookFirebaseAuthenticationDataSource
          return (T) new FacebookFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 9: // com.example.authentication.data.datasources.github.GitHubFirebaseAuthenticationDataSource
          return (T) new GitHubFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 10: // com.example.authentication.data.datasources.microsoft.MicrosoftFirebaseAuthenticationDataSource
          return (T) new MicrosoftFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 11: // com.example.authentication.data.datasources.phone.PhoneFirebaseAuthenticationDataSource
          return (T) new PhoneFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 12: // com.example.authentication.data.datasources.twitter.TwitterFirebaseAuthenticationDataSource
          return (T) new TwitterFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 13: // com.example.authentication.data.datasources.yahoo.YahooFirebaseAuthenticationDataSource
          return (T) new YahooFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 14: // com.example.authentication.data.datasources.multifactor.MultifactorFirebaseAuthenticationDataSource
          return (T) new MultifactorFirebaseAuthenticationDataSource(singletonCImpl.provideFirebaseAuthProvider.get());

          case 15: // com.example.authentication.domain.usecases.email.IsEmailValidUseCaseImpl
          return (T) new IsEmailValidUseCaseImpl();

          case 16: // com.example.authentication.domain.usecases.email.IsPasswordValidUseCaseImpl
          return (T) new IsPasswordValidUseCaseImpl();

          case 17: // com.example.authentication.domain.usecases.email.LinkEmailUseCaseImpl
          return (T) new LinkEmailUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 18: // com.example.authentication.domain.usecases.google.LinkGoogleUseCaseImpl
          return (T) new LinkGoogleUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 19: // com.example.authentication.domain.usecases.facebook.LinkFacebookUseCaseImpl
          return (T) new LinkFacebookUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 20: // com.example.authentication.domain.usecases.github.LinkGitHubUseCaseImpl
          return (T) new LinkGitHubUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 21: // com.example.authentication.domain.usecases.microsoft.LinkMicrosoftUseCaseImpl
          return (T) new LinkMicrosoftUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 22: // com.example.authentication.domain.usecases.yahoo.LinkYahooUseCaseImpl
          return (T) new LinkYahooUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 23: // com.example.authentication.domain.usecases.twitter.LinkTwitterUseCaseImpl
          return (T) new LinkTwitterUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 24: // com.example.authentication.domain.usecases.email.ResetPasswordUseCaseImpl
          return (T) new ResetPasswordUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 25: // com.example.authentication.domain.usecases.email.SignInEmailUseCaseImpl
          return (T) new SignInEmailUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 26: // com.estholon.analytics.domain.usecases.SendEventUseCaseImpl
          return (T) new SendEventUseCaseImpl(singletonCImpl.bindAnalyticsRepositoryProvider.get());

          case 27: // com.estholon.analytics.data.repositories.AnalyticsRepositoryImpl
          return (T) new AnalyticsRepositoryImpl(singletonCImpl.bindAnalyticsDataSourceProvider.get(), singletonCImpl.provideAnalyticsMapperProvider.get());

          case 28: // com.estholon.analytics.data.datasources.FirebaseAnalyticsDataSource
          return (T) new FirebaseAnalyticsDataSource(singletonCImpl.provideFirebaseAnalyticsProvider.get());

          case 29: // com.google.firebase.analytics.FirebaseAnalytics
          return (T) FirebaseAnalyticsModule_Companion_ProvideFirebaseAnalyticsFactory.provideFirebaseAnalytics();

          case 30: // com.estholon.analytics.data.mappers.AnalyticsMapper
          return (T) FirebaseAnalyticsModule_Companion_ProvideAnalyticsMapperFactory.provideAnalyticsMapper();

          case 31: // com.example.authentication.domain.usecases.anonymously.SignInAnonymouslyUseCaseImpl
          return (T) new SignInAnonymouslyUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 32: // com.example.authentication.domain.usecases.google.SignInGoogleCredentialManagerUseCaseImpl
          return (T) new SignInGoogleCredentialManagerUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 33: // com.example.authentication.domain.usecases.google.SignInGoogleUseCaseImpl
          return (T) new SignInGoogleUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendVerificationEmailUseCaseProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 34: // com.example.authentication.domain.usecases.multifactor.SendVerificationEmailUseCaseImpl
          return (T) new SendVerificationEmailUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 35: // com.example.authentication.domain.usecases.facebook.SignInFacebookUseCaseImpl
          return (T) new SignInFacebookUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 36: // com.example.authentication.domain.usecases.github.SignInGitHubUseCaseImpl
          return (T) new SignInGitHubUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 37: // com.example.authentication.domain.usecases.microsoft.SignInMicrosoftUseCaseImpl
          return (T) new SignInMicrosoftUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 38: // com.example.authentication.domain.usecases.twitter.SignInTwitterUseCaseImpl
          return (T) new SignInTwitterUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 39: // com.example.authentication.domain.usecases.yahoo.SignInYahooUseCaseImpl
          return (T) new SignInYahooUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 40: // com.example.authentication.domain.usecases.google.ClearCredentialStateUseCaseImpl
          return (T) new ClearCredentialStateUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          case 41: // com.example.authentication.domain.usecases.email.SignUpEmailUseCaseImpl
          return (T) new SignUpEmailUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 42: // com.example.authentication.domain.usecases.multifactor.StartEnrollPhoneUseCaseImpl
          return (T) new StartEnrollPhoneUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get(), singletonCImpl.provideSendEventUseCaseProvider.get());

          case 43: // com.example.authentication.domain.usecases.common.IsEmailVerifiedUseCaseImpl
          return (T) new IsEmailVerifiedUseCaseImpl(singletonCImpl.bindAuthenticationRepositoryProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
