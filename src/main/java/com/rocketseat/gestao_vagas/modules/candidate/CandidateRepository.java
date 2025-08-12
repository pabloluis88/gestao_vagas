package com.rocketseat.gestao_vagas.modules.candidate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateEntity, java.util.UUID> {

}