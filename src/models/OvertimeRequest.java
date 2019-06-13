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
@Table(name = "OVERTIME_REQUESTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OvertimeRequest.findAll", query = "SELECT o FROM OvertimeRequest o")
    , @NamedQuery(name = "OvertimeRequest.findById", query = "SELECT o FROM OvertimeRequest o WHERE o.id = :id")
    , @NamedQuery(name = "OvertimeRequest.findByReqDate", query = "SELECT o FROM OvertimeRequest o WHERE o.reqDate = :reqDate")
    , @NamedQuery(name = "OvertimeRequest.findByStartTime", query = "SELECT o FROM OvertimeRequest o WHERE o.startTime = :startTime")
    , @NamedQuery(name = "OvertimeRequest.findByEndTime", query = "SELECT o FROM OvertimeRequest o WHERE o.endTime = :endTime")
    , @NamedQuery(name = "OvertimeRequest.findByActivity", query = "SELECT o FROM OvertimeRequest o WHERE o.activity = :activity")
    , @NamedQuery(name = "OvertimeRequest.findByIsDelete", query = "SELECT o FROM OvertimeRequest o WHERE o.isDelete = :isDelete")})
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
    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Basic(optional = false)
    @Column(name = "END_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    @Basic(optional = false)
    @Column(name = "ACTIVITY")
    private String activity;
    @Basic(optional = false)
    @Column(name = "IS_DELETE")
    private Character isDelete;
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
    
    public OvertimeRequest(Long id, Date reqDate, Date startTime, Date endTime, String activity) {
        this.id = id;
        this.reqDate = reqDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
    }

    public OvertimeRequest(Long id, Date reqDate, Date startTime, Date endTime, String activity, Character isDelete) {
        this.id = id;
        this.reqDate = reqDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
        this.isDelete = isDelete;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
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
