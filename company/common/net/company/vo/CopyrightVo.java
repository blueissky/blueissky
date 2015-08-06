package net.company.vo;

import java.sql.Timestamp;


/**
 * Copyright entity. @author MyEclipse Persistence Tools
 */

public class CopyrightVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String content;
     private Timestamp time;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public CopyrightVo() {
    }

	/** minimal constructor */
    public CopyrightVo(ManagerVo manager, Boolean enable) {
        this.manager = manager;
        this.enable = enable;
    }
    
    /** full constructor */
    public CopyrightVo(ManagerVo manager, String content, Timestamp time, Boolean enable) {
        this.manager = manager;
        this.content = content;
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
   








}