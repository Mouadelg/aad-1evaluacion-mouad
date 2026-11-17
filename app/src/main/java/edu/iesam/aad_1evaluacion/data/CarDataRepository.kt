package edu.iesam.aad_1evaluacion.data

import edu.iesam.aad_1evaluacion.features.coche.domain.Car
import edu.iesam.aad_1evaluacion.features.coche.domain.CarRepository

class CarDataRepository<T>(private val carXmlDataSource: CarXmlDataSource<T>) : CarRepository {
    override fun getAllCars(): List<Car> {
        return carXmlDataSource.getAllCars()
    }

    override fun saveCar(c: Car) {
        carXmlDataSource.saveCar(c)
    }

}