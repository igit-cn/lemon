

-------------------------------------------------------------------------------
--  disk log
-------------------------------------------------------------------------------
CREATE TABLE DISK_LOG(
    ID BIGINT NOT NULL,
    NAME VARCHAR(200),
    DESCRIPTION VARCHAR(255),

    TYPE VARCHAR(50),
    SOURCE_ID BIGINT,
    PARENT_ID BIGINT,
    SPACE_ID BIGINT,

    CATALOG VARCHAR(50),
    OLD_VALUE VARCHAR(200),
    NEW_VALUE VARCHAR(200),

    CREATOR VARCHAR(64),
    CREATE_TIME DATETIME,
    UPDATER VARCHAR(64),
    UPDATE_TIME DATETIME,

    STATUS VARCHAR(50),
    REF_TYPE VARCHAR(50),
    REF_VALUE VARCHAR(200),

    CONSTRAINT PK_DISK_LOG PRIMARY KEY(ID)
);

COMMENT ON TABLE DISK_LOG IS '文件日志';
COMMENT ON COLUMN DISK_LOG.ID IS '主键';
COMMENT ON COLUMN DISK_LOG.NAME IS '名称';
COMMENT ON COLUMN DISK_LOG.DESCRIPTION IS '备注';
COMMENT ON COLUMN DISK_LOG.TYPE IS '类型';
COMMENT ON COLUMN DISK_LOG.SOURCE_ID IS '文件或文件夹';
COMMENT ON COLUMN DISK_LOG.PARENT_ID IS '上级文件夹';
COMMENT ON COLUMN DISK_LOG.SPACE_ID IS '空间';
COMMENT ON COLUMN DISK_LOG.CATALOG IS '分类';
COMMENT ON COLUMN DISK_LOG.OLD_VALUE IS '旧值';
COMMENT ON COLUMN DISK_LOG.NEW_VALUE IS '新值';
COMMENT ON COLUMN DISK_LOG.CREATOR IS '创建人';
COMMENT ON COLUMN DISK_LOG.CREATE_TIME IS '创建时间';
COMMENT ON COLUMN DISK_LOG.UPDATER IS '更新人';
COMMENT ON COLUMN DISK_LOG.UPDATE_TIME IS '更新时间';
COMMENT ON COLUMN DISK_LOG.STATUS IS '状态';
COMMENT ON COLUMN DISK_LOG.REF_TYPE IS '引用类型';
COMMENT ON COLUMN DISK_LOG.REF_VALUE IS '引用值';

