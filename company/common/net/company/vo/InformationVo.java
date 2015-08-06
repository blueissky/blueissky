package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Information entity. @author MyEclipse Persistence Tools
 */

public class InformationVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String title;
     private String content;
     private Timestamp time;
     private Boolean enable;
     private Set m2s = new HashSet(0);


    // Constructors

    /** default constructor */
    public InformationVo() {
    }

	/** minimal constructor */
    public InformationVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public InformationVo(ManagerVo manager, String title, String content, Timestamp time, Boolean enable, Set m2s) {
        this.manager = manager;
        this.title = title;
        this.content = content;
        this.time = time;
        this.enable = enable;
        this.m2s = m2s;
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

    public Set getM2s() {
        return this.m2s;
    }
    
    public void setM2s(Set m2s) {
        this.m2s = m2s;
    }
   








}