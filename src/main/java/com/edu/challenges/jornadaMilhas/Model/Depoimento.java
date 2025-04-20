package com.edu.challenges.jornadaMilhas.Model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Depoimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensagem;
    private final LocalDate data = LocalDate.now();
    
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
}
