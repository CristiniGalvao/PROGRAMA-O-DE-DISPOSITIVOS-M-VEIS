package com.example.exemplobancodados.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.exemplobancodados.model.Professor;

import java.util.ArrayList;

public class ProfessorDao implements GenericDao<Professor>{

    //Variavel para abrir a conexão com BD
    private SQLiteOpenHelper openHelper;

    //Base de Dados
    private SQLiteDatabase bd;

    private String nomeTabela = "PROFESSOR";
    @Override
    public long insert(Professor obj) {
        return 0;
    }

    @Override
    public long update(Professor obj) {
        return 0;
    }

    @Override
    public long delete(Professor obj) {
        return 0;
    }

    @Override
    public ArrayList<Professor> getAll() {
        return null;
    }

    @Override
    public Professor getById(int id) {
        return null;
    }
}
