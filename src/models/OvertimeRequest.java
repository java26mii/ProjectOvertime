/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "OVERTIME_REQUESTS", catalog = "", schema = "OVERTIME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OvertimeRequest.findAll", query = "SELECT o FROM OvertimeRequest o")
    , @NamedQuery(name = "OvertimeRequest.findById", query = "SELECT o FROM OvertimeRequest o WHERE o.id = :id")
    , @NamedQuery(name = "OvertimeRequest.findByReqDate", query = "SELECT o FROM OvertimeRequest o WHERE o.reqDate = :reqDate")
    , @NamedQuery(name = "OvertimeRequest.findByStartTime", query = "SELECT o FROM OvertimeRequest o WHERE o.startTime = :startTime")
    , @NamedQuery(name = "OvertimeRequest.findByEndTime", query = "SELECT o FROM OvertimeRequest o WHERE o.endTime = :endTime")
    , @NamedQuery(name = "OvertimeRequest.findByActivity", query = "SELECT o FROM OvertimeRequest o WHERE o.activity = :activity")
    , @NamedQuery(name = "OvertimeRequest.findByIsDelete", query = "SELECT o FROM OvertimeRequest o WHERE o.isDelete = :isDelete")
    , @NamedQuery(name = "OvertimeRequest.findByOSalary", query = "SELECT o FROM OvertimeRequest o WHERE o.oSalary = :oSalary")})
public class OvertimeRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "REQ_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqDate;
    @Basic(optional = false)
    @Column(name = "START_TIME")
    private short startTime;
    @Basic(optional = false)
    @Column(name = "END_TIME")
    private short endTime;
    @Basic(optional = false)
    @Column(name = "ACTIVITY")
    private String activity;
    @Basic(optional = false)
    @Column(name = "IS_DELETE")
    private Character isDelete;
    @Basic(optional = false)
    @Column(name = "O_SALARY")
    private long oSalary;
    @Basic(optional = false)
    @Lob
    @Column(name = "DOC")
    private Serializable doc;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Employee employee;
    @JoinColumn(name = "OVERTIME_TYPE", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private OvertimeType overtimeType;

    public OvertimeRequest() {
    }

    public OvertimeRequest(Long id) {
        this.id = id;
    }
    
    public OvertimeRequest(Long id, Date reqDate, short startTime, short endTime, String activity, Character isDelete, long oSalary) {
        this.id = id;
        this.reqDate = reqDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
        this.isDelete = isDelete;
        this.oSalary = oSalary;
     
    }
    public OvertimeRequest(Long id, Date reqDate, short startTime, short endTime, String activity, Character isDelete, long oSalary, Serializable doc) {
        this.id = id;
        this.reqDate = reqDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
        this.isDelete = isDelete;
        this.oSalary = oSalary;
        this.doc = doc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public short getStartTime() {
        return startTime;
    }

    public void setStartTime(short startTime) {
        this.startTime = startTime;
    }

    public short getEndTime() {
        return endTime;
    }

    public void setEndTime(short endTime) {
        this.endTime = endTime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Character getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Character isDelete) {
        this.isDelete = isDelete;
    }

    public long getOSalary() {
        return oSalary;
    }

    public void setOSalary(long oSalary) {
        this.oSalary = oSalary;
    }

    public Serializable getDoc() {
        return doc;
    }

    public void setDoc(Serializable doc) {
        this.doc = doc;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public OvertimeType getOvertimeType() {
        return overtimeType;
    }

    public void setOvertimeType(OvertimeType overtimeType) {
        this.overtimeType = overtimeType;
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
        if (!(object instanceof OvertimeRequest)) {
            return false;
        }
        OvertimeRequest other = (OvertimeRequest) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.OvertimeRequest[ id=" + id + " ]";
    }
    
}
