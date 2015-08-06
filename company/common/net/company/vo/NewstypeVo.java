package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Newstype entity. @author MyEclipse Persistence Tools
 */

public class NewstypeVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String name;
     private Timestamp time;
     private Boolean enable;
     private Set newses = new HashSet(0);


    // Constructors

    /** default constructor */
    public NewstypeVo() {
    }

	/** minimal constructor */
    public NewstypeVo(ManagerVo manager, Timestamp time, Boolean enable) {
        this.manager = manager;
        this.time = time;
        this.enable = enable;
    }
    
    /** full constructor */
    public NewstypeVo(ManagerVo manager, String name, Timestamp time, Boolean enable, Set newses) {
        this.manager = manager;
        this.name = name;
        this.time = time;
        this.enable = enable;
        this.newses = newses;
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

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
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

    public Set getNewses() {
        return this.newses;
    }
    
    public void setNewses(Set newses) {
        this.newses = newses;
    }
   








}