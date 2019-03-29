package br.com.fatecpp.hipersoft.model.dao;

import br.com.fatecpp.hipersoft.model.domain.Fornecedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FornecedorDAO implements DAOGenerico<Fornecedor>{

    private static FornecedorDAO unicaInstancia;
    private EntityManager em;
    
    private FornecedorDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HiperSoftPU");
        if (em == null) {
            em = emf.createEntityManager();
        }
    }
    
    public static FornecedorDAO getUnicaInstancia() {
        if (unicaInstancia == null) {
            unicaInstancia = new FornecedorDAO();
        } 
        return unicaInstancia;
    }

    @Override
    public void inserir(Fornecedor entidade) {
        try {
            em.getTransaction().begin();
            em.persist(entidade);
            em.getTransaction().commit();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Override
    public void alterar(Fornecedor entidade) {
        try {
            em.getTransaction().begin();
            em.merge(entidade);
            em.getTransaction().commit();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            em.getTransaction().rollback();
        }
    }

    @Override
    public void excluir(Fornecedor entidade) {
        em.getTransaction().begin();
        Fornecedor f = em.merge(entidade);
        em.remove(f);
        em.merge(entidade);
        em.getTransaction().commit();
    }

    @Override
    public List<Fornecedor> consultar(String opcao, String parametro) {
        Query q = null;
        if (opcao.equals("consultarTodos")) {
            q = em.createNamedQuery("Fornecedor.findAll");
        } else if (opcao.equals("consultarPorId")) {
            q = em.createNamedQuery("Fornecedor.findByIdFornecedor");
            q.setParameter("idFornecedor", Integer.parseInt(parametro));
        } else if (opcao.equals("consultarPorNome")) {
            q = em.createNamedQuery("Fornecedor.findByNome");
            q.setParameter("nome", "%" + parametro + "%");
        } else if (opcao.equals("consultarPorContato")) {
            q = em.createNamedQuery("Fornecedor.findByContato");
            q.setParameter("contato", "%" + parametro + "%");
        } else if (opcao.equals("consultarPorTelefone")) {
            q = em.createNamedQuery("Fornecedor.findByTelefone");
            q.setParameter("telefone", "%" + parametro + "%");
        }    
        return q.getResultList();
    }
}
