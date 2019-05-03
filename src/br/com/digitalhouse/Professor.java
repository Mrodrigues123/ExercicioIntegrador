package br.com.digitalhouse;

public class Professor {
    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer CodigoDeProfessor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public Integer getCodigoDeProfessor() {
        return CodigoDeProfessor;
    }

    public void setCodigoDeProfessor(Integer codigoDeProfessor) {
        CodigoDeProfessor = codigoDeProfessor;
    }

    public boolean Aluno() {
        if (this.getCodigoDeProfessor() == getCodigoDeProfessor()) {
        } else {
            System.out.println("Os alunos não são iguais");
        }
        return false;

    }

}
