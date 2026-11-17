package edu.iesam.aad_1evaluacion.features.coche.domain

interface CarRepository {
    // ONLY DOMAIN FUNCTIONS
    fun getAllCars(): List<Car>
    fun saveCar(c: Car)
}