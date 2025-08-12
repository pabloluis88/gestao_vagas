package com.rocketseat.gestao_vagas.modules.candidate;

import java.util.UUID;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;


@Data
@Entity(name = "candidate")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.UUID)
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

    @CreationTimestamp
    private LocalDateTime createdAt;


}
