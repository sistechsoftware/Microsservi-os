package br.com.tecnologiasistech.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.tecnologiasistech.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
