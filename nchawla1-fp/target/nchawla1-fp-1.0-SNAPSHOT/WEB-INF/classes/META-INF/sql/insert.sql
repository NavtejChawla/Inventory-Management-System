insert ignore into sec_group(groupname, groupdesc) values('CUSTOMERS','This group contains customers.');
insert ignore into sec_group(groupname, groupdesc) values('OWNERS','This group contains owners.');

insert ignore into sec_user(username, password) values('customer',SHA2('password',256)); 
insert ignore into sec_user(username, password) values('owner1',SHA2 ('password',256)); 
insert ignore into sec_user(username, password) values('spyrison',SHA2 ('spyrison',256)); 

insert ignore into sec_user_groups(username, groupname) values('customer','CUSTOMERS');
insert ignore into sec_user_groups(username, groupname) values('owner1','OWNERS');

insert into storage(sno, name) values(1, 'NY');
insert into storage(sno, name) values(2, 'London');
insert into storage(sno, name) values(3, 'California');

insert into inventory(itemId, inventoryId, Quantity) values(1, 10, 10);
insert into inventory(itemId, inventoryId, Quantity) values(2, 11, 10);
insert into inventory(itemId, inventoryId, Quantity) values(3, 12, 10);

insert into items(itemNumber, itemDescription) values(1, 'Shoes');
insert into items(itemNumber, itemDescription) values(2, 'Shirt');
insert into items(itemNumber, itemDescription) values(3, 'Jeans');

insert into Customer(customerId, customerAddress, name, username) values (1,'Abc', 'Navtej', 'customer');
insert into Customer(customerId, customerAddress, name, username) values (2,'def', 'Mike', 'customer');
insert into Customer(customerId, customerAddress, name, username) values (3,'ghi', 'Rich', 'customer');