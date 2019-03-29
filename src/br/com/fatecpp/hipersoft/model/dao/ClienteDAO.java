package br.com.fatecpp.hipersoft.model.dao;

import br.com.fatecpp.hipersoft.model.domain.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * 
 * @author DiegoFrancisco
 */
public class ClienteDAO implements DAOGenerico<Cliente>{

    private static ClienteDAO unicaInstancia;
    private EntityManager em;//é um objeto que ira gerenciar as entidades
     
    private ClienteDAO(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HiperSoftPU");
        if (em == null){
            em = emf.createEntityManager();
        }
    }
    
    public static ClienteDAO getUnicaInstancia(){
        if(unicaInstancia == null){
            unicaInstancia = new ClienteDAO();
        }
        return unicaInstancia;
    }

    @Override
    public void inserir(Cliente entidade) {
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
    public void alterar(Cliente entidade) {
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
    public void excluir(Cliente entidade) {
        em.getTransaction().begin();
        Cliente c = em.merge(entidade);
        em.remove(c);
        em.merge(entidade);
        em.getTransaction().commit();
    }

    @Override
    public List<Cliente> consultar(String opcao, String parametro) {
        Query q = null;
        if (opcao.equals("consultarTodos")) {
            q = em.createNamedQuery("Cliente.findAll");
        } else if (opcao.equals("consultarPorId")) {
            q = em.createNamedQuery("Cliente.findByIdCliente");
            q.setParameter("idCliente", Integer.parseInt(parametro));
        } else if (opcao.equals("consultarPorNome")) {
            q = em.createNamedQuery("Cliente.findByNome");
            q.setParameter("nome", "%" + parametro + "%");
        } else if (opcao.equals("consultarPorEmail")) {
            q = em.createNamedQuery("Cliente.findByEmail");
            q.setParameter("email", "%" + parametro + "%");
        }
        return q.getResultList();
    }

}
