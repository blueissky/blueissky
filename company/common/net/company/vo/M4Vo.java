package net.company.vo;



/**
 * M4 entity. @author MyEclipse Persistence Tools
 */

public class M4Vo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private EmployVo employ;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public M4Vo() {
    }

	/** minimal constructor */
    public M4Vo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public M4Vo(EmployVo employ, Boolean enable) {
        this.employ = employ;
        this.enable = enable;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public EmployVo getEmploy() {
        return this.employ;
    }
    
    public void setEmploy(EmployVo employ) {
        this.employ = employ;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
   








}