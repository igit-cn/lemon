

ALTER TABLE TICKET_INFO ADD COLUMN PRIORITY INT;
ALTER TABLE TICKET_INFO ADD COLUMN SOURCE VARCHAR(50);
ALTER TABLE TICKET_INFO ADD COLUMN RESOLVE_TIME TIMESTAMP;
ALTER TABLE TICKET_INFO ADD COLUMN RESOLVE_STATUS VARCHAR(50);
ALTER TABLE TICKET_INFO ADD COLUMN CLOSE_TIME TIMESTAMP;
ALTER TABLE TICKET_INFO ADD COLUMN CLOSE_STATUS VARCHAR(50);







