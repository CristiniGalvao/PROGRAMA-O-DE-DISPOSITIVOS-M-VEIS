package com.example.exemplobancodados.model;

public class Disciplina {
    private int idDiciplina;
    private String descricao;
    private int periodo;
    private double cargaHoraria;
    private int idProfessor;
public Disciplina(){

}
    public int getIdDiciplina() {
        return idDiciplina;
    }

    public void setIdDiciplina(int idDiciplina) {
        this.idDiciplina = idDiciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
}
