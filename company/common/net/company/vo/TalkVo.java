package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Talk entity. @author MyEclipse Persistence Tools
 */

public class TalkVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private ManagerVo manager;
     private String customerIp;
     private String customerContent;
     private Timestamp customerTime;
     private String managerContent;
     private Timestamp managerTime;
     private Boolean enable;
     private Set m5s = new HashSet(0);


    // Constructors

    /** default constructor */
    public TalkVo() {
    }

	/** minimal constructor */
    public TalkVo(ManagerVo manager, Timestamp customerTime, Timestamp managerTime, Boolean enable) {
        this.manager = manager;
        this.customerTime = customerTime;
        this.managerTime = managerTime;
        this.enable = enable;
    }
    
    /** full constructor */
    public TalkVo(ManagerVo manager, String customerIp, String customerContent, Timestamp customerTime, String managerContent, Timestamp managerTime, Boolean enable, Set m5s) {
        this.manager = manager;
        this.customerIp = customerIp;
        this.customerContent = customerContent;
        this.customerTime = customerTime;
        this.managerContent = managerContent;
        this.managerTime = managerTime;
        this.enable = enable;
        this.m5s = m5s;
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

    public String getCustomerIp() {
        return this.customerIp;
    }
    
    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getCustomerContent() {
        return this.customerContent;
    }
    
    public void setCustomerContent(String customerContent) {
        this.customerContent = customerContent;
    }

    public Timestamp getCustomerTime() {
        return this.customerTime;
    }
    
    public void setCustomerTime(Timestamp customerTime) {
        this.customerTime = customerTime;
    }

    public String getManagerContent() {
        return this.managerContent;
    }
    
    public void setManagerContent(String managerContent) {
        this.managerContent = managerContent;
    }

    public Timestamp getManagerTime() {
        return this.managerTime;
    }
    
    public void setManagerTime(Timestamp managerTime) {
        this.managerTime = managerTime;
    }

    public Boolean getEnable() {
        return this.enable;
    }
    
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Set getM5s() {
        return this.m5s;
    }
    
    public void setM5s(Set m5s) {
        this.m5s = m5s;
    }
   








}