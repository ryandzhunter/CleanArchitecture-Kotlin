package com.github.juan1393.cleanArchitectureKotlin.app.di.module

import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.executor.MainThread
import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.executor.UseCaseExecutor
import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.getCurrentUser.GetCurrentUserUseCase
import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.login.LoginUseCase
import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.recoverPassword.RecoverPasswordUseCase
import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.signIn.SignInUseCase
import com.github.juan1393.cleanArchitectureKotlin.domain.useCase.signOut.SignOutUseCase
import com.github.juan1393.cleanArchitectureKotlin.repository.UserRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideGetCurrentUserUseCase(userRepository: UserRepository, executor: UseCaseExecutor,
                                     mainThread: MainThread)
            = GetCurrentUserUseCase(userRepository, executor, mainThread)

    @Provides
    fun provideLoginUseCase(userRepository: UserRepository, executor: UseCaseExecutor,
                            mainThread: MainThread)
            = LoginUseCase(userRepository, executor, mainThread)

    @Provides
    fun provideSignInUseCase(userRepository: UserRepository, executor: UseCaseExecutor,
                             mainThread: MainThread)
            = SignInUseCase(userRepository, executor, mainThread)

    @Provides
    fun provideRecoverPasswordUseCase(userRepository: UserRepository, executor: UseCaseExecutor,
                                      mainThread: MainThread)
            = RecoverPasswordUseCase(userRepository, executor, mainThread)

    @Provides
    fun provideSignOutUseCase(userRepository: UserRepository, executor: UseCaseExecutor,
                              mainThread: MainThread)
            = SignOutUseCase(userRepository, executor, mainThread)
}
