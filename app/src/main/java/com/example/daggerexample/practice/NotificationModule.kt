package com.example.daggerexample.practice

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationModule() {

    @MessagrQualifier
    @Provides
    fun getMessageService(retryCount:Int):NotificationService{
        return MessageService(retryCount)
    }

    @EmailQualifier
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}