package cl.talentodigital.cicloviasversionjose.ciclovias.domain

import cl.talentodigital.cicloviasversionjose.ciclovias.domain.model.Ciclovia
import io.reactivex.Single

interface CicloviasRepository {
    fun obtenerCiclovias(): Single<List<Ciclovia>>
    fun filtrarLasCondes(): Single<List<Ciclovia>>
    fun filtrarPorTexto(texto: String): Single<List<Ciclovia>>
    fun filtrarPorNumero(texto: Int): Single<List<Ciclovia>>
}
