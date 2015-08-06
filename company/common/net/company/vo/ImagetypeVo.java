package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Imagetype entity. @author MyEclipse Persistence Tools
 */

public class ImagetypeVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String name;
     private Timestamp time;
     private Boolean enable;
     private Set images = new HashSet(0);


    // Constructors

    /** default constructor */
    public ImagetypeVo() {
    }

	/** minimal constructor */
    public ImagetypeVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public ImagetypeVo(ManagerVo manager, String name, Timestamp time, Boolean enable, Set images) {
        this.manager = manager;
        this.name = name;
        this.time = time;
        this.enable = enable;
        this.images = images;
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

    public Set getImages() {
        return this.images;
    }
    
    public void setImages(Set images) {
        this.images = images;
    }
   








}