package net.company.vo;



/**
 * M2 entity. @author MyEclipse Persistence Tools
 */

public class M2Vo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private InformationVo information;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public M2Vo() {
    }

	/** minimal constructor */
    public M2Vo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public M2Vo(InformationVo information, Boolean enable) {
        this.information = information;
        this.enable = enable;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public InformationVo getInformation() {
        return this.information;
    }
    
    public void setInformation(InformationVo information) {
        this.information = information;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
   








}