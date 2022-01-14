package com.devsuperior.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.hrworker.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
