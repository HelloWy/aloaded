package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "remessage")
public class Remessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String team;

    private String remessage;

    private Integer reid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return team
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param team
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * @return remessage
     */
    public String getRemessage() {
        return remessage;
    }

    /**
     * @param remessage
     */
    public void setRemessage(String remessage) {
        this.remessage = remessage;
    }

    /**
     * @return reid
     */
    public Integer getReid() {
        return reid;
    }

    /**
     * @param reid
     */
    public void setReid(Integer reid) {
        this.reid = reid;
    }
}