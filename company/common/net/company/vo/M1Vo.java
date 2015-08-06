package net.company.vo;



/**
 * M1 entity. @author MyEclipse Persistence Tools
 */

public class M1Vo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private HomeimageVo homeimage;
     private ContactVo contact;
     private NewsVo news;
     private Boolean enable;


    // Constructors

    /** default constructor */
    public M1Vo() {
    }

	/** minimal constructor */
    public M1Vo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public M1Vo(HomeimageVo homeimage, ContactVo contact, NewsVo news, Boolean enable) {
        this.homeimage = homeimage;
        this.contact = contact;
        this.news = news;
        this.enable = enable;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public HomeimageVo getHomeimage() {
        return this.homeimage;
    }
    
    public void setHomeimage(HomeimageVo homeimage) {
        this.homeimage = homeimage;
    }

    public ContactVo getContact() {
        return this.contact;
    }
    
    public void setContact(ContactVo contact) {
        this.contact = contact;
    }

    public NewsVo getNews() {
        return this.news;
    }
    
    public void setNews(NewsVo news) {
        this.news = news;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
   








}