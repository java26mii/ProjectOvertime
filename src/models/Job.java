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
@Table(name = "JOBS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Job.findAll", query = "SELECT j FROM Job j")
    , @NamedQuery(name = "Job.findById", query = "SELECT j FROM Job j WHERE j.id = :id")
    , @NamedQuery(name = "Job.findByName", query = "SELECT j FROM Job j WHERE j.name = :name")
    , @NamedQuery(name = "Job.findByIsdelete", query = "SELECT j FROM Job j WHERE j.isdelete = :isdelete")})
public class Job implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "job", fetch = FetchType.LAZY)
    private List<EmployeeJob> employeeJobList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "ISDELETE")
    private Character isdelete;

    public Job() {
    }

    public Job(Long id) {
        this.id = id;
    }

    public Job(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Job(Long id, String name, Character isdelete) {
        this.id = id;
        this.name = name;
        this.isdelete = isdelete;
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

    public Character getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Character isdelete) {
        this.isdelete = isdelete;
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
        if (!(object instanceof Job)) {
            return false;
        }
        Job other = (Job) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Job[ id=" + id + " ]";
    }

    @XmlTransient
    public List<EmployeeJob> getEmployeeJobList() {
        return employeeJobList;
    }

    public void setEmployeeJobList(List<EmployeeJob> employeeJobList) {
        this.employeeJobList = employeeJobList;
    }
    
}
