package cl.talentodigital.cicloviasversionjose.ciclovias.domain

class FiltroNumeroUseCase(
    private val repository: CicloviasRepository
) {
    fun excecute(numero: Int) = repository.filtrarPorNumero(numero)
}