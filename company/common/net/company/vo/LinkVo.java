package net.company.vo;

import java.sql.Timestamp;


/**
 * Link entity. @author MyEclipse Persistence Tools
 */

public class LinkVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String title;
     private String url;
     private Timestamp time;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public LinkVo() {
    }

	/** minimal constructor */
    public LinkVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public LinkVo(ManagerVo manager, String title, String url, Timestamp time, Boolean enable) {
        this.manager = manager;
        this.title = title;
        this.url = url;
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

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
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