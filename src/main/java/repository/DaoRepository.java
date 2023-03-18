package repository;

import java.util.List;

public interface DaoRepository <T> {



    public void criar(T object);

    public List<T> ler();

    public void atualizar(int id, T object);

    public void deletar(int id);
}
