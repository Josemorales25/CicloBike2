package cl.talentodigital.cicloviasversionjose.ciclovias.domain

import cl.talentodigital.cicloviasversionjose.ciclovias.domain.CicloviasRepository

class FiltroTextoUseCase(
    private val repository: CicloviasRepository
) {
    fun excecute(texto: String) = repository.filtrarPorTexto(texto)

}