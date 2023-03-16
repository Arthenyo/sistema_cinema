package repository;

import entity.Sessao;

import java.util.ArrayList;
import java.util.List;

public class SessaoRepository {

    List<Sessao> sessaos = new ArrayList<>();

    public void criar(Sessao sessao) {
        sessaos.add(sessao);
    }

    public List<Sessao> ler() {
        for (Sessao g: sessaos) {
            System.out.println(g);
        }
        return sessaos;
    }

    public void atualizar(int id, Sessao sessao) {
        sessaos.set(id, sessao);
    }

    public void excluir(int id) {
        sessaos.remove(id);
    }

}

