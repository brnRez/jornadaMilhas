package com.edu.challenges.jornadaMilhas.Services;
import org.springframework.stereotype.Service;

import com.edu.challenges.jornadaMilhas.Model.Depoimento;
import com.edu.challenges.jornadaMilhas.Model.Usuario;
import com.edu.challenges.jornadaMilhas.Repository.DepoimentoRepository;




@Service
public class DepoimentoService {

    
    private final DepoimentoRepository depoimentoRepository;
    
    public DepoimentoService(DepoimentoRepository depoimentoRepository) {
        this.depoimentoRepository = depoimentoRepository;
    }


    public Depoimento criarDepoimento(Depoimento depoimento) {
        return depoimentoRepository.save(depoimento);
    }
    
    
}
