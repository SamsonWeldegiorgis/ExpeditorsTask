
create table expeditors(
                           IdNum Integer primary key,
                           FirstName varchar(20) not null ,
                           LastName varchar(20) not null ,
                           Street varchar(50) not null ,
                           City varchar(20) not null ,
                           State varchar(20) not null ,
                           Age int
);

insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age) values (1,'Dave','Smith','123 main st.','seattle','wa',43);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age) values (2,'Alice','Smith','123 Main St.','Seattle','WA',45);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age) values (3,'Bob','Williams','234 2nd Ave.','Tacoma','WA',26);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age)  values (4,'Frank','Jones','123 main st.','seattle','wa',43);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age)  values (5,'Carol','Johnson','234 2nd Ave','Seattle','WA',67);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age) values (6,'Eve', 'Smith','234 2nd Ave.','Tacoma','WA',25);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age) values (7,'George','Brown','345 3rd Blvd.Apt.200','Seattle','WA',18);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age)values (8,'Helen',  'Brown','345 3rd Blvd.Apt. 200','Seattle','WA',18);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age) values (9,'Ian', 'Smith','123 main st ','Seattle','Wa',18);
insert into expeditors (IdNum, FirstName, LastName,Street, City, State, Age)values (10,'Jane', 'Smith','123 Main St.','Seattle','WA',13);


-- Print all
select * from expeditors;
-- Print last name Smith
select * from expeditors where LastName = 'Smith';
-- Print all > age 18 years
SELECT * from  expeditors where Age >18;
-- Print size of age of 18 years old
select count(*) from expeditors where Age =18;
-- Print all age of 18 years old
select * from expeditors where Age =18;
-- Print all street that starts with 123
select * from expeditors where  Street like '123%';
-- Print all stree that contains 2nd
select * from expeditors where  Street like '%2nd%';
-- Print all city that says Tacoma
select * from expeditors where  City = 'Tacoma';