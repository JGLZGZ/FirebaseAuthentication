package com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP.models

data class VerifyOTPState (
    val loading: Boolean = false,
    val error: String? = null,
    val onSuccess: Boolean = false
)