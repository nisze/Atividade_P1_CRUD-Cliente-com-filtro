package com.aula.faculdade.specification;

import com.aula.faculdade.entities.Cliente;
import org.springframework.data.jpa.domain.Specification;

public class ClienteSpecification {

    public static Specification<Cliente> nomeContem(String nome) {
        return (root, query, cb) ->
                nome == null ? null : cb.like(cb.lower(root.get("nome")), "%" + nome.toLowerCase() + "%");
    }

    public static Specification<Cliente> enderecoContem(String endereco) {
        return (root, query, cb) ->
                endereco == null ? null : cb.like(cb.lower(root.get("endereco")), "%" + endereco.toLowerCase() + "%");
    }

    public static Specification<Cliente> cidadeContem(String cidade) {
        return (root, query, cb) ->
                cidade == null ? null : cb.like(cb.lower(root.get("cidade")), "%" + cidade.toLowerCase() + "%");
    }

    public static Specification<Cliente> telefoneContem(String telefone) {
        return (root, query, cb) ->
                telefone == null ? null : cb.like(cb.lower(root.get("telefone")), "%" + telefone.toLowerCase() + "%");
    }
}

