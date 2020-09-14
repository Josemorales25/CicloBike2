package cl.talentodigital.cicloviasversionjose.ciclovias.domain

class ObtenerCicloviasUseCase (

        private val repository: CicloviasRepository
    ) {
        fun excecute() = repository.obtenerCiclovias()
    }