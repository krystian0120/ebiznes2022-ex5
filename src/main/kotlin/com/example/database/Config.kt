package com.example.database

object Config {
    val url: String = System.getenv("DATABASE_URL")
    val username: String = System.getenv("DATABASE_USERNAME")
    val password: String = System.getenv("DATABASE_PASSWORD")
    val githubClientId: String = System.getenv("GITHUB_CLIENT_ID")
    val githubClientSecret: String = System.getenv("GITHUB_CLIENT_SECRET")
    val googleClientId: String = System.getenv("GOOGLE_CLIENT_ID")
    val googleClientSecret: String = System.getenv("GOOGLE_CLIENT_SECRET")
    const val driver = "org.postgresql.Driver"
}