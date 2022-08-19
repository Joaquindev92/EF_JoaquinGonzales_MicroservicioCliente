package com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.modelo.Cliente;
import com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.repositorio.ClienteRepository;


@Service
public class ClienteServiceImp implements ClienteService{
	
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listarClientes() {
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClientes() {		

		return null;
	}

	@Override
	public void guardarClientes(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	public void actualizarClientes(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarClientes() {
		// TODO Auto-generated method stub

	}
	
	
	
	

}







