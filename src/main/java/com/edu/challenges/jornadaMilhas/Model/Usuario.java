package com.edu.challenges.jornadaMilhas.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String imagem;

    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Depoimento depoimento;
    
}
