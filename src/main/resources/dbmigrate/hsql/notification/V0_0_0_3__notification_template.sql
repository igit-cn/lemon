

-------------------------------------------------------------------------------
--  notification template
-------------------------------------------------------------------------------
CREATE TABLE NOTIFICATION_TEMPLATE(
    ID BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL,
    CODE VARCHAR(50),
    NAME VARCHAR(50),
    CONTENT VARCHAR(65535),
    EXTRA VARCHAR(65535),

    PRIORITY INT,
    CREATE_TIME TIMESTAMP,
    CREATOR VARCHAR(64),
    UPDATE_TIME TIMESTAMP,
    UPDATER VARCHAR(64),
    STATUS VARCHAR(50),

    APP VARCHAR(50),

    CONSTRAINT PK_NOTIFICATION_TEMPLATE PRIMARY KEY(ID)
);

COMMENT ON TABLE NOTIFICATION_TEMPLATE IS '通知模板';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.ID IS 'id';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.CODE IS '编码';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.NAME IS '名称';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.CONTENT IS '内容';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.EXTRA IS '附加信息';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.PRIORITY IS '优先级';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.CREATE_TIME IS '创建时间';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.CREATOR IS '创建人';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.UPDATE_TIME IS '更新时间';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.UPDATER IS '更新人';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.STATUS IS '状态';
COMMENT ON COLUMN NOTIFICATION_TEMPLATE.APP IS 'APP';

