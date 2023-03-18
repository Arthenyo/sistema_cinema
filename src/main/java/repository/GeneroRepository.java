package repository;

import entity.Filme;
import entity.Genero;

import java.util.ArrayList;
import java.util.List;

public class GeneroRepository implements DaoRepository<Genero> {

    public  List<Genero> generos = new ArrayList<>();


    @Override
    public void criar(Genero object) {
        generos.add(object);
    }

    @Override
    public List<Genero> ler() {
        for (Genero g: generos) {
            System.out.println(g);
        }
        return generos;
    }

    @Override
    public void atualizar(int id, Genero object) {
        generos.set(id, object);
    }

    @Override
    public void deletar(int id) {
        generos.remove(id);
    }
}
