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
@Table(name = "fornecedor")
@NamedQueries({
    @NamedQuery(name = "Fornecedor_1.findAll", query = "SELECT f FROM Fornecedor_1 f")
    , @NamedQuery(name = "Fornecedor_1.findByCodFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.codFor = :codFor")
    , @NamedQuery(name = "Fornecedor_1.findByNomeFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.nomeFor = :nomeFor")
    , @NamedQuery(name = "Fornecedor_1.findByCnpjFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.cnpjFor = :cnpjFor")
    , @NamedQuery(name = "Fornecedor_1.findByEndFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.endFor = :endFor")
    , @NamedQuery(name = "Fornecedor_1.findByCidadeFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.cidadeFor = :cidadeFor")
    , @NamedQuery(name = "Fornecedor_1.findByEstadoFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.estadoFor = :estadoFor")
    , @NamedQuery(name = "Fornecedor_1.findByTelFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.telFor = :telFor")
    , @NamedQuery(name = "Fornecedor_1.findByEmailFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.emailFor = :emailFor")
    , @NamedQuery(name = "Fornecedor_1.findByRzSocial", query = "SELECT f FROM Fornecedor_1 f WHERE f.rzSocial = :rzSocial")
    , @NamedQuery(name = "Fornecedor_1.findByIeFor", query = "SELECT f FROM Fornecedor_1 f WHERE f.ieFor = :ieFor")})
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_for")
    private Integer codFor;
    @Column(name = "nome_for")
    private String nomeFor;
    @Column(name = "cnpj_for")
    private String cnpjFor;
    @Column(name = "end_for")
    private String endFor;
    @Column(name = "cidade_for")
    private String cidadeFor;
    @Column(name = "estado_for")
    private String estadoFor;
    @Column(name = "tel_for")
    private String telFor;
    @Column(name = "email_for")
    private String emailFor;
    @Column(name = "rz_social")
    private String rzSocial;
    @Column(name = "ie_for")
    private String ieFor;

    public Fornecedor() {
    }
    
    public Fornecedor(int codigo, String nome, String email){
        
    }
    
    public Fornecedor(String nome, String endereco){
        
    }

    public Fornecedor(Integer codFor) {
        this.codFor = codFor;
    }

    public Integer getCodFor() {
        return codFor;
    }

    public void setCodFor(Integer codFor) {
        this.codFor = codFor;
    }

    public String getNomeFor() {
        return nomeFor;
    }

    public void setNomeFor(String nomeFor) {
        this.nomeFor = nomeFor;
    }

    public String getCnpjFor() {
        return cnpjFor;
    }

    public void setCnpjFor(String cnpjFor) {
        this.cnpjFor = cnpjFor;
    }

    public String getEndFor() {
        return endFor;
    }

    public void setEndFor(String endFor) {
        this.endFor = endFor;
    }

    public String getCidadeFor() {
        return cidadeFor;
    }

    public void setCidadeFor(String cidadeFor) {
        this.cidadeFor = cidadeFor;
    }

    public String getEstadoFor() {
        return estadoFor;
    }

    public void setEstadoFor(String estadoFor) {
        this.estadoFor = estadoFor;
    }

    public String getTelFor() {
        return telFor;
    }

    public void setTelFor(String telFor) {
        this.telFor = telFor;
    }

    public String getEmailFor() {
        return emailFor;
    }

    public void setEmailFor(String emailFor) {
        this.emailFor = emailFor;
    }

    public String getRzSocial() {
        return rzSocial;
    }

    public void setRzSocial(String rzSocial) {
        this.rzSocial = rzSocial;
    }

    public String getIeFor() {
        return ieFor;
    }

    public void setIeFor(String ieFor) {
        this.ieFor = ieFor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFor != null ? codFor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.codFor == null && other.codFor != null) || (this.codFor != null && !this.codFor.equals(other.codFor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.Fornecedor_1[ codFor=" + codFor + " ]";
    }
    
}
