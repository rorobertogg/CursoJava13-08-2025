package com.etec.escola.Controller;

import com.etec.escola.Services.AlunoService;

public class AlunoContoller {

    private final AlunoService alunoService;

    public AlunoContoller(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
}
