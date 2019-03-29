package br.com.fatecpp.hipersoft.model.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author DiegoFrancisco
 */
@Entity
@Table(name = "itens_venda")
@NamedQueries({
    @NamedQuery(name = "ItensVenda.findAll", query = "SELECT i FROM ItensVenda i")
    , @NamedQuery(name = "ItensVenda.findByCodItem", query = "SELECT i FROM ItensVenda i WHERE i.codItem = :codItem")
    , @NamedQuery(name = "ItensVenda.findByCodVenda", query = "SELECT i FROM ItensVenda i WHERE i.codVenda = :codVenda")
    , @NamedQuery(name = "ItensVenda.findByCodProd", query = "SELECT i FROM ItensVenda i WHERE i.codProd = :codProd")
    , @NamedQuery(name = "ItensVenda.findByQtd", query = "SELECT i FROM ItensVenda i WHERE i.qtd = :qtd")
    , @NamedQuery(name = "ItensVenda.findByValor", query = "SELECT i FROM ItensVenda i WHERE i.valor = :valor")})
public class ItensVenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_item")
    private Integer codItem;
    @Basic(optional = false)
    @Column(name = "cod_venda")
    private int codVenda;
    @Basic(optional = false)
    @Column(name = "cod_prod")
    private int codProd;
    @Basic(optional = false)
    @Column(name = "qtd")
    private int qtd;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;

    public ItensVenda() {
    }

    public ItensVenda(Integer codItem) {
        this.codItem = codItem;
    }

    public ItensVenda(Integer codItem, int codVenda, int codProd, int qtd, double valor) {
        this.codItem = codItem;
        this.codVenda = codVenda;
        this.codProd = codProd;
        this.qtd = qtd;
        this.valor = valor;
    }

    public Integer getCodItem() {
        return codItem;
    }

    public void setCodItem(Integer codItem) {
        this.codItem = codItem;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codItem != null ? codItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensVenda)) {
            return false;
        }
        ItensVenda other = (ItensVenda) object;
        if ((this.codItem == null && other.codItem != null) || (this.codItem != null && !this.codItem.equals(other.codItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.ItensVenda[ codItem=" + codItem + " ]";
    }
    
}
