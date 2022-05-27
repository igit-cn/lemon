package com.mossle.notification.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * NotificationTemplate 通知模板.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "NOTIFICATION_TEMPLATE")
public class NotificationTemplate implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** id. */
    private Long id;

    /** 编码. */
    private String code;

    /** 名称. */
    private String name;

    /** 内容. */
    private String content;

    /** 附加信息. */
    private String extra;

    /** 优先级. */
    private Integer priority;

    /** 创建时间. */
    private Date createTime;

    /** 创建人. */
    private String creator;

    /** 更新时间. */
    private Date updateTime;

    /** 更新人. */
    private String updater;

    /** 状态. */
    private String status;

    /** APP. */
    private String app;

    /** . */
    private Set<NotificationProvider> notificationProviders = new HashSet<NotificationProvider>(
            0);

    public NotificationTemplate() {
    }

    public NotificationTemplate(Long id) {
        this.id = id;
    }

    public NotificationTemplate(Long id, String code, String name,
            String content, String extra, Integer priority, Date createTime,
            String creator, Date updateTime, String updater, String status,
            String app, Set<NotificationProvider> notificationProviders) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.content = content;
        this.extra = extra;
        this.priority = priority;
        this.createTime = createTime;
        this.creator = creator;
        this.updateTime = updateTime;
        this.updater = updater;
        this.status = status;
        this.app = app;
        this.notificationProviders = notificationProviders;
    }

    /** @return id. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            id.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 编码. */
    @Column(name = "CODE", length = 50)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            编码.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            名称.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return 内容. */
    @Column(name = "CONTENT", length = 65535)
    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            内容.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** @return 附加信息. */
    @Column(name = "EXTRA", length = 65535)
    public String getExtra() {
        return this.extra;
    }

    /**
     * @param extra
     *            附加信息.
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

    /** @return 优先级. */
    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     *            优先级.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** @return 创建时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            创建时间.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return 创建人. */
    @Column(name = "CREATOR", length = 64)
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param creator
     *            创建人.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /** @return 更新时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME", length = 26)
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @param updateTime
     *            更新时间.
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /** @return 更新人. */
    @Column(name = "UPDATER", length = 64)
    public String getUpdater() {
        return this.updater;
    }

    /**
     * @param updater
     *            更新人.
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /** @return 状态. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            状态.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return APP. */
    @Column(name = "APP", length = 50)
    public String getApp() {
        return this.app;
    }

    /**
     * @param app
     *            APP.
     */
    public void setApp(String app) {
        this.app = app;
    }

    /** @return . */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "NOTIFICATION_TEMPLATE_PROVIDER", joinColumns = { @JoinColumn(name = "TEMPLATE_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "PROVIDER_ID", nullable = false, updatable = false) })
    public Set<NotificationProvider> getNotificationProviders() {
        return this.notificationProviders;
    }

    /**
     * @param notificationProviders
     *            .
     */
    public void setNotificationProviders(
            Set<NotificationProvider> notificationProviders) {
        this.notificationProviders = notificationProviders;
    }
}
