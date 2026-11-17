package edu.iesam.aad_1evaluacion

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.aad_1evaluacion.data.CarDataRepository
import edu.iesam.aad_1evaluacion.data.CarXmlDataSource
import edu.iesam.aad_1evaluacion.features.coche.domain.Car
import edu.iesam.marvelapp.core.serialization.KotlinJsonSerializer
import kotlinx.serialization.KSerializer

class MainActivity : AppCompatActivity() {
    override fun onCreate(
        savedInstanceState: Bundle?    ) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // TEST Bloque 1
        val car1 = Car("1", "Mercedes", "2021", "AAA111")
        val car2 = Car("2", "Bmw", "2022", "BBB222")
        val car3 = Car("3", "Audi", "2023", "CCC333")
        //TestSaveCar().saveCar(car1)


    }
    class TestSaveCar(
        val carXmlDataSource: CarXmlDataSource<Any>
    ){
        companion object fun saveCar(c: Car){
            carXmlDataSource.saveCar(c)
        }

    }
}