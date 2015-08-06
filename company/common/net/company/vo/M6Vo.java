package net.company.vo;



/**
 * M6 entity. @author MyEclipse Persistence Tools
 */

public class M6Vo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private MessageVo message;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public M6Vo() {
    }

	/** minimal constructor */
    public M6Vo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public M6Vo(MessageVo message, Boolean enable) {
        this.message = message;
        this.enable = enable;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public MessageVo getMessage() {
        return this.message;
    }
    
    public void setMessage(MessageVo message) {
        this.message = message;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
   








}