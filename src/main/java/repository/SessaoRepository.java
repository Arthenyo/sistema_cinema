package repository;

import entity.Sessao;

import java.util.ArrayList;
import java.util.List;

public class SessaoRepository implements DaoRepository<Sessao>{

    List<Sessao> sessaos = new ArrayList<>();


    @Override
    public void criar(Sessao object) {
        sessaos.add(object);
    }

    @Override
    public List<Sessao> ler() {
        for (Sessao g: sessaos) {
            System.out.println(g);
        }
        return sessaos;
    }

    @Override
    public void atualizar(int id, Sessao object) {
        sessaos.set(id,object);
    }

    @Override
    public void deletar(int id) {
        sessaos.remove(id);
    }
}

