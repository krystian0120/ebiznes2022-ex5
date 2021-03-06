package com.example.plugins.routing

import com.example.api.CommonLoginAPI
import com.example.api.GithubLoginAPI
import com.example.api.GoogleLoginAPI
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.routing.*

fun Application.loginRouting() {
    routing {
        authenticate("auth-oauth-google") {
            get("/login/google") {
                // Redirects to 'authorizeUrl' automatically
            }

            get("/callback/google") {
                GoogleLoginAPI.callback(call)
            }
        }

        authenticate("auth-oauth-github") {
            get("/login/github") {
                // Redirects to 'authorizeUrl' automatically
            }

            get("/callback/github") {
                GithubLoginAPI.callback(call)
            }
        }

        get("/login/status") {
            CommonLoginAPI.getLoginStatus(call)
        }
    }
}