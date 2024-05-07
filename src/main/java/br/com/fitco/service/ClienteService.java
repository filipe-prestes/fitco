package br.com.fitco.service;

import br.com.fitco.dto.ClienteDTO;
import br.com.fitco.entity.ClienteEntity;
import br.com.fitco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteDTO> listarTodos(){
        List<ClienteEntity> clientes = clienteRepository.findAll();
        return clientes.stream().map(ClienteDTO::new).toList();
    }

    public void inserir(ClienteDTO clienteDTO){
        ClienteEntity clienteEntity = new ClienteEntity(clienteDTO);
        clienteRepository.save(clienteEntity);
    }

    public ClienteDTO alterar(ClienteDTO clienteDTO){
        ClienteEntity clienteEntity = new ClienteEntity(clienteDTO);
        return new ClienteDTO(clienteRepository.save(clienteEntity));
    }

    public void excluir(Long id){
        ClienteEntity clienteEntity = clienteRepository.findById(id).get();
        clienteRepository.delete(clienteEntity);

    }

    public ClienteDTO buscarPorId(Long id){
        return new ClienteDTO(clienteRepository.findById(id).get());
    }

}
