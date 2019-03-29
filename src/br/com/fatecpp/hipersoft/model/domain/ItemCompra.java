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
@Table(name = "item_compra")
@NamedQueries({
    @NamedQuery(name = "ItemCompra.findAll", query = "SELECT i FROM ItemCompra i")
    , @NamedQuery(name = "ItemCompra.findByCodCompra", query = "SELECT i FROM ItemCompra i WHERE i.codCompra = :codCompra")
    , @NamedQuery(name = "ItemCompra.findByCodProd", query = "SELECT i FROM ItemCompra i WHERE i.codProd = :codProd")
    , @NamedQuery(name = "ItemCompra.findByCompraCodCom", query = "SELECT i FROM ItemCompra i WHERE i.compraCodCom = :compraCodCom")
    , @NamedQuery(name = "ItemCompra.findByQuantidade", query = "SELECT i FROM ItemCompra i WHERE i.quantidade = :quantidade")
    , @NamedQuery(name = "ItemCompra.findByValor", query = "SELECT i FROM ItemCompra i WHERE i.valor = :valor")})
public class ItemCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_compra")
    private Integer codCompra;
    @Basic(optional = false)
    @Column(name = "cod_prod")
    private int codProd;
    @Basic(optional = false)
    @Column(name = "compra_cod_com")
    private int compraCodCom;
    @Basic(optional = false)
    @Column(name = "quantidade")
    private int quantidade;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;

    public ItemCompra() {
    }

    public ItemCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public ItemCompra(Integer codCompra, int codProd, int compraCodCom, int quantidade, double valor) {
        this.codCompra = codCompra;
        this.codProd = codProd;
        this.compraCodCom = compraCodCom;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getCompraCodCom() {
        return compraCodCom;
    }

    public void setCompraCodCom(int compraCodCom) {
        this.compraCodCom = compraCodCom;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
        hash += (codCompra != null ? codCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemCompra)) {
            return false;
        }
        ItemCompra other = (ItemCompra) object;
        if ((this.codCompra == null && other.codCompra != null) || (this.codCompra != null && !this.codCompra.equals(other.codCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.ItemCompra[ codCompra=" + codCompra + " ]";
    }
    
}
