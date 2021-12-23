package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.demo.Services.SolicitudService;
import com.example.demo.models.SolicitudModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
    
    @Autowired
    SolicitudService solicitudService;

    @GetMapping()
    public ArrayList<SolicitudModel> obtenerSolicitud(){
        return solicitudService.obtenersolicitudes();
    }

    @PostMapping
    public SolicitudModel guardaSolicitud(@RequestBody SolicitudModel solicitud){
        return this.solicitudService.GuradardarSolicitud(solicitud);
    }
    @GetMapping(path = "/{id}")
    public Optional<SolicitudModel> obtenerSolicitudPorId(@PathVariable("id") int id){
        return this.solicitudService.obtenerId(id);
    }

    //busca por id_cliente
    /*@GetMapping("/query")
    public SolicitudModel obtenerSolicitudIdCliente(@PathVariable("id_cliente") String id_cliente){
        return this.solicitudService.obtenerPorIdCliente(id_cliente);
    }*/

    @DeleteMapping(path = "/{id}")
    public String eliminaSolicitud(@PathVariable("id") int id){
        String resp = this.solicitudService.eliminarSolicitud(id);
        if (resp == "Exito") {
            return "se elimino el registro exitosamente.";
        } else {
            return "error al eleiminar el registro" + resp;
        }
    }
}
