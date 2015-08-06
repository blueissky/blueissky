package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class NewsVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private NewstypeVo newstype;
     private ManagerVo manager;
     private String title;
     private Timestamp time;
     private String content;
     private Boolean enable;
     private Set m1s = new HashSet(0);


    // Constructors

    /** default constructor */
    public NewsVo() {
    }

	/** minimal constructor */
    public NewsVo(NewstypeVo newstype, ManagerVo manager, Boolean enable) {
        this.newstype = newstype;
        this.manager = manager;
        this.enable = enable;
    }
    
    /** full constructor */
    public NewsVo(NewstypeVo newstype, ManagerVo manager, String title, Timestamp time, String content, Boolean enable, Set m1s) {
        this.newstype = newstype;
        this.manager = manager;
        this.title = title;
        this.time = time;
        this.content = content;
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

    public NewstypeVo getNewstype() {
        return this.newstype;
    }
    
    public void setNewstype(NewstypeVo newstype) {
        this.newstype = newstype;
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

    public Timestamp getTime() {
        return this.time;
    }
    
    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
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