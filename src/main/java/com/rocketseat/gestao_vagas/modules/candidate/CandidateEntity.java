package com.rocketseat.gestao_vagas.modules.candidate;

import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "^[^\\s]+$", message = "Username não deve conter espaços")
    private String username;

    @Email(message = "Deve conter um email válido")
    private String email;

    @Length(min = 6, max = 20, message = "A senha deve ter entre 6 e 20 caracteres")
    private String password;
    private String description;
    private String curriculum;






}
