

ALTER TABLE SENDMAIL_TEMPLATE ADD COLUMN CATALOG VARCHAR(50);
ALTER TABLE SENDMAIL_QUEUE ADD COLUMN CATALOG VARCHAR(50);
ALTER TABLE SENDMAIL_QUEUE ADD COLUMN BATCH VARCHAR(100);
ALTER TABLE SENDMAIL_HISTORY ADD COLUMN CATALOG VARCHAR(50);
ALTER TABLE SENDMAIL_HISTORY ADD COLUMN BATCH VARCHAR(100);

