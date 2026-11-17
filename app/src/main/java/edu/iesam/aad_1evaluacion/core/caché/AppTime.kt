package edu.iesam.aad_1evaluacion.core.caché

interface AppTime {
    fun timeMilliSeconds(): Long
}
class AppTimeTTL : AppTime{
    override fun timeMilliSeconds(): Long {
        return System.currentTimeMillis()
    }
}