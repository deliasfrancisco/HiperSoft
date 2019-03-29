package br.com.fatecpp.hipersoft.model.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DiegoFrancisco
 */
@Entity
@Table(name = "cliente")
@NamedQueries({
    @NamedQuery(name = "Cliente_1.findAll", query = "SELECT c FROM Cliente_1 c")
    , @NamedQuery(name = "Cliente_1.findByCodCli", query = "SELECT c FROM Cliente_1 c WHERE c.codCli = :codCli")
    , @NamedQuery(name = "Cliente_1.findByNome", query = "SELECT c FROM Cliente_1 c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cliente_1.findByEndereco", query = "SELECT c FROM Cliente_1 c WHERE c.endereco = :endereco")
    , @NamedQuery(name = "Cliente_1.findByCidade", query = "SELECT c FROM Cliente_1 c WHERE c.cidade = :cidade")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_cli")
    private Integer codCli;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "cidade")
    private String cidade;

    public Cliente() {
    }
    
    public Cliente(String nome, String endereco, String cidade){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
    }
    
    public Cliente(int cod, String nome, String endereco, String cidade){
        this.codCli = cod;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public Cliente(Integer codCli) {
        this.codCli = codCli;
    }

    public Integer getCodCli() {
        return codCli;
    }

    public void setCodCli(Integer codCli) {
        this.codCli = codCli;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCli != null ? codCli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCli == null && other.codCli != null) || (this.codCli != null && !this.codCli.equals(other.codCli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.Cliente_1[ codCli=" + codCli + " ]";
    }
    
}
