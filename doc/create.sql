CREATE TABLE WP_CACHE_STORE (
     CACHE_KEY      VARCHAR2(2000),
     OBJECT_TYPE    CHAR(1),
     CACHE_OBJECT   BLOB,
     CONSTRAINT WP_CACHE_STORE_PK PRIMARY KEY (CACHE_KEY, OBJECT_TYPE)
 );
 
CREATE TABLE WP_STATE_STORE (
     STATE_KEY    VARCHAR2(2000),
     STATE  BLOB,
     CONSTRAINT WP_STATE_STORE_PK PRIMARY KEY (STATE_KEY)
 );