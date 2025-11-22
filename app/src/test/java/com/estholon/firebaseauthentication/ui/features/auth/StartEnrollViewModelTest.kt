package com.estholon.firebaseauthentication.ui.features.auth

import com.estholon.authentication.domain.usecases.multifactor.StartEnrollPhoneUseCase
import com.estholon.firebaseauthentication.ui.core.helpers.eventually
import com.estholon.firebaseauthentication.ui.core.rules.MainDispatcherRule
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment.StartEnrollViewModel
import com.estholon.firebaseauthentication.ui.screens.authentication.otp.startEnrollment.models.StartEnrollEvent
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class StartEnrollViewModelTest {


    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private val startEnrollPhoneUseCase: StartEnrollPhoneUseCase = mockk()
    private lateinit var viewModel: StartEnrollViewModel

    @Before
    fun setup() {
        viewModel = StartEnrollViewModel(startEnrollPhoneUseCase)
    }

    @Test
    fun `test SendOTP event correctly`() = runTest {

        //Given
        val expectedPhone = "+1234567890"
        val expectedVerificationId = "test-verification-id-123"
        coEvery { startEnrollPhoneUseCase.invoke(phoneNumber = expectedPhone) } returns flowOf(
            Result.success(expectedVerificationId)
        )

        //When
        viewModel.dispatch(StartEnrollEvent.SendOTP(expectedPhone))

        //Then
        eventually {
            viewModel.state.loading == false && viewModel.state.verificationId == expectedVerificationId
        }

        assertNull(viewModel.state.error)
        assertEquals(expectedVerificationId,viewModel.state.verificationId)
    }


    @Test
    fun `test SendOTP event incorrectly`() = runTest {

        //Given
        val expectedPhone = "+1234567890"
        val expectedError = RuntimeException("Failed to send OTP")

        coEvery { startEnrollPhoneUseCase.invoke(phoneNumber = expectedPhone) } returns flowOf(
            Result.failure(expectedError)
        )

        //When
        viewModel.dispatch(StartEnrollEvent.SendOTP(expectedPhone))

        //Then
        eventually {
            viewModel.state.loading
        }
        eventually {
            viewModel.state.loading == false
        }

        assertEquals(expectedError.message, viewModel.state.error)
        assertNull(viewModel.state.verificationId)
    }
}