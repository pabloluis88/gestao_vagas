package com.rocketseat.gestao_vagas.modules.company.useCases;

import org.springframework.stereotype.Service;

import com.rocketseat.gestao_vagas.modules.company.entities.JobEntity;
import com.rocketseat.gestao_vagas.modules.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {
  private JobRepository jobRepository;

  public JobEntity execute(JobEntity jobEntity) {
    return this.jobRepository.save(jobEntity);
  }
}