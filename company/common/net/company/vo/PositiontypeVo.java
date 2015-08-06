package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Positiontype entity. @author MyEclipse Persistence Tools
 */

public class PositiontypeVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String positiontype;
     private Timestamp time;
     private Boolean enable;
     private Set emploies = new HashSet(0);


    // Constructors

    /** default constructor */
    public PositiontypeVo() {
    }

	/** minimal constructor */
    public PositiontypeVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public PositiontypeVo(ManagerVo manager, String positiontype, Timestamp time, Boolean enable, Set emploies) {
        this.manager = manager;
        this.positiontype = positiontype;
        this.time = time;
        this.enable = enable;
        this.emploies = emploies;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public ManagerVo getManager() {
        return this.manager;
    }
    
    public void setManager(ManagerVo manager) {
        this.manager = manager;
    }

    public String getPositiontype() {
        return this.positiontype;
    }
    
    public void setPositiontype(String positiontype) {
        this.positiontype = positiontype;
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

    public Set getEmploies() {
        return this.emploies;
    }
    
    public void setEmploies(Set emploies) {
        this.emploies = emploies;
    }
   








}