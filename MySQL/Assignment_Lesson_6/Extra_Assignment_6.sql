create database project_management;
use project_management;

create table projects(
	  project_id int auto_increment primary key,
      manager_id int not null unique key,
      project_name varchar(50) not null,
      project_start_date date not null,
      project_description text,
      project_detail varchar(50),
      project_completed_on date not null,
      foreign key(manager_id) references employee(employee_id)
);

create table employee(
      employee_id int auto_increment primary key,
      employee_last_name varchar(30) not null,
      employee_first_name varchar(30) not null,
      employee_hire_date date not null,
      employee_status varchar(30),
      supervisor_id int not null,
      social_security_number int,
      foreign key(supervisor_id) references employee(employee_id)
);

create table project_modules(
      module_id int auto_increment primary key,
      project_id int not null,
      employee_id int not null unique key,
      project_modules_date date not null,
      project_modules_completed_on date not null,
      project_modules_description text,
      foreign key(project_id) references projects(project_id),
      foreign key(employee_id) references employee(employee_id)
);

create table work_done(
      work_done_id int auto_increment primary key,
      employee_id int not null,
      module_id int not null,
      work_done_date date not null,
      work_done_description text,
      work_done_status varchar(30),
      foreign key(employee_id) references employee(employee_id),
      foreign key(module_id) references project_modules(module_id)
);

-- exercise 1 :
delimiter //
create trigger invalid_information
before insert on project_modules
for each row
begin
     declare project_start date;
     select project_start_date into project_start
     from projects  
     where project_id = new.project_id;
     if (new.project_modules_date < project_start) then
        signal sqlstate '45000'
        set message_text = 'Error !';
	 end if;
end //
delimiter ;

-- exercise 2 :
use freshers;
create view students_pass_the_tests as
      select *
      from trainee
      where ET_IQ + ET_Gmath >= 20
      and ET_IQ >= 8
      and ET_Gmath >= 8
      and ET_English >= 18;