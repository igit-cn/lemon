

ALTER TABLE DISK_INFO ADD COLUMN SPACE_ID BIGINT;
ALTER TABLE DISK_INFO ADD CONSTRAINT FK_DISK_INFO_SPACE FOREIGN KEY(SPACE_ID) REFERENCES DISK_SPACE(ID);



