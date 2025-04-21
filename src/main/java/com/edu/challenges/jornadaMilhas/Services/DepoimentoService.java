package com.edu.challenges.jornadaMilhas.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.challenges.jornadaMilhas.Model.Depoimento;
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
    
    public List <Depoimento> buscarTodosDepoimentos() {
        return depoimentoRepository.findAll();
    }
    
    public Depoimento buscarDepoimentoPorId(Long id) {
        return depoimentoRepository.findById(id).orElse(null);
    }

    public Depoimento atualizarDepoimento(Long id, Depoimento depoimentoAtualizado) {
        if (depoimentoRepository.existsById(id)) {
            depoimentoAtualizado.setId(id);
            return depoimentoRepository.save(depoimentoAtualizado);
        } else {
            return null;
        }
    }
    public void deletarDepoimento(Long id) {
        depoimentoRepository.deleteById(id);
    }
}