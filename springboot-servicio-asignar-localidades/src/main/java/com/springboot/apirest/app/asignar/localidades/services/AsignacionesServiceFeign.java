//package com.springboot.apirest.app.asignar.localidades.services;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//
//import com.springboot.apirest.app.asignar.localidades.clientes.EventoClienteRest;
//import com.springboot.apirest.app.asignar.localidades.models.entity.Asignacion;
//import com.springboot.apirest.app.asignar.localidades.models.entity.Evento;
//@Service
//@Primary
//public class AsignacionesServiceFeign {
//	@Autowired
//	private EventoClienteRest eventoCliente;
//	@Override
//	public List<Asignacion> findAll() {
//		return eventoCliente.listarEventos().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
//		
//	}
//
//	@Override
//	public Asignacion findById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Asignacion save(Asignacion asignacion) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deleteById(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
