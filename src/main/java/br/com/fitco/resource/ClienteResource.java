package br.com.fitco.resource;

import br.com.fitco.dto.ClienteDTO;
import br.com.fitco.entity.ClienteEntity;
import br.com.fitco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cliente")
@CrossOrigin
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> listarTodos(){
        return clienteService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody ClienteDTO clienteDTO){
        clienteService.inserir(clienteDTO);
    }

    @PutMapping
    public ClienteDTO alterar(@RequestBody ClienteDTO clienteDTO){
        return clienteService.alterar(clienteDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exlcuir(@PathVariable("id") Long id){
        clienteService.excluir(id);
        return ResponseEntity.ok().build();

    }
}
