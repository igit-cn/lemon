

ALTER TABLE CMS_ARTICLE ADD COLUMN SITE_ID BIGINT;
ALTER TABLE CMS_ARTICLE ADD FOREIGN KEY (SITE_ID) REFERENCES CMS_SITE(ID);

