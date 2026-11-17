package edu.iesam.aad_1evaluacion.data

import android.content.Context
import edu.iesam.aad_1evaluacion.features.coche.domain.Car
import edu.iesam.marvelapp.core.serialization.KotlinJsonSerializer

open class CarXmlDataSource<T>(
     val context: Context,
     val kotlinJsonSerializer: KotlinJsonSerializer<List<Car>>
) {
    private val carKey: String = "key_car"

    private val sharedPref = context.getSharedPreferences("carData", Context.MODE_PRIVATE)

    fun saveCarList(carList: List<Car>){
        sharedPref.edit().apply(){
            putString(carKey,kotlinJsonSerializer.toJson(carList))
        }
    }

    // EXAMEN BLOQUE 1 FUNCTION 1 : SAVE CAR
    fun saveCar(c: Car) {
        val carList = getAllCars()
        val newCarList = carList + c
        saveCarList(newCarList)
    }

    // EXAMEN BLOQUE 1 FUNCTION 2 : DELETE CAR
    fun deleteCar(c: Car){
        val carList = getAllCars().filterNot { it == c }
        saveCarList(carList)
    }

    // EXAMEN BLOQUE 1 FUNCTION 3 : GET CAR
    fun getCarById(id: String): Car{
        val carList = getAllCars().filter { it.id == id }
        return carList.first()
    }

    // EXAMEN BLOQUE 1 FUNCTION 4 : GET ALL CARS
    fun getAllCars(): List<Car> {
        val carList = sharedPref.getString(carKey,null)
            ?.let {
                return kotlinJsonSerializer.fromJson(it) as List<Car>
            }
        return emptyList()
    }
    // EXAMEN BLOQUE 1 FUNCTION 5 : EDIT CAR
    fun editCar(beforeEditCar: Car, afterEditCar: Car){
        val carList = getAllCars().map {
            if (beforeEditCar == it) it.copy() else it
        }
        saveCarList(carList)
    }
}

