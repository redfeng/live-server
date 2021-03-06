package org.live.live.entity;

import org.live.common.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;

/**
 *  举报信息的实体
 * Created by wang on 2017/4/24.
 */
@Entity
@Table(name = "live_report")
public class Report extends BaseEntity{

    /**
     * 记录号
     */
    @Column
    private String reportNum ;

    /**
     *  举报人
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private MobileUser user ;

    /**
     * 直播间
     */
    @ManyToOne
    @JoinColumn(name = "live_room_id")
    private LiveRoom liveRoom ;

    /**
     *  举报时间
     */
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime ;

    /**
     * 处理状态：true: 已处理，false：未处理
     */
    @Column
    private boolean handleType ;

    public String getReportNum() {
        return reportNum;
    }

    public void setReportNum(String reportNum) {
        this.reportNum = reportNum;
    }

    public MobileUser getUser() {
        return user;
    }

    public void setUser(MobileUser user) {
        this.user = user;
    }

    public LiveRoom getLiveRoom() {
        return liveRoom;
    }

    public void setLiveRoom(LiveRoom liveRoom) {
        this.liveRoom = liveRoom;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isHandleType() {
        return handleType;
    }

    public void setHandleType(boolean handleType) {
        this.handleType = handleType;
    }
}
