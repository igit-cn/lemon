package com.mossle.disk.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DiskMember 文件成员.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DISK_MEMBER")
public class DiskMember implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** 主键. */
    private Long id;

    /** 所属空间. */
    private DiskSpace diskSpace;

    /** 对应分享. */
    private DiskShare diskShare;

    /** 类型. */
    private String catalog;

    /** 分类. */
    private String type;

    /** 名称. */
    private String name;

    /** 掩码. */
    private Integer mask;

    /** 备注. */
    private String description;

    /** 成员. */
    private String userId;

    /** 创建人. */
    private String creator;

    /** 创建时间. */
    private Date createTime;

    /** 过期时间. */
    private Date expireTime;

    /** 状态. */
    private String status;

    /** 优先级. */
    private Integer priority;

    public DiskMember() {
    }

    public DiskMember(Long id) {
        this.id = id;
    }

    public DiskMember(Long id, DiskSpace diskSpace, DiskShare diskShare,
            String catalog, String type, String name, Integer mask,
            String description, String userId, String creator, Date createTime,
            Date expireTime, String status, Integer priority) {
        this.id = id;
        this.diskSpace = diskSpace;
        this.diskShare = diskShare;
        this.catalog = catalog;
        this.type = type;
        this.name = name;
        this.mask = mask;
        this.description = description;
        this.userId = userId;
        this.creator = creator;
        this.createTime = createTime;
        this.expireTime = expireTime;
        this.status = status;
        this.priority = priority;
    }

    /** @return 主键. */
    @Id
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            主键.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return 所属空间. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SPACE_ID")
    public DiskSpace getDiskSpace() {
        return this.diskSpace;
    }

    /**
     * @param diskSpace
     *            所属空间.
     */
    public void setDiskSpace(DiskSpace diskSpace) {
        this.diskSpace = diskSpace;
    }

    /** @return 对应分享. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHARE_ID")
    public DiskShare getDiskShare() {
        return this.diskShare;
    }

    /**
     * @param diskShare
     *            对应分享.
     */
    public void setDiskShare(DiskShare diskShare) {
        this.diskShare = diskShare;
    }

    /** @return 类型. */
    @Column(name = "CATALOG", length = 50)
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @param catalog
     *            类型.
     */
    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    /** @return 分类. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            分类.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return 名称. */
    @Column(name = "NAME", length = 200)
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

    /** @return 掩码. */
    @Column(name = "MASK")
    public Integer getMask() {
        return this.mask;
    }

    /**
     * @param mask
     *            掩码.
     */
    public void setMask(Integer mask) {
        this.mask = mask;
    }

    /** @return 备注. */
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            备注.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return 成员. */
    @Column(name = "USER_ID", length = 64)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            成员.
     */
    public void setUserId(String userId) {
        this.userId = userId;
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

    /** @return 过期时间. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EXPIRE_TIME", length = 26)
    public Date getExpireTime() {
        return this.expireTime;
    }

    /**
     * @param expireTime
     *            过期时间.
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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
}
