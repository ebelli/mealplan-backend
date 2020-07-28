package com.ebelli.models

data class Meal(
        val id: Long,
        val type: MealType,
        val description: String
)