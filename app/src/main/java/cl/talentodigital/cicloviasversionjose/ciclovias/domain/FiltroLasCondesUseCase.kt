package cl.talentodigital.cicloviasversionjose.ciclovias.domain


class FiltroLasCondesUseCase(
    private val repository: CicloviasRepository
) {
    fun excecute() = repository.filtrarLasCondes()
}