package com.estholon.firebaseauthentication.ui.screens.authentication.otp.validateOTP

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.estholon.firebaseauthentication.ui.core.components.authentication.otp.OtpCodeInput

@Composable
fun VerifyOTPScreen() {

    var code by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        OtpCodeInput(
            modifier = Modifier.weight(1f),
            value = code,
            onValueChange = { code = it },
            onFilled = { /* Submit code */ },
            isError = false,
            cellSize = 52.dp,
            cellSpacing = 10.dp,
            textStyle = MaterialTheme.typography.headlineSmall
        )

        Button(
            onClick = { /* Handle OTP submission */ },
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun ValidateOTPScreenPreview() {
    VerifyOTPScreen()
}