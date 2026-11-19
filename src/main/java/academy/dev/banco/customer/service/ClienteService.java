package academy.dev.banco.customer.service;

import academy.dev.banco.customer.entity.Cliente;
import academy.dev.banco.customer.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Optional<Cliente> findByCpf(String cpf){
        return clienteRepository.findByCpf(cpf);
    }
}
