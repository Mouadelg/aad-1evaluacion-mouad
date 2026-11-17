package edu.iesam.aad_1evaluacion.features.coche.domain

import kotlinx.serialization.Serializable

@Serializable
data class Car(val brand: String, val model: String, val plate: String) {
}