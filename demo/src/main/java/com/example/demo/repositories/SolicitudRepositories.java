package com.example.demo.repositories;


import com.example.demo.models.SolicitudModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepositories extends CrudRepository<SolicitudModel, Integer> {
    //public SolicitudModel encuentracliente(String id_cliente);
}
