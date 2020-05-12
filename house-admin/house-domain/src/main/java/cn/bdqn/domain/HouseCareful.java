package cn.bdqn.domain;

/**
 * 房屋详细信息
 */
public class HouseCareful {
    private Integer id;

    //房屋id
    private Integer houseId;

    //床
    private Integer chuang;

    //沙发
    private Integer shafa;

    //空调
    private Integer kongtiao;

    //燃气
    private Integer ranqi;

    //洗衣机
    private Integer xiyiji;

    //宽带
    private Integer kuandai;

    //电视
    private Integer dianshi;

    //冰箱
    private Integer bingxiang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getChuang() {
        return chuang;
    }

    public void setChuang(Integer chuang) {
        this.chuang = chuang;
    }

    public Integer getShafa() {
        return shafa;
    }

    public void setShafa(Integer shafa) {
        this.shafa = shafa;
    }

    public Integer getKongtiao() {
        return kongtiao;
    }

    public void setKongtiao(Integer kongtiao) {
        this.kongtiao = kongtiao;
    }

    public Integer getRanqi() {
        return ranqi;
    }

    public void setRanqi(Integer ranqi) {
        this.ranqi = ranqi;
    }

    public Integer getXiyiji() {
        return xiyiji;
    }

    public void setXiyiji(Integer xiyiji) {
        this.xiyiji = xiyiji;
    }

    public Integer getKuandai() {
        return kuandai;
    }

    public void setKuandai(Integer kuandai) {
        this.kuandai = kuandai;
    }

    public Integer getDianshi() {
        return dianshi;
    }

    public void setDianshi(Integer dianshi) {
        this.dianshi = dianshi;
    }

    public Integer getBingxiang() {
        return bingxiang;
    }

    public void setBingxiang(Integer bingxiang) {
        this.bingxiang = bingxiang;
    }

    @Override
    public String toString() {
        return "HouseCareful{" +
                "id=" + id +
                ", houseId=" + houseId +
                ", chuang=" + chuang +
                ", shafa=" + shafa +
                ", kongtiao=" + kongtiao +
                ", ranqi=" + ranqi +
                ", xiyiji=" + xiyiji +
                ", kuandai=" + kuandai +
                ", dianshi=" + dianshi +
                ", bingxiang=" + bingxiang +
                '}';
    }
}