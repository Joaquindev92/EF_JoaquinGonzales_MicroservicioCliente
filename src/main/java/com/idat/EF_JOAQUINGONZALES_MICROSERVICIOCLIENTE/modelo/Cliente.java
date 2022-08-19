package com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Cliente {
	

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name = "Clientes")
	public class Cliente {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer idCliente;
		private String nombreCliente;
		private String apellidoCliente;
		private Integer nroCelular;
		private String direccion;
		
		
		
	}

}
