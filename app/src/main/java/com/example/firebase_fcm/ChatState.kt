package com.example.firebase_fcm

data class ChatState(
    val isEnteringToken:Boolean = true,
    val remoteToken:String = "",
    val messageText:String = ""
)