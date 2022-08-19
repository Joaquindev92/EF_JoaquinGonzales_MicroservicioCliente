package com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.servicio;

import java.util.List;

import com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.modelo.Cliente;

public class ClienteService {
	
	    public List<Cliente> listarClientes();
		public Cliente obtenerClientes();
		public void guardarClientes(Cliente cliente);
		public void actualizarClientes(Cliente cliente);
		public void eliminarClientes();
	
}
