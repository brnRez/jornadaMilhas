package com.edu.challenges.jornadaMilhas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.challenges.jornadaMilhas.Model.Depoimento;
import com.edu.challenges.jornadaMilhas.Services.DepoimentoService;

@RestController
@RequestMapping("/depoimentos")
@CrossOrigin(origins = "localhost:3000")
public class DepoimentoController {

    @Autowired
    private final DepoimentoService depoimentoService;
    public DepoimentoController(DepoimentoService depoimentoService) {
        this.depoimentoService = depoimentoService;
    }

    @GetMapping
    public List<Depoimento> listarDepoimentos(){
        return depoimentoService.buscarTodosDepoimentos();
    }

    @GetMapping("/{id}")
    public Depoimento buscarDepoimentoPorId(@PathVariable Long id) {
        return depoimentoService.buscarDepoimentoPorId(id);
    }

    @PostMapping
    public Depoimento criarDepoimento(@RequestBody Depoimento depoimento) {
        return depoimentoService.criarDepoimento(depoimento);
    }

    @PutMapping ("/{id}")
    public Depoimento atualizarDepoimento(@PathVariable Long id, @RequestBody Depoimento depoimentoAtualizado) {
        return depoimentoService.atualizarDepoimento(id, depoimentoAtualizado);
    }

    @DeleteMapping ("/{id}")
    public void deletarDepoimento(@PathVariable Long id){
        depoimentoService.deletarDepoimento(id);
    }
    


    
}
