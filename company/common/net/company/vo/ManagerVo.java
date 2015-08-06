package net.company.vo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class ManagerVo  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private BackstageVo backstage;
     private String name;
     private String tel;
     private String qq;
     private String username;
     private String password;
     private String email;
     private Timestamp time;
     private Boolean enable;
     private Set contacts = new HashSet(0);
     private Set positiontypes = new HashSet(0);
     private Set emploies = new HashSet(0);
     private Set informations = new HashSet(0);
     private Set copyrights = new HashSet(0);
     private Set newses = new HashSet(0);
     private Set talks = new HashSet(0);
     private Set links = new HashSet(0);
     private Set newstypes = new HashSet(0);
     private Set images = new HashSet(0);
     private Set homeimages = new HashSet(0);
     private Set logos = new HashSet(0);
     private Set imagetypes = new HashSet(0);


    // Constructors

    /** default constructor */
    public ManagerVo() {
    }

	/** minimal constructor */
    public ManagerVo(Boolean enable) {
        this.enable = enable;
    }
    
    /** full constructor */
    public ManagerVo(BackstageVo backstage, String name, String tel, String qq, String username, String password, String email, Timestamp time, Boolean enable, Set contacts, Set positiontypes, Set emploies, Set informations, Set copyrights, Set newses, Set talks, Set links, Set newstypes, Set images, Set homeimages, Set logos, Set imagetypes) {
        this.backstage = backstage;
        this.name = name;
        this.tel = tel;
        this.qq = qq;
        this.username = username;
        this.password = password;
        this.email = email;
        this.time = time;
        this.enable = enable;
        this.contacts = contacts;
        this.positiontypes = positiontypes;
        this.emploies = emploies;
        this.informations = informations;
        this.copyrights = copyrights;
        this.newses = newses;
        this.talks = talks;
        this.links = links;
        this.newstypes = newstypes;
        this.images = images;
        this.homeimages = homeimages;
        this.logos = logos;
        this.imagetypes = imagetypes;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public BackstageVo getBackstage() {
        return this.backstage;
    }
    
    public void setBackstage(BackstageVo backstage) {
        this.backstage = backstage;
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

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
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

    public Set getContacts() {
        return this.contacts;
    }
    
    public void setContacts(Set contacts) {
        this.contacts = contacts;
    }

    public Set getPositiontypes() {
        return this.positiontypes;
    }
    
    public void setPositiontypes(Set positiontypes) {
        this.positiontypes = positiontypes;
    }

    public Set getEmploies() {
        return this.emploies;
    }
    
    public void setEmploies(Set emploies) {
        this.emploies = emploies;
    }

    public Set getInformations() {
        return this.informations;
    }
    
    public void setInformations(Set informations) {
        this.informations = informations;
    }

    public Set getCopyrights() {
        return this.copyrights;
    }
    
    public void setCopyrights(Set copyrights) {
        this.copyrights = copyrights;
    }

    public Set getNewses() {
        return this.newses;
    }
    
    public void setNewses(Set newses) {
        this.newses = newses;
    }

    public Set getTalks() {
        return this.talks;
    }
    
    public void setTalks(Set talks) {
        this.talks = talks;
    }

    public Set getLinks() {
        return this.links;
    }
    
    public void setLinks(Set links) {
        this.links = links;
    }

    public Set getNewstypes() {
        return this.newstypes;
    }
    
    public void setNewstypes(Set newstypes) {
        this.newstypes = newstypes;
    }

    public Set getImages() {
        return this.images;
    }
    
    public void setImages(Set images) {
        this.images = images;
    }

    public Set getHomeimages() {
        return this.homeimages;
    }
    
    public void setHomeimages(Set homeimages) {
        this.homeimages = homeimages;
    }

    public Set getLogos() {
        return this.logos;
    }
    
    public void setLogos(Set logos) {
        this.logos = logos;
    }

    public Set getImagetypes() {
        return this.imagetypes;
    }
    
    public void setImagetypes(Set imagetypes) {
        this.imagetypes = imagetypes;
    }
   








}