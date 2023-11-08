package com.example.exemplobancodados.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.exemplobancodados.R;
import com.example.exemplobancodados.controler.AlunoController;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AlunoActivity extends AppCompatActivity {

    private FloatingActionButton btCadastroAluno;
    private AlertDialog dialog;
    private AlunoController controller;
    private EditText edRa;
   private EditText edNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        controller = new AlunoController(this);

        btCadastroAluno = findViewById((R.id.btCadastroAluno));
        btCadastroAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCadastro();
            }
        });
    }

    private void abrirCadastro() {
        //LayoutInflater inflater = dialog.getLayoutInflater();
        View view = getLayoutInflater().inflate(R.layout.dialog_cadastro_aluno,null);

        edRa = view.findViewById(R.id.edRa);
        edNome = view.findViewById(R.id.edNome);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("CADASTRO DE ALUNO");
        builder.setView(view);//Setando o layout
        builder.setCancelable(false);//não deixar fechar o popup se clicar fora dele

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialog.dismiss();
            }
        });
        builder.setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //metodo salvar aluno
               salvarDados();
            }
        });

        dialog = builder.create();
        dialog.show();
    }

    public void salvarDados(){
        String retorno = controller.salvarAluno(edRa.getText().toString(),edNome.getText().toString());
        if(retorno != null){
            if(retorno.contains(("RA")){
                edRa.setError(retorno);
            }
            if(retorno.contains("NOME")){
                edNome.setError(retorno);
            }
        }
        else {
            Toast.makeText(this, "Aluno salvo com sucesso!", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        }
    }
}