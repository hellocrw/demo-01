package com.ly.springboot.demo01.entity;

public class LyTestXsxx {
    private String xh;
    private String xm;
    private String xb;
    private String nl;
    private String zy;
    private String bysj;
    private String byxx;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getBysj() {
        return bysj;
    }

    public void setBysj(String bysj) {
        this.bysj = bysj;
    }

    public String getByxx() {
        return byxx;
    }

    public void setByxx(String byxx) {
        this.byxx = byxx;
    }

    public LyTestXsxx() {
    }

    public LyTestXsxx(String xh, String xm, String xb, String nl, String zy, String bysj, String byxx) {
        this.xh = xh;
        this.xm = xm;
        this.xb = xb;
        this.nl = nl;
        this.zy = zy;
        this.bysj = bysj;
        this.byxx = byxx;
    }

    @Override
    public String toString() {
        return "LyTestXsxx{" +
                "xh='" + xh + '\'' +
                ", xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", nl='" + nl + '\'' +
                ", zy='" + zy + '\'' +
                ", bysj='" + bysj + '\'' +
                ", byxx='" + byxx + '\'' +
                '}';
    }
}
