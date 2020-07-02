package br.edu.fasam.atividade1.DAO;

import java.util.ArrayList;
import java.util.List;

import br.edu.fasam.atividade1.model.Pessoa;

public class PessoaDAO {

    private final static List<Pessoa> pessoas = new ArrayList<>();

    public void salva(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public List<Pessoa> todos() {
        return new ArrayList<>(pessoas);
    }
}
