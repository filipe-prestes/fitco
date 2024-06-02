package br.com.fitco.dto;

import br.com.fitco.role.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {}
