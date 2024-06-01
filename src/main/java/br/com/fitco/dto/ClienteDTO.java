package br.com.fitco.dto;

import br.com.fitco.entity.ClienteEntity;
import org.springframework.beans.BeanUtils;

public class ClienteDTO {

    private Long id;
    private String nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
