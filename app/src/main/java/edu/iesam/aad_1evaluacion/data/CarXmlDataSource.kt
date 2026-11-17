package edu.iesam.aad_1evaluacion.data

import android.content.Context
import edu.iesam.aad_1evaluacion.features.coche.domain.Car
import edu.iesam.marvelapp.core.serialization.KotlinJsonSerializer

class CarXmlDataSource<T>(
    private val context: Context,
    private val kotlinJsonSerializer: KotlinJsonSerializer<T>
) {


}
