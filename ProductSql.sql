create database Ecommerce;
use Ecommerce;

create table Productcategory(categoryid bigint primary key, categoryname varchar(255));
insert into productcategory values(1,"Mobiles"),(2,"Electronics"),(3,"accessories");


create table Product(id bigint primary key,sku varchar(255),name varchar(255),description varchar(255),unitprice decimal(13,2),imageurl varchar(255),
					active bit(1),unitsinstock int,datecreated datetime(6),lastupdated datetime(6),categoryid bigint,
                    foreign key(categoryid) references Productcategory(categoryid));
                    
insert into Product values (100,"123","Redmi9","Xiomi product",19980.99,"",b'0',20,"2021-10-19","2022-01-17",1);

insert into Product values (101,"234","Aiwa","Aiwa product",17880.99,"",b'0',10,"2021-12-11","2022-04-14",2);

insert into Product values (102,"345","EarBuds","Realme product",1998.99,"",b'0',15,"2022-02-19","2022-02-12",3);

select * from Product;
							 --   C:\Users\localadmin\Documents\workspace\ThymeLeaf_Jpa_Project\src\main\resources\templates\images\charger.jpg -- 
update Product set imageurl  ="https://rukminim1.flixcart.com/image/612/612/l1v1uvk0/air-cooler/8/y/p/-original-imagdcf5yy6gbchg.jpeg?q=70" where id =106;
