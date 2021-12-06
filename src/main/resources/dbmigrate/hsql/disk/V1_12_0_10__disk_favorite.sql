

-------------------------------------------------------------------------------
--  disk favorite
-------------------------------------------------------------------------------
CREATE TABLE DISK_FAVORITE(
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
    CONSTRAINT PK_DISK_FAVORITE PRIMARY KEY(ID),
    CONSTRAINT FK_DISK_FAVORITE_INFO FOREIGN KEY(INFO_ID) REFERENCES DISK_INFO(ID)
);

COMMENT ON TABLE DISK_FAVORITE IS '收藏';
COMMENT ON COLUMN DISK_FAVORITE.ID IS 'id';
COMMENT ON COLUMN DISK_FAVORITE.NAME IS '名称';
COMMENT ON COLUMN DISK_FAVORITE.TYPE IS '类型';
COMMENT ON COLUMN DISK_FAVORITE.INFO_ID IS '节点id';
COMMENT ON COLUMN DISK_FAVORITE.CREATOR IS '创建人';
COMMENT ON COLUMN DISK_FAVORITE.CREATE_TIME IS '创建时间';
COMMENT ON COLUMN DISK_FAVORITE.UPDATER IS '更新人';
COMMENT ON COLUMN DISK_FAVORITE.UPDATE_TIME IS '更新时间';
COMMENT ON COLUMN DISK_FAVORITE.TENANT_ID IS '租户';

