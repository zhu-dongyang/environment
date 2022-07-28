package com.zdy.environment.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author zhudongyang
 * @create 2022-07-25 22:00
 */
public class Echarts {
    private Integer id;
    private Integer tem;
    private Integer hum;
    private Integer gas;
    private Integer o;
    private Integer light;
    private Integer other;
    private String update_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTem() {
        return tem;
    }

    public void setTem(Integer tem) {
        this.tem = tem;
    }

    public Integer getHum() {
        return hum;
    }

    public void setHum(Integer hum) {
        this.hum = hum;
    }

    public Integer getGas() {
        return gas;
    }

    public void setGas(Integer gas) {
        this.gas = gas;
    }

    public Integer getO() {
        return o;
    }

    public void setO(Integer o) {
        this.o = o;
    }

    public Integer getLight() {
        return light;
    }

    public void setLight(Integer light) {
        this.light = light;
    }

    public Integer getOther() {
        return other;
    }

    public void setOther(Integer other) {
        this.other = other;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Echarts{" +
                "id=" + id +
                ", tem=" + tem +
                ", hum=" + hum +
                ", gas=" + gas +
                ", o=" + o +
                ", light=" + light +
                ", other=" + other +
                ", update_time='" + update_time + '\'' +
                ", date=" + date +
                '}';
    }
}
