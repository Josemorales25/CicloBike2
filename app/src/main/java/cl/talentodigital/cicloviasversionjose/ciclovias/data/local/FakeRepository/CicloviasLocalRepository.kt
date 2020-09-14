package cl.talentodigital.cicloviasversionjose.ciclovias.data.local.FakeRepository

import cl.talentodigital.cicloviasversionjose.ciclovias.domain.model.Ciclovia
import cl.talentodigital.cicloviasversionjose.ciclovias.domain.CicloviasRepository
import io.reactivex.Single

class CicloviasLocalRepository : CicloviasRepository {

    override fun obtenerCiclovias(): Single<List<Ciclovia>> {
        return Single.just(SetupCiclovias.init())
    }

    override fun filtrarLasCondes(): Single<List<Ciclovia>> {
        val listaFiltrada = ArrayList<Ciclovia>()
        SetupCiclovias.init().forEach {
            when (it.comuna) {
                "Las Condes" -> listaFiltrada.add(it)
            }
        }
        return Single.just(listaFiltrada)
    }

    override fun filtrarPorTexto(texto: String): Single<List<Ciclovia>> {
        val listaFiltrada = SetupCiclovias.init().filter {
            it.comuna.contains(texto, true) || it.nombre.contains(texto, true)
        }
        return Single.just(listaFiltrada)
    }

    override fun filtrarPorNumero(numero: Int): Single<List<Ciclovia>> {
        val listaFiltrada = SetupCiclovias.init().filter {
            it.nombre.contains(numero.toString())
        }
        return Single.just(listaFiltrada)
    }
}