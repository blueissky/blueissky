package net.company.vo;

import java.util.HashSet;
import java.util.Set;


/**
 * Backstage entity. @author MyEclipse Persistence Tools
 */

public class BackstageVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Boolean content;
     private Boolean frame;
     private Boolean newAccount;
     private Boolean lvl;
     private Boolean enable;
     private Set managers = new HashSet(0);


    // Constructors

    /** default constructor */
    public BackstageVo() {
    }

    
    /** full constructor */
    public BackstageVo(Boolean content, Boolean frame, Boolean newAccount, Boolean lvl, Boolean enable, Set managers) {
        this.content = content;
        this.frame = frame;
        this.newAccount = newAccount;
        this.lvl = lvl;
        this.enable = enable;
        this.managers = managers;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getContent() {
        return this.content;
    }
    
    public void setContent(Boolean content) {
        this.content = content;
    }

    public Boolean getFrame() {
        return this.frame;
    }
    
    public void setFrame(Boolean frame) {
        this.frame = frame;
    }

    public Boolean getNewAccount() {
        return this.newAccount;
    }
    
    public void setNewAccount(Boolean newAccount) {
        this.newAccount = newAccount;
    }

    public Boolean getLvl() {
        return this.lvl;
    }
    
    public void setLvl(Boolean lvl) {
        this.lvl = lvl;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Set getManagers() {
        return this.managers;
    }
    
    public void setManagers(Set managers) {
        this.managers = managers;
    }
   








}