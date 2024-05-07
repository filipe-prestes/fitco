package br.com.fitco.dto;

import br.com.fitco.entity.ClienteEntity;
import org.springframework.beans.BeanUtils;

public class ClienteDTO {

    private Long id;
    private String name;
    private String telefone;

    public ClienteDTO() {
    }

    public ClienteDTO(ClienteEntity clienteEntity){
        BeanUtils.copyProperties(clienteEntity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
