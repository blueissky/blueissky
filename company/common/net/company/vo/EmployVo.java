package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Employ entity. @author MyEclipse Persistence Tools
 */

public class EmployVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private PositiontypeVo positiontype;
     private ManagerVo manager;
     private String content;
     private Timestamp time;
     private Boolean enable;
     private Set m4s = new HashSet(0);


    // Constructors

    /** default constructor */
    public EmployVo() {
    }

	/** minimal constructor */
    public EmployVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public EmployVo(PositiontypeVo positiontype, ManagerVo manager, String content, Timestamp time, Boolean enable, Set m4s) {
        this.positiontype = positiontype;
        this.manager = manager;
        this.content = content;
        this.time = time;
        this.enable = enable;
        this.m4s = m4s;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public PositiontypeVo getPositiontype() {
        return this.positiontype;
    }
    
    public void setPositiontype(PositiontypeVo positiontype) {
        this.positiontype = positiontype;
    }

    public ManagerVo getManager() {
        return this.manager;
    }
    
    public void setManager(ManagerVo manager) {
        this.manager = manager;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getTime() {
        return this.time;
    }
    
    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Set getM4s() {
        return this.m4s;
    }
    
    public void setM4s(Set m4s) {
        this.m4s = m4s;
    }
   








}