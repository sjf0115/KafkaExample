package com.kafka.example.bean;

import com.google.gson.annotations.SerializedName;

/**
 * 功能：淘宝用户行为
 * 作者：SmartSi
 * 博客：http://smartsi.club/
 * 公众号：大数据生态
 * 日期：2022/5/3 下午10:48
 */
public class UserBehavior {
    // 用户Id
    private Long uid;
    // 商品Id
    private Long pid;
    // 类别Id
    private Long cid;
    // 行为类型
    private String type;
    // 行为时间戳
    @SerializedName("ts")
    private Long timestamp;
    // 行为
    private String time;

    public UserBehavior() {
    }

    public UserBehavior(Long uid, Long pid, Long cid, String type, Long timestamp, String time) {
        this.uid = uid;
        this.pid = pid;
        this.cid = cid;
        this.type = type;
        this.timestamp = timestamp;
        this.time = time;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserBehavior{" +
                "uid=" + uid +
                ", pid=" + pid +
                ", cid=" + cid +
                ", type='" + type + '\'' +
                ", timestamp=" + timestamp +
                ", time='" + time + '\'' +
                '}';
    }
}
