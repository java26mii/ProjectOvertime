/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

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
    , @NamedQuery(name = "OvertimeType.findBySalary", query = "SELECT o FROM OvertimeType o WHERE o.salary = :salary")
    , @NamedQuery(name = "OvertimeType.findByIsDelete", query = "SELECT o FROM OvertimeType o WHERE o.isDelete = :isDelete")})
public class OvertimeType implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "overtimeType", fetch = FetchType.LAZY)
    private List<OvertimeRequest> overtimeRequestList;

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
    @Column(name = "SALARY")
    private long salary;
    @Basic(optional = false)
    @Column(name = "IS_DELETE")
    private Character isDelete;

    public OvertimeType() {
    }

    public OvertimeType(Long id) {
        this.id = id;
    }
    
    public OvertimeType(Long id, String name, short minHour, long salary) {
        this.id = id;
        this.name = name;
        this.minHour = minHour;
        this.salary = salary;
    }

    public OvertimeType(Long id, String name, short minHour, long salary, Character isDelete) {
        this.id = id;
        this.name = name;
        this.minHour = minHour;
        this.salary = salary;
        this.isDelete = isDelete;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Character getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Character isDelete) {
        this.isDelete = isDelete;
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

    @XmlTransient
    public List<OvertimeRequest> getOvertimeRequestList() {
        return overtimeRequestList;
    }

    public void setOvertimeRequestList(List<OvertimeRequest> overtimeRequestList) {
        this.overtimeRequestList = overtimeRequestList;
    }
    
}
