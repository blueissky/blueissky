package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class MessageVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String customerIp;
     private String title;
     private String name;
     private String tel;
     private String qq;
     private String content;
     private Timestamp time;
     private Boolean enable;
     private Set m6s = new HashSet(0);


    // Constructors

    /** default constructor */
    public MessageVo() {
    }

	/** minimal constructor */
    public MessageVo(String customerIp, Boolean enable) {
        this.customerIp = customerIp;
        this.enable = enable;
    }
    
    /** full constructor */
    public MessageVo(String customerIp, String title, String name, String tel, String qq, String content, Timestamp time, Boolean enable, Set m6s) {
        this.customerIp = customerIp;
        this.title = title;
        this.name = name;
        this.tel = tel;
        this.qq = qq;
        this.content = content;
        this.time = time;
        this.enable = enable;
        this.m6s = m6s;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerIp() {
        return this.customerIp;
    }
    
    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQq() {
        return this.qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
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

    public Set getM6s() {
        return this.m6s;
    }
    
    public void setM6s(Set m6s) {
        this.m6s = m6s;
    }
   








}