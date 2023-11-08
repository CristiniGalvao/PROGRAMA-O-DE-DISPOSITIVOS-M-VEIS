package com.example.exemplobancodados.controler;
import android.content.Context;

import com.example.exemplobancodados.dao.AlunoDao;
import com.example.exemplobancodados.model.Aluno;

public class AlunoController {
    private Context context;

    public AlunoController(Context context){
        this.context = context;
    }

    public String salvarAluno(String ra,String nome){
        try{
            if(ra.equals("") || ra.isEmpty()){
                return "O RA deve ser informado!";
            }
            if(nome.equals("") || nome.isEmpty()){
                return "Informe o NOME do aluno!";
            }
            Aluno aluno = AlunoDao.getInstancia(context).getById(Integer.parseInt(ra));
            if(aluno != null){
                return "O RA ("+ra+") já está cadastrado!";
            }else{
                aluno.setRa(Integer.parseInt(ra));
                aluno.setNome(nome);
                AlunoDao.getInstancia(context).insert(aluno);
            }
        }catch (Exception ex){
            return "Erro ao gravar Aluno";
        }
        return  null;
    }
}
