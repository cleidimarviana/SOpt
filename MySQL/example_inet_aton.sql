-- create table
create table ip_addresses(id integer, ip_address varchar(100));


-- insert itens in table
insert into ip_addresses(id, ip_address) values(1, "192.168.0.1");

insert into ip_addresses(id, ip_address) values(2, "192.168.0.11");

insert into ip_addresses(id, ip_address) values(3, "192.168.0.112");

insert into ip_addresses(id, ip_address) values(4, "192.168.0.3");



-- select using inet_aton
SELECT * FROM ip_addresses ORDER BY INET_ATON(ip_address);
