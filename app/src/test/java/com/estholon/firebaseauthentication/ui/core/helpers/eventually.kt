package com.estholon.firebaseauthentication.ui.core.helpers

import kotlinx.coroutines.delay

suspend fun eventually(
    timeoutMs: Long = 1_000,
    stepMs: Long = 10,
    predicate: () -> Boolean
) {
    var waited = 0L
    while (!predicate()) {
        delay(stepMs)
        waited += stepMs
        if (waited >= timeoutMs) {
            throw AssertionError("Timeout esperando condición en $timeoutMs ms")
        }
    }
}