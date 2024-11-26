package com.microservice.advisor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvisorRepo extends JpaRepository<Advisor, Integer> {

}
