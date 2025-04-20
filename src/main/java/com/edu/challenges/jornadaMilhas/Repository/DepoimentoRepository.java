package com.edu.challenges.jornadaMilhas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.challenges.jornadaMilhas.Model.Depoimento;

@Repository

public interface DepoimentoRepository extends JpaRepository<Depoimento, Long> {
        // Custom query methods can be defined here if needed
}
