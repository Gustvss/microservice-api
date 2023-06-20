package com.tcser.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcser.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
