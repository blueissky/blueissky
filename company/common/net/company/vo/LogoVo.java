package net.company.vo;

import java.sql.Timestamp;


/**
 * Logo entity. @author MyEclipse Persistence Tools
 */

public class LogoVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String filename;
     private Timestamp time;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public LogoVo() {
    }

	/** minimal constructor */
    public LogoVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public LogoVo(ManagerVo manager, String filename, Timestamp time, Boolean enable) {
        this.manager = manager;
        this.filename = filename;
        this.time = time;
        this.enable = enable;
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
   








}