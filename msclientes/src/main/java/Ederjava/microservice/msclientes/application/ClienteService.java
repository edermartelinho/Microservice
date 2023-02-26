package Ederjava.microservice.msclientes.application;

import Ederjava.microservice.msclientes.domain.Cliente;
import Ederjava.microservice.msclientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository repository;
    @Transactional
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }
    public Optional<Cliente>getByCPF(String cpf){
        return repository.findByCpf(cpf);
    }
}
