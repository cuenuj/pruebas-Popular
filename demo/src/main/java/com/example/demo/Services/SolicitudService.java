package com.example.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.models.SolicitudModel;
import com.example.demo.repositories.SolicitudRepositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolicitudService {
    @Autowired
    SolicitudRepositories solicitudRepositories;

    //Get
    public ArrayList <SolicitudModel> obtenersolicitudes(){
        return (ArrayList<SolicitudModel>) solicitudRepositories.findAll();
    }

    //Post
    public SolicitudModel GuradardarSolicitud(SolicitudModel soliictud){
        return solicitudRepositories.save(soliictud);

    }
    //get By Id
    public Optional<SolicitudModel> obtenerId(int id){
        return solicitudRepositories.findById(id);
    } 
    //buscar por id_Cliente
    /*public SolicitudModel obtenerPorIdCliente(String id_cliente){
        return solicitudRepositories.encuentracliente(id_cliente);
    }*/
    //update 
     public String eliminarSolicitud(int id){
         String resultado ="";
        try {

            solicitudRepositories.deleteById(id);
            resultado = "Exito";
        } catch (Exception e) {
            resultado = "error en el borrado: "+e;
        }
        return resultado;
     }


}
