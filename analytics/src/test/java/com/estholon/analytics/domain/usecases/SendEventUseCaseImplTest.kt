package com.estholon.analytics.domain.usecases

import android.os.Bundle
import com.estholon.analytics.domain.models.AnalyticsModel
import com.estholon.analytics.domain.repositories.AnalyticsRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.slot
import io.mockk.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class SendEventUseCaseImplTest {

    private lateinit var analyticsRepository: AnalyticsRepository
    private lateinit var useCase: SendEventUseCaseImpl

    @Before
    fun setUp() {
        analyticsRepository = mockk(relaxed = true)
        useCase = SendEventUseCaseImpl(analyticsRepository)
    }

    // ==================== CONSTRUCTOR TESTS ====================

    @Test
    fun `useCase can be instantiated`() {
        val newUseCase = SendEventUseCaseImpl(analyticsRepository)
        assertNotNull(newUseCase)
    }

    // ==================== INVOKE TESTS ====================

    @Test
    fun `invoke calls repository sendEvent`() {
        val analytics = AnalyticsModel(title = "test_event")

        useCase(analytics)

        verify(exactly = 1) { analyticsRepository.sendEvent(analytics) }
    }

    @Test
    fun `invoke passes analytics model to repository`() {
        val analytics = AnalyticsModel(title = "test_event")
        val analyticsSlot = slot<AnalyticsModel>()

        every { analyticsRepository.sendEvent(capture(analyticsSlot)) } returns Unit

        useCase(analytics)

        assertEquals(analytics, analyticsSlot.captured)
        assertEquals("test_event", analyticsSlot.captured.title)
    }

    @Test
    fun `invoke with title only sends correct model`() {
        val analytics = AnalyticsModel(title = "simple_event")

        useCase(analytics)

        verify { analyticsRepository.sendEvent(match { it.title == "simple_event" }) }
    }

    @Test
    fun `invoke with analyticsString sends correct model`() {
        val stringPairs = listOf(
            "key1" to "value1",
            "key2" to "value2"
        )
        val analytics = AnalyticsModel(
            title = "string_event",
            analyticsString = stringPairs
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "string_event" &&
                it.analyticsString == stringPairs
            })
        }
    }

    @Test
    fun `invoke with analyticsDouble sends correct model`() {
        val doublePairs = listOf(
            "price" to 19.99,
            "quantity" to 5.0
        )
        val analytics = AnalyticsModel(
            title = "double_event",
            analyticsDouble = doublePairs
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "double_event" &&
                it.analyticsDouble == doublePairs
            })
        }
    }

    @Test
    fun `invoke with analyticsLong sends correct model`() {
        val longPairs = listOf(
            "timestamp" to 1234567890L,
            "count" to 100L
        )
        val analytics = AnalyticsModel(
            title = "long_event",
            analyticsLong = longPairs
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "long_event" &&
                it.analyticsLong == longPairs
            })
        }
    }

    @Test
    fun `invoke with analyticsBundle sends correct model`() {
        val bundle = mockk<Bundle>()
        val bundlePairs = listOf("extras" to bundle)
        val analytics = AnalyticsModel(
            title = "bundle_event",
            analyticsBundle = bundlePairs
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "bundle_event" &&
                it.analyticsBundle == bundlePairs
            })
        }
    }

    @Test
    fun `invoke with analyticsBundleArray sends correct model`() {
        val bundle1 = mockk<Bundle>()
        val bundle2 = mockk<Bundle>()
        val bundleArrayPairs = listOf("items" to listOf(bundle1, bundle2))
        val analytics = AnalyticsModel(
            title = "bundle_array_event",
            analyticsBundleArray = bundleArrayPairs
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "bundle_array_event" &&
                it.analyticsBundleArray == bundleArrayPairs
            })
        }
    }

    @Test
    fun `invoke with all analytics types sends correct model`() {
        val bundle = mockk<Bundle>()
        val analytics = AnalyticsModel(
            title = "complete_event",
            analyticsString = listOf("key" to "value"),
            analyticsDouble = listOf("price" to 9.99),
            analyticsBundle = listOf("data" to bundle),
            analyticsLong = listOf("id" to 123L),
            analyticsBundleArray = listOf("items" to listOf(bundle))
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "complete_event" &&
                it.analyticsString.isNotEmpty() &&
                it.analyticsDouble.isNotEmpty() &&
                it.analyticsBundle.isNotEmpty() &&
                it.analyticsLong.isNotEmpty() &&
                it.analyticsBundleArray.isNotEmpty()
            })
        }
    }

    @Test
    fun `invoke with empty lists sends correct model`() {
        val analytics = AnalyticsModel(
            title = "empty_lists_event",
            analyticsString = emptyList(),
            analyticsDouble = emptyList(),
            analyticsBundle = emptyList(),
            analyticsLong = emptyList(),
            analyticsBundleArray = emptyList()
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "empty_lists_event" &&
                it.analyticsString.isEmpty() &&
                it.analyticsDouble.isEmpty() &&
                it.analyticsBundle.isEmpty() &&
                it.analyticsLong.isEmpty() &&
                it.analyticsBundleArray.isEmpty()
            })
        }
    }

    // ==================== MULTIPLE CALLS TESTS ====================

    @Test
    fun `invoke can be called multiple times`() {
        val analytics1 = AnalyticsModel(title = "event_1")
        val analytics2 = AnalyticsModel(title = "event_2")
        val analytics3 = AnalyticsModel(title = "event_3")

        useCase(analytics1)
        useCase(analytics2)
        useCase(analytics3)

        verify(exactly = 3) { analyticsRepository.sendEvent(any()) }
        verify { analyticsRepository.sendEvent(match { it.title == "event_1" }) }
        verify { analyticsRepository.sendEvent(match { it.title == "event_2" }) }
        verify { analyticsRepository.sendEvent(match { it.title == "event_3" }) }
    }

    @Test
    fun `invoke with same event multiple times calls repository each time`() {
        val analytics = AnalyticsModel(title = "repeated_event")

        useCase(analytics)
        useCase(analytics)
        useCase(analytics)

        verify(exactly = 3) { analyticsRepository.sendEvent(analytics) }
    }

    // ==================== EDGE CASES TESTS ====================

    @Test
    fun `invoke with empty title sends correct model`() {
        val analytics = AnalyticsModel(title = "")

        useCase(analytics)

        verify { analyticsRepository.sendEvent(match { it.title == "" }) }
    }

    @Test
    fun `invoke with special characters in title sends correct model`() {
        val analytics = AnalyticsModel(title = "event_with_special_!@#$%^&*()")

        useCase(analytics)

        verify { analyticsRepository.sendEvent(match { it.title == "event_with_special_!@#\$%^&*()" }) }
    }

    @Test
    fun `invoke with unicode title sends correct model`() {
        val analytics = AnalyticsModel(title = "evento_español_日本語")

        useCase(analytics)

        verify { analyticsRepository.sendEvent(match { it.title == "evento_español_日本語" }) }
    }

    @Test
    fun `invoke with very long title sends correct model`() {
        val longTitle = "a".repeat(1000)
        val analytics = AnalyticsModel(title = longTitle)

        useCase(analytics)

        verify { analyticsRepository.sendEvent(match { it.title == longTitle }) }
    }

    @Test
    fun `invoke with large number of string pairs sends correct model`() {
        val manyPairs = (1..100).map { "key$it" to "value$it" }
        val analytics = AnalyticsModel(
            title = "many_strings_event",
            analyticsString = manyPairs
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.analyticsString.size == 100
            })
        }
    }

    @Test
    fun `invoke with extreme double values sends correct model`() {
        val extremeDoubles = listOf(
            "max" to Double.MAX_VALUE,
            "min" to Double.MIN_VALUE,
            "positive_infinity" to Double.POSITIVE_INFINITY,
            "negative_infinity" to Double.NEGATIVE_INFINITY,
            "zero" to 0.0,
            "negative" to -999.99
        )
        val analytics = AnalyticsModel(
            title = "extreme_doubles_event",
            analyticsDouble = extremeDoubles
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "extreme_doubles_event" &&
                it.analyticsDouble.size == 6
            })
        }
    }

    @Test
    fun `invoke with extreme long values sends correct model`() {
        val extremeLongs = listOf(
            "max" to Long.MAX_VALUE,
            "min" to Long.MIN_VALUE,
            "zero" to 0L,
            "negative" to -1000L
        )
        val analytics = AnalyticsModel(
            title = "extreme_longs_event",
            analyticsLong = extremeLongs
        )

        useCase(analytics)

        verify {
            analyticsRepository.sendEvent(match {
                it.title == "extreme_longs_event" &&
                it.analyticsLong.size == 4
            })
        }
    }
}
