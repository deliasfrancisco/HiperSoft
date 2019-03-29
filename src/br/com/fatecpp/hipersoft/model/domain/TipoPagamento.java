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
@Table(name = "tipo_pagamento")
@NamedQueries({
    @NamedQuery(name = "TipoPagamento.findAll", query = "SELECT t FROM TipoPagamento t")
    , @NamedQuery(name = "TipoPagamento.findByCodPag", query = "SELECT t FROM TipoPagamento t WHERE t.codPag = :codPag")
    , @NamedQuery(name = "TipoPagamento.findByCodVen", query = "SELECT t FROM TipoPagamento t WHERE t.codVen = :codVen")
    , @NamedQuery(name = "TipoPagamento.findByTpPag", query = "SELECT t FROM TipoPagamento t WHERE t.tpPag = :tpPag")})
public class TipoPagamento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_pag")
    private Integer codPag;
    @Basic(optional = false)
    @Column(name = "cod_ven")
    private int codVen;
    @Column(name = "tp_pag")
    private String tpPag;

    public TipoPagamento() {
    }

    public TipoPagamento(Integer codPag) {
        this.codPag = codPag;
    }

    public TipoPagamento(Integer codPag, int codVen) {
        this.codPag = codPag;
        this.codVen = codVen;
    }

    public Integer getCodPag() {
        return codPag;
    }

    public void setCodPag(Integer codPag) {
        this.codPag = codPag;
    }

    public int getCodVen() {
        return codVen;
    }

    public void setCodVen(int codVen) {
        this.codVen = codVen;
    }

    public String getTpPag() {
        return tpPag;
    }

    public void setTpPag(String tpPag) {
        this.tpPag = tpPag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPag != null ? codPag.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPagamento)) {
            return false;
        }
        TipoPagamento other = (TipoPagamento) object;
        if ((this.codPag == null && other.codPag != null) || (this.codPag != null && !this.codPag.equals(other.codPag))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.fatecpp.model.domain.TipoPagamento[ codPag=" + codPag + " ]";
    }
    
}
