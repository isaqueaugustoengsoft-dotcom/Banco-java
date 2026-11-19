package academy.dev.banco.customer.controller;


import academy.dev.banco.customer.entity.Cliente;
import academy.dev.banco.customer.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {


    private final ClienteService clienteService;

    @PostMapping
    public Cliente save(@RequestBody  Cliente cliente){
        return clienteService.save(cliente);
    }

    @GetMapping("/{cpf}")
    public Cliente findByCpf(@PathVariable String cpf){
        return clienteService.findByCpf(cpf);
    }
}
