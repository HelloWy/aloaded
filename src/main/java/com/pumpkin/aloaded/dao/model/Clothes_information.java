package com.pumpkin.aloaded.dao.model;

import javax.persistence.*;

@Table(name = "clothes_information")
public class Clothes_information {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String team;

    @Column(name = "student_id")
    private String studentId;

    private String name;

    @Column(name = "identity_id")
    private String identityId;

    private String sex;

    private String qihouqu;

    private String junbingzhong;

    private String danweiqufen;

    private String danweileixing;

    private String zhiwujibie;

    private String xianzhishijian;

    private String junxianjibie;

    private String xianxianshijian;

    private String gongzuogangwei;

    private String gongzuoshijian;

    private String ruwushijian;

    private String tiganshijian;

    private String gaixuanshijian;

    private String zucema;

    private String dengjibiaohao;

    private String shengao;

    private String xiongwei;

    private String yaowei;

    private String touwei;

    private String jiaochang;

    private String tuochang;

    private String daima;

    private String pingming;

    private String haoxing;

    private String beidongleixing;

	public Clothes_information(String team, String studentId, String name, String identityId, String sex,
			String shengao, String xiongwei, String yaowei, String touwei) {
		super();
		this.team = team;
		this.studentId = studentId;
		this.name = name;
		this.identityId = identityId;
		this.sex = sex;
		this.shengao = shengao;
		this.xiongwei = xiongwei;
		this.yaowei = yaowei;
		this.touwei = touwei;
	}
	

	public Clothes_information() {
		super();
	}


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
     * @return student_id
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
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
     * @return identity_id
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * @param identityId
     */
    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return qihouqu
     */
    public String getQihouqu() {
        return qihouqu;
    }

    /**
     * @param qihouqu
     */
    public void setQihouqu(String qihouqu) {
        this.qihouqu = qihouqu;
    }

    /**
     * @return junbingzhong
     */
    public String getJunbingzhong() {
        return junbingzhong;
    }

    /**
     * @param junbingzhong
     */
    public void setJunbingzhong(String junbingzhong) {
        this.junbingzhong = junbingzhong;
    }

    /**
     * @return danweiqufen
     */
    public String getDanweiqufen() {
        return danweiqufen;
    }

    /**
     * @param danweiqufen
     */
    public void setDanweiqufen(String danweiqufen) {
        this.danweiqufen = danweiqufen;
    }

    /**
     * @return danweileixing
     */
    public String getDanweileixing() {
        return danweileixing;
    }

    /**
     * @param danweileixing
     */
    public void setDanweileixing(String danweileixing) {
        this.danweileixing = danweileixing;
    }

    /**
     * @return zhiwujibie
     */
    public String getZhiwujibie() {
        return zhiwujibie;
    }

    /**
     * @param zhiwujibie
     */
    public void setZhiwujibie(String zhiwujibie) {
        this.zhiwujibie = zhiwujibie;
    }

    /**
     * @return xianzhishijian
     */
    public String getXianzhishijian() {
        return xianzhishijian;
    }

    /**
     * @param xianzhishijian
     */
    public void setXianzhishijian(String xianzhishijian) {
        this.xianzhishijian = xianzhishijian;
    }

    /**
     * @return junxianjibie
     */
    public String getJunxianjibie() {
        return junxianjibie;
    }

    /**
     * @param junxianjibie
     */
    public void setJunxianjibie(String junxianjibie) {
        this.junxianjibie = junxianjibie;
    }

    /**
     * @return xianxianshijian
     */
    public String getXianxianshijian() {
        return xianxianshijian;
    }

    /**
     * @param xianxianshijian
     */
    public void setXianxianshijian(String xianxianshijian) {
        this.xianxianshijian = xianxianshijian;
    }

    /**
     * @return gongzuogangwei
     */
    public String getGongzuogangwei() {
        return gongzuogangwei;
    }

