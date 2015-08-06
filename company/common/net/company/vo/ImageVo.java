package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Image entity. @author MyEclipse Persistence Tools
 */

public class ImageVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ImagetypeVo imagetype;
     private ManagerVo manager;
     private String filename;
     private String information;
     private Integer local;
     private Timestamp time;
     private Boolean enable;
     private Set m3s = new HashSet(0);


    // Constructors

    /** default constructor */
    public ImageVo() {
    }

	/** minimal constructor */
    public ImageVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public ImageVo(ImagetypeVo imagetype, ManagerVo manager, String filename, String information, Integer local, Timestamp time, Boolean enable, Set m3s) {
        this.imagetype = imagetype;
        this.manager = manager;
        this.filename = filename;
        this.information = information;
        this.local = local;
        this.time = time;
        this.enable = enable;
        this.m3s = m3s;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public ImagetypeVo getImagetype() {
        return this.imagetype;
    }
    
    public void setImagetype(ImagetypeVo imagetype) {
        this.imagetype = imagetype;
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

    public String getInformation() {
        return this.information;
    }
    
    public void setInformation(String information) {
        this.information = information;
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

    public Set getM3s() {
        return this.m3s;
    }
    
    public void setM3s(Set m3s) {
        this.m3s = m3s;
    }
   








}