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
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto_1.findAll", query = "SELECT p FROM Produto_1 p")
    , @NamedQuery(name = "Produto_1.findByCodProd", query = "SELECT p FROM Produto_1 p WHERE p.codProd = :codProd")
    , @NamedQuery(name = "Produto_1.findByCodUniMed", query = "SELECT p FROM Produto_1 p WHERE p.codUniMed = :codUniMed")
    , @NamedQuery(name = "Produto_1.findByProdutoId", query = "SELECT p FROM Produto_1 p WHERE p.produtoId = :produtoId")
    , @NamedQuery(name = "Produto_1.findByNomeProd", query = "SELECT p FROM Produto_1 p WHERE p.nomeProd = :nomeProd")
    , @NamedQuery(name = "Produto_1.findBySetorProd", query = "SELECT p FROM Produto_1 p WHERE p.setorProd = :setorProd")
    , @NamedQuery(name = "Produto_1.findByFabriProd", query = "SELECT p FROM Produto_1 p WHERE p.fabriProd = :fabriProd")
    , @NamedQuery(name = "Produto_1.findByValProd", query = "SELECT p FROM Produto_1 p WHERE p.valProd = :valProd")
    , @NamedQuery(name = "Produto_1.findByPrecoProd", query = "SELECT p FROM Produto_1 p WHERE p.precoProd = :precoProd")})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_prod")
    private Integer codProd;
    @Basic(optional = false)
    @Column(name = "cod_uni_med")
    private int codUniMed;
    @Basic(optional = false)
    @Column(name = "produto_id")
    private int produtoId;
    @Column(name = "nome_prod")
    private String nomeProd;
    @Column(name = "setor_prod")
    private String setorProd;
    @Column(name = "fabri_prod")
    private String fabriProd;
    @Column(name = "val_prod")
    private String valProd;
    @Column(name = "preco_prod")
    private String precoProd;

    public Produto() {
    }

    public Produto(Integer codProd) {
        this.codProd = codProd;
    }
    
    public Produto(String nome, String setor){
        
    }
    
    public Produto(int cod, String nome, String setor){
        
    }

    public Integer getCodProd() {
        return codProd;
    }

    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }

    public int getCodUniMed() {
        return codUniMed;
    }

    public void setCodUniMed(int codUniMed) {
        this.codUniMed = codUniMed;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getSetorProd() {
        return setorProd;
    }

    public void setSetorProd(String setorProd) {
        this.setorProd = setorProd;
    }

    public String getFabriProd() {
        return fabriProd;
    }

    public void setFabriProd(String fabriProd) {
        this.fabriProd = fabriProd;
    }

    public String getValProd() {
        return valProd;
    }

    public void setValProd(String valProd) {
        this.valProd = valProd;
    }

    public String getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(String precoProd) {
        this.precoProd = precoProd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProd != null ? codProd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codProd == null && other.codProd != null) || (this.codProd != null && !this.codProd.equals(other.codProd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.Produto_1[ codProd=" + codProd + " ]";
    }
    
}