    /**
     * @param gongzuogangwei
     */
    public void setGongzuogangwei(String gongzuogangwei) {
        this.gongzuogangwei = gongzuogangwei;
    }

    /**
     * @return gongzuoshijian
     */
    public String getGongzuoshijian() {
        return gongzuoshijian;
    }

    /**
     * @param gongzuoshijian
     */
    public void setGongzuoshijian(String gongzuoshijian) {
        this.gongzuoshijian = gongzuoshijian;
    }

    /**
     * @return ruwushijian
     */
    public String getRuwushijian() {
        return ruwushijian;
    }

    /**
     * @param ruwushijian
     */
    public void setRuwushijian(String ruwushijian) {
        this.ruwushijian = ruwushijian;
    }

    /**
     * @return tiganshijian
     */
    public String getTiganshijian() {
        return tiganshijian;
    }

    /**
     * @param tiganshijian
     */
    public void setTiganshijian(String tiganshijian) {
        this.tiganshijian = tiganshijian;
    }

    /**
     * @return gaixuanshijian
     */
    public String getGaixuanshijian() {
        return gaixuanshijian;
    }

    /**
     * @param gaixuanshijian
     */
    public void setGaixuanshijian(String gaixuanshijian) {
        this.gaixuanshijian = gaixuanshijian;
    }

    /**
     * @return zucema
     */
    public String getZucema() {
        return zucema;
    }

    /**
     * @param zucema
     */
    public void setZucema(String zucema) {
        this.zucema = zucema;
    }

    /**
     * @return dengjibiaohao
     */
    public String getDengjibiaohao() {
        return dengjibiaohao;
    }

    /**
     * @param dengjibiaohao
     */
    public void setDengjibiaohao(String dengjibiaohao) {
        this.dengjibiaohao = dengjibiaohao;
    }

    /**
     * @return shengao
     */
    public String getShengao() {
        return shengao;
    }

    /**
     * @param shengao
     */
    public void setShengao(String shengao) {
        this.shengao = shengao;
    }

    /**
     * @return xiongwei
     */
    public String getXiongwei() {
        return xiongwei;
    }

    /**
     * @param xiongwei
     */
    public void setXiongwei(String xiongwei) {
        this.xiongwei = xiongwei;
    }

    /**
     * @return yaowei
     */
    public String getYaowei() {
        return yaowei;
    }

    /**
     * @param yaowei
     */
    public void setYaowei(String yaowei) {
        this.yaowei = yaowei;
    }

    /**
     * @return touwei
     */
    public String getTouwei() {
        return touwei;
    }

    /**
     * @param touwei
     */
    public void setTouwei(String touwei) {
        this.touwei = touwei;
    }

    /**
     * @return jiaochang
     */
    public String getJiaochang() {
        return jiaochang;
    }

    /**
     * @param jiaochang
     */
    public void setJiaochang(String jiaochang) {
        this.jiaochang = jiaochang;
    }

    /**
     * @return tuochang
     */
    public String getTuochang() {
        return tuochang;
    }

    /**
     * @param tuochang
     */
    public void setTuochang(String tuochang) {
        this.tuochang = tuochang;
    }

    /**
     * @return daima
     */
    public String getDaima() {
        return daima;
    }

    /**
     * @param daima
     */
    public void setDaima(String daima) {
        this.daima = daima;
    }

    /**
     * @return pingming
     */
    public String getPingming() {
        return pingming;
    }

    /**
     * @param pingming
     */
    public void setPingming(String pingming) {
        this.pingming = pingming;
    }

    /**
     * @return haoxing
     */
    public String getHaoxing() {
        return haoxing;
    }

    /**
     * @param haoxing
     */
    public void setHaoxing(String haoxing) {
        this.haoxing = haoxing;
    }

    /**
     * @return beidongleixing
     */
    public String getBeidongleixing() {
        return beidongleixing;
    }

    /**
     * @param beidongleixing
     */
    public void setBeidongleixing(String beidongleixing) {
        this.beidongleixing = beidongleixing;
    }
}