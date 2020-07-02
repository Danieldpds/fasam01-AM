package br.edu.fasam.atividade1.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.edu.fasam.atividade1.DAO.PessoaDAO;
import br.edu.fasam.atividade1.R;

public class ListaPessoasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_pessoas);

        setTitle("Atividade 1 - Lista de Pessoas");

        FloatingActionButton botaoNovaPessoa = findViewById(R.id.activity_lista_pessoas_fab_nova_pessoa);
        botaoNovaPessoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListaPessoasActivity.this, FormularioPessoaActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        PessoaDAO dao = new PessoaDAO();

        ListView listaDePessoas = findViewById(R.id.activity_lista_pessoas_listview);
        listaDePessoas.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));
    }

}
