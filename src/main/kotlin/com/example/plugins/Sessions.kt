package com.example.plugins

import com.example.model.session.UserSession
import io.ktor.server.application.*
import io.ktor.server.sessions.*

fun Application.configureSessions() {
    install(Sessions) {
        cookie<UserSession>("user_data", SessionStorageMemory()) {
            cookie.path = "/login/status"
//            cookie.secure = true
        }
    }
}