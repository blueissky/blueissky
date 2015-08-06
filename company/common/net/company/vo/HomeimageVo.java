package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Homeimage entity. @author MyEclipse Persistence Tools
 */

public class HomeimageVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String filename;
     private Integer local;
     private Timestamp time;
     private Boolean enable;
     private Set m1s = new HashSet(0);


    // Constructors

    /** default constructor */
    public HomeimageVo() {
    }

	/** minimal constructor */
    public HomeimageVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public HomeimageVo(ManagerVo manager, String filename, Integer local, Timestamp time, Boolean enable, Set m1s) {
        this.manager = manager;
        this.filename = filename;
        this.local = local;
        this.time = time;
        this.enable = enable;
        this.m1s = m1s;
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

    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getLocal() {
        return this.local;
    }
    
    public void setLocal(Integer local) {
        this.local = local;
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

    public Set getM1s() {
        return this.m1s;
    }
    
    public void setM1s(Set m1s) {
        this.m1s = m1s;
    }
   








}