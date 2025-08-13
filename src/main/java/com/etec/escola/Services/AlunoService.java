//Classe feita pra efetuar os métodos

package com.etec.escola.Services;
import com.etec.escola.Interface.AlunoRepository;
import com.etec.escola.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AlunoService {

    //Istância de classe

    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> buscarAlunos(){
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno byscarAlunoId(Long id){
        return alunoRepository.findById(id).orElse(null);
    }


    public void deletarAluno (Long id){
        alunoRepository.deleteById(id);
    }


}
