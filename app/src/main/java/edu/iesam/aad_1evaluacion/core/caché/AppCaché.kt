package edu.iesam.aad_1evaluacion.core.caché

import android.content.Context
import android.content.SharedPreferences
import edu.iesam.aad_1evaluacion.data.CarXmlDataSource
import edu.iesam.aad_1evaluacion.features.coche.domain.Car

interface AppCache {
    fun findAll(): List<Car>
    fun isExpired(appCacheKey: String, timeTTL: Long): Boolean
}
class AppCacheImpl(
    val context: Context,
    val carXmlDataSource: CarXmlDataSource<Any>,
    val appTime: AppTime
) : AppCache{
    val appCacheKEY: String = "app_cache"
    val sharedPref = context.getSharedPreferences(appCacheKEY, Context.MODE_PRIVATE)
    override fun findAll(): List<Car> {
        return carXmlDataSource.getAllCars()
    }

    override fun isExpired(appCacheKey: String, timeTTL: Long): Boolean {
        TODO("Not yet implemented")
    }
}