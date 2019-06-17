/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "OVERTIME_TYPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OvertimeType.findAll", query = "SELECT o FROM OvertimeType o")
    , @NamedQuery(name = "OvertimeType.findById", query = "SELECT o FROM OvertimeType o WHERE o.id = :id")
    , @NamedQuery(name = "OvertimeType.findByName", query = "SELECT o FROM OvertimeType o WHERE o.name = :name")
    , @NamedQuery(name = "OvertimeType.findByMinHour", query = "SELECT o FROM OvertimeType o WHERE o.minHour = :minHour")
    , @NamedQuery(name = "OvertimeType.findByIsDelete", query = "SELECT o FROM OvertimeType o WHERE o.isDelete = :isDelete")
    , @NamedQuery(name = "OvertimeType.findByMaxHour", query = "SELECT o FROM OvertimeType o WHERE o.maxHour = :maxHour")
    , @NamedQuery(name = "OvertimeType.findByParam1hour", query = "SELECT o FROM OvertimeType o WHERE o.param1hour = :param1hour")
    , @NamedQuery(name = "OvertimeType.findByParamNexthour", query = "SELECT o FROM OvertimeType o WHERE o.paramNexthour = :paramNexthour")})
public class OvertimeType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "MIN_HOUR")
    private short minHour;
    @Basic(optional = false)
    @Column(name = "IS_DELETE")
    private Character isDelete;
    @Basic(optional = false)
    @Column(name = "MAX_HOUR")
    private short maxHour;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PARAM_1HOUR")
    private BigDecimal param1hour;
    @Basic(optional = false)
    @Column(name = "PARAM_NEXTHOUR")
    private BigDecimal paramNexthour;

    public OvertimeType() {
    }

    public OvertimeType(Long id) {
        this.id = id;
    }

    public OvertimeType(Long id, String name, short minHour, Character isDelete, short maxHour, BigDecimal param1hour, BigDecimal paramNexthour) {
        this.id = id;
        this.name = name;
        this.minHour = minHour;
        this.isDelete = isDelete;
        this.maxHour = maxHour;
        this.param1hour = param1hour;
        this.paramNexthour = paramNexthour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getMinHour() {
        return minHour;
    }

    public void setMinHour(short minHour) {
        this.minHour = minHour;
    }

    public Character getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Character isDelete) {
        this.isDelete = isDelete;
    }

    public short getMaxHour() {
        return maxHour;
    }

    public void setMaxHour(short maxHour) {
        this.maxHour = maxHour;
    }

    public BigDecimal getParam1hour() {
        return param1hour;
    }

    public void setParam1hour(BigDecimal param1hour) {
        this.param1hour = param1hour;
    }

    public BigDecimal getParamNexthour() {
        return paramNexthour;
    }

    public void setParamNexthour(BigDecimal paramNexthour) {
        this.paramNexthour = paramNexthour;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OvertimeType)) {
            return false;
        }
        OvertimeType other = (OvertimeType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.OvertimeType[ id=" + id + " ]";
    }
    
}
