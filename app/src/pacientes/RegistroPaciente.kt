package com.healthapp.pacientes

data class Paciente(val nombre: String, val curp: String, val telefono: String)

class RegistroPaciente {
    private val pacientes = mutableListOf<Paciente>()
    fun registrar(p: Paciente) = pacientes.add(p)
}