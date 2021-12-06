

-------------------------------------------------------------------------------
--  disk download
-------------------------------------------------------------------------------
CREATE TABLE DISK_DOWNLOAD(
    ID BIGINT NOT NULL,
    NAME VARCHAR(50),
    TYPE VARCHAR(50),

    INFO_ID BIGINT,

    START_TIME TIMESTAMP,
    END_TIME TIMESTAMP,

	CREATOR VARCHAR(64),
	CREATE_TIME DATETIME,
	UPDATER VARCHAR(64),
	UPDATE_TIME DATETIME,
	STATUS VARCHAR(50),
    TENANT_ID VARCHAR(64),
    CONSTRAINT PK_DISK_DOWNLOAD PRIMARY KEY(ID),
    CONSTRAINT FK_DISK_DOWNLOAD_INFO FOREIGN KEY(INFO_ID) REFERENCES DISK_INFO(ID)
);

COMMENT ON TABLE DISK_DOWNLOAD IS '下载';
COMMENT ON COLUMN DISK_DOWNLOAD.ID IS 'id';
COMMENT ON COLUMN DISK_DOWNLOAD.NAME IS '名称';
COMMENT ON COLUMN DISK_DOWNLOAD.TYPE IS '类型';
COMMENT ON COLUMN DISK_DOWNLOAD.INFO_ID IS '节点id';
COMMENT ON COLUMN DISK_DOWNLOAD.CREATOR IS '创建人';
COMMENT ON COLUMN DISK_DOWNLOAD.CREATE_TIME IS '创建时间';
COMMENT ON COLUMN DISK_DOWNLOAD.UPDATER IS '更新人';
COMMENT ON COLUMN DISK_DOWNLOAD.UPDATE_TIME IS '更新时间';
COMMENT ON COLUMN DISK_DOWNLOAD.TENANT_ID IS '租户';
COMMENT ON COLUMN DISK_DOWNLOAD.START_TIME IS '开始时间';
COMMENT ON COLUMN DISK_DOWNLOAD.END_TIME IS '结束时间';

