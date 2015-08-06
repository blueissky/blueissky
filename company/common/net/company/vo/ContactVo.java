package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Contact entity. @author MyEclipse Persistence Tools
 */

public class ContactVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String tel;
     private String email;
     private String qq;
     private String address;
     private Timestamp time;
     private Boolean enable;
     private Set m1s = new HashSet(0);


    // Constructors

    /** default constructor */
    public ContactVo() {
    }

	/** minimal constructor */
    public ContactVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public ContactVo(ManagerVo manager, String tel, String email, String qq, String address, Timestamp time, Boolean enable, Set m1s) {
        this.manager = manager;
        this.tel = tel;
        this.email = email;
        this.qq = qq;
        this.address = address;
        this.time = time;
        this.enable = enable;
        this.m1s = m1s;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public ManagerVo getManager() {
        return this.manager;
    }
    
    public void setManager(ManagerVo manager) {
        this.manager = manager;
    }

    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return this.qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
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

    public Set getM1s() {
        return this.m1s;
    }
    
    public void setM1s(Set m1s) {
        this.m1s = m1s;
    }
   








}