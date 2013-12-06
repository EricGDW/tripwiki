CREATE TABLE tw_menu
(  
    id      		smallint(6)  	NOT NULL,  
    name    		VARCHAR(20) 	NOT NULL,  
    parentid    	smallint(6)		NOT NULL,
    link			VARCHAR(1024)	NOT NULL,
    type			VARCHAR(16) 	NOT NULL, 
    listorder		smallint(6)		NOT NULL,	
   	disabled		tinyint(1)		NOT NULL,
    PRIMARY KEY (id)
);