package com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP.models

sealed interface VerifyOTPEvent {

    data object ScreenOpened : VerifyOTPEvent

    data class VerifyOTP(val verificationId: String, val verificationCode: String) : VerifyOTPEvent

}