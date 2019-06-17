/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.math.BigInteger;
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
    @Column(name = "ID", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME", nullable = false, length = 25)
    private String name;
    @Basic(optional = false)
    @Column(name = "MIN_HOUR", nullable = false)
    private short minHour;
    @Basic(optional = false)
    @Column(name = "IS_DELETE", nullable = false)
    private Character isDelete;
    @Basic(optional = false)
    @Column(name = "MAX_HOUR", nullable = false)
    private short maxHour;
    @Column(name = "PARAM_1HOUR")
    private BigInteger param1hour;
    @Column(name = "PARAM_NEXTHOUR")
    private BigInteger paramNexthour;

    public OvertimeType() {
    }

    public OvertimeType(Long id) {
        this.id = id;
    }

    public OvertimeType(Long id, String name, short minHour, Character isDelete, short maxHour) {
        this.id = id;
        this.name = name;
        this.minHour = minHour;
        this.isDelete = isDelete;
        this.maxHour = maxHour;
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

    public BigInteger getParam1hour() {
        return param1hour;
    }

    public void setParam1hour(BigInteger param1hour) {
        this.param1hour = param1hour;
    }

    public BigInteger getParamNexthour() {
        return paramNexthour;
    }

    public void setParamNexthour(BigInteger paramNexthour) {
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
