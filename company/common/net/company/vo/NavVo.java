package net.company.vo;



/**
 * Nav entity. @author MyEclipse Persistence Tools
 */

public class NavVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ModuleVo module;
     private Integer local;
     private String title;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public NavVo() {
    }

    
    /** full constructor */
    public NavVo(ModuleVo module, Integer local, String title, Boolean enable) {
        this.module = module;
        this.local = local;
        this.title = title;
        this.enable = enable;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public ModuleVo getModule() {
        return this.module;
    }
    
    public void setModule(ModuleVo module) {
        this.module = module;
    }

    public Integer getLocal() {
        return this.local;
    }
    
    public void setLocal(Integer local) {
        this.local = local;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
   








}