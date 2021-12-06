

-------------------------------------------------------------------------------
--  disk recent
-------------------------------------------------------------------------------
CREATE TABLE DISK_RECENT(
    ID BIGINT NOT NULL,
    NAME VARCHAR(200),
    TYPE VARCHAR(50),
    INFO_ID BIGINT,

	CREATOR VARCHAR(64),
	CREATE_TIME DATETIME,
	UPDATER VARCHAR(64),
	UPDATE_TIME DATETIME,
	STATUS VARCHAR(50),
    TENANT_ID VARCHAR(64),
    CONSTRAINT PK_DISK_RECENT PRIMARY KEY(ID),
    CONSTRAINT FK_DISK_RECENT_INFO FOREIGN KEY(INFO_ID) REFERENCES DISK_INFO(ID)
);

COMMENT ON TABLE DISK_RECENT IS '标签';
COMMENT ON COLUMN DISK_RECENT.ID IS 'id';
COMMENT ON COLUMN DISK_RECENT.NAME IS '名称';
COMMENT ON COLUMN DISK_RECENT.TYPE IS '类型';
COMMENT ON COLUMN DISK_RECENT.INFO_ID IS '节点id';
COMMENT ON COLUMN DISK_RECENT.CREATOR IS '创建人';
COMMENT ON COLUMN DISK_RECENT.CREATE_TIME IS '创建时间';
COMMENT ON COLUMN DISK_RECENT.UPDATER IS '更新人';
COMMENT ON COLUMN DISK_RECENT.UPDATE_TIME IS '更新时间';
COMMENT ON COLUMN DISK_RECENT.TENANT_ID IS '租户';

