package academy.dev.banco.customer.service;

import academy.dev.banco.customer.entity.Cliente;
import academy.dev.banco.customer.exception.ClienteNotFoundException;
import academy.dev.banco.customer.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente findByCpf(String cpf) {

        return clienteRepository.findByCpf(cpf)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente Não encontrado"));
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
