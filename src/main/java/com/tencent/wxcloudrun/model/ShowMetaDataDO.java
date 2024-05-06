package com.tencent.wxcloudrun.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author chengleiyi
 */
public class ShowMetaDataDO {
    /**
     * Database Column Remarks:
     *   主键
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Long id;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date gmtCreate;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date gmtModified;

    /**
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String showCode;

    /**
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String showName;

    /**
     * Database Column Remarks:
     *   主图
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String mainPicture;

    /**
     * Database Column Remarks:
     *   渠道
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private String channel;

    /**
     * Database Column Remarks:
     *   最后一场的时间
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Date lastShowTime;

    /**
     * Database Column Remarks:
     *   状态
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Byte status;

    /**
     * Database Column Remarks:
     *   排序顺序
     *
     *
     * @mbg.generated
     */
    @Getter
    @Setter
    private Integer index;

    /**
     * @return
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", showCode=").append(showCode);
        sb.append(", showName=").append(showName);
        sb.append(", mainPicture=").append(mainPicture);
        sb.append(", channel=").append(channel);
        sb.append(", lastShowTime=").append(lastShowTime);
        sb.append(", status=").append(status);
        sb.append(", index=").append(index);
        sb.append("]");
        return sb.toString();
    }
}