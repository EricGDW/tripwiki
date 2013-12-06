CREATE TABLE tw_user  
(  
    id      VARCHAR(10)  NOT NULL,  
    pwd     VARCHAR(10) NOT NULL,  
    name    VARCHAR(15) NOT NULL,  
    birthday VARCHAR(8) NOT NULL,  
    salary   NUMERIC(10,2),
    PRIMARY KEY (id)
);