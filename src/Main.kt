package com.ebelli

import com.ebelli.models.Meal
import com.ebelli.models.MealType
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

//fun main(args: Array<String>) {
//    val server = embeddedServer(Netty, port = 8080) {
//        routing {
//            get("/") {
//                call.respondText("Hello World!", ContentType.Text.Plain)
//            }
//            get("/meals") {
//                call.respond(mapOf("OK" to true))
////                call.respond(Meal(id = 1,type = MealType.LUNCH, description = "Pizza"))
//            }
//        }
//    }
//    server.start(wait = true)
//}