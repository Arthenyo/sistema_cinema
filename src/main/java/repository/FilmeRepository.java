package repository;

import entity.Filme;
import entity.Genero;

import java.util.ArrayList;
import java.util.List;

public class FilmeRepository implements DaoRepository<Filme>{


    public  List<Filme> filmes = new ArrayList<>();

    @Override
    public void criar(Filme object) {
        filmes.add(object);
    }

    @Override
    public List<Filme> ler() {
        for (Filme g: filmes) {
            System.out.println(g);
        }
        return filmes;
    }

    @Override
    public void atualizar(int id, Filme object) {
        filmes.set(id, object);
    }

    @Override
    public void deletar(int id) {
        filmes.remove(id);
    }
}
