package com.example.grupo49web.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.grupo49web.models.UsuarioModels;

public interface UsuarioRepository extends CrudRepository<UsuarioModels, Long> {
    // vacia porque los metodos ya estan implementados
    public abstract ArrayList<UsuarioModels> findByPrioridad(Integer prioridad);

    public abstract ArrayList<UsuarioModels> findBytelefono(String telefono);

    public abstract ArrayList<UsuarioModels> findByemail(String email);

    public abstract ArrayList<UsuarioModels> findBynombre(String nombre);

}
