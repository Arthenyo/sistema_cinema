package repository;

import entity.Filme;

import java.util.ArrayList;
import java.util.List;

public class FilmeRepository {

    public List<Filme> filmes = new ArrayList<>();

    public void criar(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> ler() {
        for (Filme g: filmes) {
            System.out.println(g);
        }
        return filmes;
    }

    public void atualizar(int id, Filme filme) {
        filmes.set(id, filme);
    }

    public void excluir(int id) {
        filmes.remove(id);
    }
}
