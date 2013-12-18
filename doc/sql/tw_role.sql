CREATE TABLE tw_role
(  
    id      		tinyint(5)  	NOT NULL,  
    name    		VARCHAR(50) 	NOT NULL,  
    description    	text,  	
   	disabled		tinyint(1)		NOT NULL,
    PRIMARY KEY (id)
);