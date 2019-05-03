package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    List<Aluno> listaDeAlunos = new ArrayList<>();
    List<Professor> listaDeProfessores = new ArrayList<>();
    List<Curso> listaDeCursos = new ArrayList<>();
    List<Matricula> listaDeMatriculas = new ArrayList<>();

    public  List < Aluno >  getListaDeAlunos () {
        return listaDeAlunos;
    }

    public  void  setListaAlunos ( List < Aluno >  listaAlunos ) {
        this. listaDeAlunos = listaDeAlunos;
    }

    public  List < Professor >  getListaProfessores () {
        return listaDeProfessores;
    }

    public  void  setListaDeProfessores ( List < Professor >  listaDeProfessores ) {
        this. listaDeProfessores = listaDeProfessores;
    }

    public  List < Curso >  getListaCursos () {
        return listaDeCursos;
    }

    public  void  setListaCursos ( List < Curso >  listaDeCursos ) {
        this.listaDeCursos = listaDeCursos;
    }

    public  List < Matricula >  getListaMatriculas () {
        return listaDeMatriculas;
    }

    public  void  setListaMatriculas ( List < Matricula >  listaMatriculas ) {
        this. listaDeMatriculas = listaMatriculas;
    }

    @Override
    public  String  toString () {
        return  " DigitalHouseManager { "  +
                " listaAlunos = "  + listaDeAlunos +
                " , listaProfessores = "  + listaDeProfessores +
                " , listaCursos = "  + listaDeCursos +
                " , listaMatriculas = "  + listaDeMatriculas +
                " } ";
    }


    public  void  registradorCurso ( String  nome , Integer  codigoDeCurso , Integer  quantidadeMaximaDeAlunos ) {


        Curso curso1 =  new  Curso(nome, codigoDeCurso, quantidadeMaximaDeAlunos;


        listaDeCursos.add(curso1);

    }


    public  void  deleteCurso ( Integer  codigoCurso ) {

        for ( Curso exclCurso : listaDeCursos
        ) {
            if ((exclCurso . getCodigoDeCurso ()) . equals (codigoCurso)) {
                listaDeCursos.remove (exclCurso);

                System.out.println ( " O curso "  + exclCurso . getNome () +  " foi excluído da grade currícular. " );
            }
        }

    }

    public  void  registrarProfessorAdjunto ( String  Nome , String  sobrenome , Integer  tempoDeCasa , Integer  codigoProfessor , Integer  quantidadeDeHoras ) {
        ProfessoresAdjuntos professorAdjunto =  new  ProfessoresAdjuntos (String nome, sobrenome, tempoDeCasa, codigoProfessor, Integer horasDeMonitoria);

        listaDeProfessores . add (professorAdjunto);
    }

    public  void  registradorProfessorTitular ( String  nome , String  sobrenome , Integer  tempoDeCasa , Integer  codigoProfessor , String  especialidade ) {
        ProfessoresTitulares professorTitular =  new  ProfessoresTitulares (nome, sobrenome, Integer tempoDeCasa, Integer codigoProfessor,String especialidade);

        listaDeProfessores . add (professorTitular);

    }

    public  void  excluirProfessor ( Integer  codigoProfessor ) {

        for ( Professor exProf : listaDeProfessores
        ) {

            if (exProf . getCodigoDeProfessor () . equals (codigoProfessor)) {
                listaDeProfessores . remove (exProf);
                System.out.println ( " O professor "  + exProf . getNome () +  "  "  + exProf . getSobrenome()+  " não faz mais parte do seu quadro de profissionais. " );

            }
        }

