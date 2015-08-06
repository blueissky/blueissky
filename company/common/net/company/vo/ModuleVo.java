package net.company.vo;

import java.util.HashSet;
import java.util.Set;


/**
 * Module entity. @author MyEclipse Persistence Tools
 */

public class ModuleVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String tableName;
     private Boolean enable;
     private Set navs = new HashSet(0);


    // Constructors

    /** default constructor */
    public ModuleVo() {
    }

	/** minimal constructor */
    public ModuleVo(String tableName, Boolean enable) {
        this.tableName = tableName;
        this.enable = enable;
    }
    
    /** full constructor */
    public ModuleVo(String tableName, Boolean enable, Set navs) {
        this.tableName = tableName;
        this.enable = enable;
        this.navs = navs;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTableName() {
        return this.tableName;
    }
    
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Set getNavs() {
        return this.navs;
    }
    
    public void setNavs(Set navs) {
        this.navs = navs;
    }
   








}