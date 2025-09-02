package com.aula.faculdade.services;

import com.aula.faculdade.entities.Cliente;
import com.aula.faculdade.exceptions.ClienteInvalidoException;
import com.aula.faculdade.exceptions.ClienteNaoEncontradoException;
import com.aula.faculdade.repo.ClienteRepos;
import com.aula.faculdade.specification.ClienteSpecification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepos clienteRepository;

    public ClienteService(ClienteRepos clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente listarCliente(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNaoEncontradoException(id)
                );
    }

    public Cliente salvarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new ClienteInvalidoException("Cliente não pode ser nulo");
        }
        return clienteRepository.save(cliente);
    }

    @Transactional
    public void deletarCliente(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new ClienteNaoEncontradoException(id);
        }
        clienteRepository.deleteById(id);
    }

    @Transactional
    public Cliente alterarCliente(Long id, Cliente entity) {
        if (entity == null) {
            throw new ClienteInvalidoException("Dados não podem ser nulos");
        }

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNaoEncontradoException(id)
                );

        cliente.setNome(entity.getNome());
        cliente.setEndereco(entity.getEndereco());
        cliente.setCidade(entity.getCidade());
        cliente.setTelefone(entity.getTelefone());

        return clienteRepository.save(cliente);
    }

    public List<Cliente> buscarClientes(String nome, String endereco, String cidade, String telefone) {
        return clienteRepository.findAll(
                ClienteSpecification.nomeContem(nome)
                        .and(ClienteSpecification.enderecoContem(endereco))
                        .and(ClienteSpecification.cidadeContem(cidade))
                        .and(ClienteSpecification.telefoneContem(telefone))
        );
    }
}
