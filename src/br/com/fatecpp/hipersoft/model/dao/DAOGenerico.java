package br.com.fatecpp.hipersoft.model.dao;

import java.util.List;

public interface DAOGenerico<E> { //classe generica
    
      public void inserir(E entidade);
      public void alterar(E entidade);
      public void excluir(E entidade);
      public List<E> consultar(String opcao, String parametro);
    
}
