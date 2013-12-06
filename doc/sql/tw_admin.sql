CREATE TABLE tw_admin 
(  
    id      		VARCHAR(10)  	NOT NULL,  
    username    	VARCHAR(20) 	NOT NULL,  
    password    	VARCHAR(32) 	NOT NULL,  
    email 			VARCHAR(40) 	NOT NULL,  
    lastlogintime   int(10),
    lastloginip		VARCHAR(15),
    roleid			smallint(5),
    PRIMARY KEY (id)
);