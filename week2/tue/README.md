# Assignment: PostgreSQL Aggregate Functions And Group By

<br>

### DDL Script

```roomsql
DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
	id int NOT NULL,
	firstname varchar NOT NULL,
	lastname varchar NOT NULL,
	email varchar NOT NULL,
	phone_number varchar NOT NULL,
	hire_date varchar NOT NULL,
	job_id varchar NOT NULL,
	salary numeric(7, 2) NOT NULL,
	commission_pct numeric(3, 2) NOT NULL,
	manager_id int NOT NULL,
	department_id int NOT NULL,
	
	CONSTRAINT pk_employee_id
	    PRIMARY KEY (id)
);
```

### DML Script

```roomsql
INSERT INTO employees VALUES
(100, 'Steven', 'King', 'SKING', '5151234567', '1987-06-17', 'AD_PRES', 24000.00, 0.00, 0, 90),
(101, 'Nenna', 'Kochhar', 'NKOCHHAR', '5151234568', '1987-06-18', 'AD_VP', 17000.00, 0.00, 100, 90),
(102, 'Lex', 'De Haan', 'LDEHAAN', '5151234569', '1987-06-19', 'AD_VP', 17000.00, 0.00, 100, 60),
(103, 'Alexander', 'Hunold', 'AHUNOLD', '5901234567', '1987-06-20', 'IT_PROG', 9000.00, 0.00, 102, 60),
(104, 'Bruce', 'Ernst', 'BERNST', '5901234568', '1987-06-21', 'IT_PROG', 6000.00, 0.00, 103, 60),
(105, 'David', 'Austin', 'DAUSTIN', '5901234569', '1987-06-22', 'IT_PROG', 4800.00, 0.00, 103, 60),
(106, 'Valli', 'Pataballa', 'VPATABALLA', '5901234560', '1987-06-23', 'IT_PROG', 4800.00, 0.00, 103, 60),
(107, 'Diana', 'Lorentz', 'DLORENTZ', '3031234567', '1987-06-24', 'IT_PROG', 4200.00, 0.00, 103, 100),
(108, 'Nancy', 'Greenberg', 'NGREENBERGE', '3031234568', '1987-06-25', 'FI_MGR', 12000.00, 0.00, 101, 100),
(109, 'Daniel', 'Faviet', 'DFAVIET', '3031234569', '1987-06-26', 'FI_ACCOUNT', 9000.00, 0.00, 108, 100);		
```

## Exercise

1. Write a query to find the number of jobs available in the employees table.
2. Write a query to get the total salaries payable to employees.
3. Write a query to get the minimum salary from employees table.
4. Write a query to get the maximum salary of an employee working as a Programmer.
5. Write a query to get the average salary and number of employees working in the department which ID is 90.
6. Write a query to get the highest, lowest, total, and average salary of all employees.
7. Write a query to get the number of employees working in each post.
8. Write a query to get the difference between the highest and lowest salaries.
9. Write a query to find the manager ID and the salary of the lowest-paid employee under that manager.
10. Write a query to get the department ID and the total salary payable in each department.