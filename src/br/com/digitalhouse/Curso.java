package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String nomeDoCurso;
    private Integer codigoDeCurso;
    private String professorTitular;
    private String ProfessorAdjunto;
    private Integer quantidadeMaximaDeAlunos;

    List<Aluno> listaDeAlunos = new ArrayList<>();

    public Curso(String nome, Integer nomeDoCurso, Integer codigoDeCurso, String professorTitular, String professorAdjunto, Integer quantidadeMaximaDeAlunos) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
        this.professorTitular = professorTitular;
        ProfessorAdjunto = professorAdjunto;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnomeDoCurso() {
        return getnomeDoCurso();
    }

    public void setnomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public Integer getCodigoDeCurso() { return codigoDeCurso;
    }
    public void setCodigoDeCurso(Integer codigoDeCurso) {this.codigoDeCurso = codigoDeCurso;
    }
    public String getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(String professorTitular) {
        this.professorTitular = professorTitular;
    }

    public String getProfessorAdjunto() {
        return ProfessorAdjunto;
    }

    public void setProfessorAdjunto(String professorAdjunto) {
        ProfessorAdjunto = professorAdjunto;
    }

    public Integer getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }
    public boolean Curso() {
        if (this.codigoDeCurso == codigoDeCurso == true) {
        } else {
            System.out.println("Os cursos são diferentes");
        }
        return false;

    }

    public Boolean adicionarUmAluno(Aluno umAluno){

        if( this.quantidadeMaximaDeAlunos > listaDeAlunos.size ()) {
            //   System.out.println ("Aluno matriculado à turma desse curso.");
            listaDeAlunos.add(umAluno);

            return true;

        } else {
            System.out.println( "vagas para este curso estão esgotadas. " );
            return  false;
        }


    }

    public  void  excluirAluno (Aluno umAluno) {

        listaDeAlunos.remove(umAluno);

        System.out.println ( " O aluno "  + umAluno +  " não participa mais do Curso! = ( " );
    }
}

