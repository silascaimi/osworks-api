package com.algaworks.osworks.apí.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("Carlos");
		cliente1.setEmail("carlos@xyz.com");
		cliente1.setTelefone("99929999");
		
		cliente2.setId(2L);
		cliente2.setNome("João");
		cliente2.setEmail("joao@xyz.com");
		cliente2.setTelefone("999884457");
		return Arrays.asList(cliente1, cliente2);
	}
}
