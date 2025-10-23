package com.estholon.firebaseauthentication.ui.navigation

sealed class Routes(val route: String) {

    object SplashScreen : Routes("splash")
    object SignInScreen : Routes("signIn")
    object SignUpScreen : Routes("signUp")
    object VerificationEmailScreen : Routes("verificationEmail")
    object StartEnrollScreen : Routes("startEnroll")
    object VerifyOTPScreen : Routes("verifyOTPScreen") {
        const val verificationIdArg = "verificationId"
        fun routeWithArgs(verificationId: String) = "$route/$verificationId".replace("{$verificationIdArg}", verificationId)
        val fullRoute = "$route/{$verificationIdArg}"
    }
    object RecoverScreen : Routes("recover")
    object HomeScreen : Routes("home")
}