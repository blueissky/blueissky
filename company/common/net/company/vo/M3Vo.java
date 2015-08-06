package net.company.vo;



/**
 * M3 entity. @author MyEclipse Persistence Tools
 */

public class M3Vo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ImageVo image;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public M3Vo() {
    }

	/** minimal constructor */
    public M3Vo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public M3Vo(ImageVo image, Boolean enable) {
        this.image = image;
        this.enable = enable;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public ImageVo getImage() {
        return this.image;
    }
    
    public void setImage(ImageVo image) {
        this.image = image;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
   








}