package com.zf.domain.vo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import java.util.Date;

@Data
public class NotesVo {

    @ApiModelProperty(value = "公司Id",dataType = "long")
    private Integer id;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private Integer userId;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private String userName;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private String phoneNumber;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private String avatar;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private String clientName;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private Integer replyId;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private String notesContent;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private String del_flag;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private Integer isPublic;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private Integer createBy;
    @ApiModelProperty(value = "公司Id",dataType = "long")
    private Date createTime;

    public NotesVo(Integer userId, String userName, String phoneNumber, String avatar, String clientName, Integer replyId, String notesContent, String del_flag, Integer isPublic, Integer createBy, Date createTime) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.avatar = avatar;
        this.clientName = clientName;
        this.replyId = replyId;
        this.notesContent = notesContent;
        this.del_flag = del_flag;
        this.isPublic = isPublic;
        this.createBy = createBy;
        this.createTime = createTime;
    }

    public NotesVo() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getNotesContent() {
        return notesContent;
    }

    public void setNotesContent(String notesContent) {
        this.notesContent = notesContent;
    }

    public String getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(String del_flag) {
        this.del_flag = del_flag;
    }

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}