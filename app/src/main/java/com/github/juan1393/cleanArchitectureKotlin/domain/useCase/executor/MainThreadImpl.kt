package com.github.juan1393.cleanArchitectureKotlin.domain.useCase.executor

import android.os.Handler
import android.os.Looper


class MainThreadImpl : MainThread {

    var handler: Handler = Handler(Looper.getMainLooper())

    override fun post(runnable: Runnable) {
        handler.post(runnable)
    }
}
