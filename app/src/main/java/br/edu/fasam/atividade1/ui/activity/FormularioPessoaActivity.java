package br.edu.fasam.atividade1.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.fasam.atividade1.DAO.PessoaDAO;
import br.edu.fasam.atividade1.R;
import br.edu.fasam.atividade1.model.Pessoa;

public class FormularioPessoaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_pessoa);

        setTitle("Atividade 1 - Cadastro Pessoa");

        final PessoaDAO dao = new PessoaDAO();

        final EditText campoNome = findViewById(R.id.activity_formulario_pessoa_nome);
        final EditText campoAnoDeNascimento = findViewById(R.id.activity_formulario_pessoa_ano_de_nascimento);
        final EditText campoCorDosOlhos = findViewById(R.id.activity_formulario_pessoa_cor_dos_olhos);
        final EditText campoGenero = findViewById(R.id.activity_formulario_pessoa_genero);
        final EditText campoCorDoCabelo = findViewById(R.id.activity_formulario_pessoa_cor_de_cabelo);

        Button botaoSalvar = findViewById(R.id.activity_formulario_pessoa_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = campoNome.getText().toString();
                String anoDeNascimento = campoAnoDeNascimento.getText().toString();
                String corDosOlhos = campoCorDosOlhos.getText().toString();
                String genero = campoGenero.getText().toString();
                String corDoCabelo = campoCorDoCabelo.getText().toString();

                Pessoa criaPessoa = new Pessoa(nome, anoDeNascimento, corDosOlhos, genero, corDoCabelo);
                dao.salva(criaPessoa);

                finish();
            }
        });
    }
}