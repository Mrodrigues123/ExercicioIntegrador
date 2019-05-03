package br.com.digitalhouse;

import java.util.Date;

public class Matricula {
     protected Aluno aluno;
    protected Curso curso;
    Date dataDoDia = new Date();

    public Matricula(Aluno aluno, Curso curso, Date dataDoDia) {

        this.aluno = aluno;
        this.curso = curso;
        Date dataDoDate = new Date();
    }
}
