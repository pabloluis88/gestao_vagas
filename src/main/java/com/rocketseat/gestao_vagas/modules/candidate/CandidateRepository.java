package com.rocketseat.gestao_vagas.modules.candidate;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity, java.util.UUID> {

    Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);
    

}