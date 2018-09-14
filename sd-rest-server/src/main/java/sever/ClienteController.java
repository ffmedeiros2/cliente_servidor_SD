package sever;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	private ClienteRepository repository = new ClienteRepository();

	@GetMapping("/cliente")
	public String getCliente(@RequestParam String value) {
		return repository.getIdadeCliente(value);
	}
}
