package sever;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClienteRepository {
	private List<Cliente> clientes = new ArrayList<>();

	public ClienteRepository() {
		Random random = new Random();
		
		clientes.add(new Cliente("FELIPE", 23));
		clientes.add(new Cliente("MARIA", random.nextInt(100)));
		clientes.add(new Cliente("ALICE", random.nextInt(100)));
		clientes.add(new Cliente("MIGUEL", random.nextInt(100)));
		clientes.add(new Cliente("SOPHIA", random.nextInt(100)));
		clientes.add(new Cliente("ARTHUR", random.nextInt(100)));
		clientes.add(new Cliente("HELENA", random.nextInt(100)));
		clientes.add(new Cliente("BERNARDO", random.nextInt(100)));
		clientes.add(new Cliente("VALENTINA", random.nextInt(100)));
		clientes.add(new Cliente("HEITOR", random.nextInt(100)));
		clientes.add(new Cliente("LAURA", random.nextInt(100)));
		clientes.add(new Cliente("DAVI", random.nextInt(100)));
		clientes.add(new Cliente("ISABELLA", random.nextInt(100)));
		clientes.add(new Cliente("LORENZO", random.nextInt(100)));
		clientes.add(new Cliente("MANUELA", random.nextInt(100)));
		clientes.add(new Cliente("THÉO", random.nextInt(100)));
		clientes.add(new Cliente("JÚLIA", random.nextInt(100)));
		clientes.add(new Cliente("PEDRO", random.nextInt(100)));
		clientes.add(new Cliente("HELOÍSA", random.nextInt(100)));
		clientes.add(new Cliente("GABRIEL", random.nextInt(100)));
	}

	public String getIdadeCliente(String nome) {
		for (Cliente cliente : clientes) {
			if (cliente.getNome().equals(nome.toUpperCase())) {
				return String.valueOf(cliente.getIdade());
			}
		}
		return "Não sei";
	}
}
