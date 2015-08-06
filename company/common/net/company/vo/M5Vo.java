package net.company.vo;



/**
 * M5 entity. @author MyEclipse Persistence Tools
 */

public class M5Vo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private TalkVo talk;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public M5Vo() {
    }

	/** minimal constructor */
    public M5Vo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public M5Vo(TalkVo talk, Boolean enable) {
        this.talk = talk;
        this.enable = enable;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public TalkVo getTalk() {
        return this.talk;
    }
    
    public void setTalk(TalkVo talk) {
        this.talk = talk;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
   








}