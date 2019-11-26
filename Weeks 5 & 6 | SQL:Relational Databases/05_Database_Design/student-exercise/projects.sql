START TRANSACTION; 

CREATE TABLE department(
        id   SERIAL      NOT NULL,
        department_name VARCHAR(72) NOT NULL, 
        CONSTRAINT pk_department_id PRIMARY KEY(id)
);

CREATE TABLE job_title (
        id              SERIAL      NOT NULL,
        job_title       VARCHAR(64) NOT NULL,
        department_id   INTEGER      NOT NULL,
        CONSTRAINT pk_job_title_id PRIMARY KEY(id),
        CONSTRAINT fk_department_id FOREIGN KEY(department_id) REFERENCES department(id)
); 

CREATE TABLE employee(
        id              SERIAL          NOT NULL,
        job_title_id    INTEGER         NOT NULL,
        date_of_hire    DATE            NOT NULL,
        CONSTRAINT pk_employee_id PRIMARY KEY(id),
        CONSTRAINT fk_job_title_id FOREIGN KEY(job_title_id) REFERENCES job_title(id)
);

CREATE TABLE employee_personal_information(
        employee_number SERIAL          NOT NULL, 
        employee_id     INTEGER         NOT NULL,
        first_name      VARCHAR(32)     NOT NULL,
        last_name       VARCHAR(64)     NOT NULL,
        gender          VARCHAR(16), 
        date_of_birth   DATE            NOT NULL,
        CONSTRAINT pk_employee_number PRIMARY KEY(employee_number),
        CONSTRAINT fk_employee_id FOREIGN KEY(employee_id) REFERENCES employee(id)
);


CREATE TABLE project (
        id              SERIAL          NOT NULL, 
        project_name    VARCHAR(72)     NOT NULL,
        start_date      DATE            NOT NULL,
        CONSTRAINT pk_project_id PRIMARY KEY(id)
        
); 

CREATE TABLE employees_assigned_to_projects(
        entry_id        SERIAL          NOT NULL,
        employee_id     INTEGER         NOT NULL,    
        project_id      INTEGER         NOT NULL,
        CONSTRAINT fk_employee_id FOREIGN KEY(employee_id) REFERENCES employee(id),
        CONSTRAINT fk_project_id FOREIGN KEY(project_id) REFERENCES project(id)
);

COMMIT; 


START TRANSACTION; 
-- Populate the tables with data for at least four projects, three departments, and eight employees.

INSERT INTO department(id, department_name)
        VALUES  (1, 'Management'),
                (2, 'Vocal'),
                (3, 'Instrumental'), 
                (4, 'Reasearch and Development');

INSERT INTO job_title(id, job_title, department_id)
        VALUES(1, 'Lead Singer', 2), 
                (2, 'Back-Up Vocals', 2),
                (3, 'Guitar Player/Dancer', 3),
                (4, 'Parent/Manager', 1),
                (5, 'Emotional Support Specialist', 1),
                (6, 'Lead Scientist/Younger Bro', 4); 

INSERT INTO employee(id, job_title_id, date_of_hire)
        VALUES  (1, 1, '2000-12-21'), 
                (2, 2, '2005-04-09'), 
                (3, 3, '2005-08-08'), 
                (4, 4, '2005-08-08'), 
                (5, 4, '2005-08-08'), 
                (6, 5, '2017-02-14'), 
                (7, 5, '2007-05-15'), 
                (8, 6, '2005-08-08');
                
INSERT INTO employee_personal_information(employee_number, employee_id, first_name, last_name, gender, date_of_birth)
        VALUES(1, 1, 'Nick', 'Jonas', 'male', '1992-09-16'),
                (2, 2, 'Joe', 'Jonas', 'male', '1989-08-15'),
                (3, 3, 'Kevin', 'Jonas', 'dude', '1987-05-11'),
                (4, 4, 'Paul', 'Jonas', 'male', '1965-02-13'),
                (5, 5, 'Denise', 'Jonas', 'female', '1966-07-12'),
                (6, 6, 'Sophie', 'Turner', 'Mx', '1996-02-21'),
                (7, 7, 'Danielle', 'Jonas', 'queen', '1989-09-18'),
                (8, 8, 'Frankie', 'Jonas', 'man', '2000-09-28');
                
INSERT INTO project (id, project_name, start_date) 
        VALUES (1, 'Become a Band', '2007-01-01'),
                (2, 'Breakup the Band', '2011-01-01'),
                (3, 'Solo Career Magic', '2013-01-01'),
                (4, 'Become a Band Again', '2019-01-01');
                
INSERT INTO employees_assigned_to_projects(entry_id, employee_id, project_id)
        VALUES (1, 1, 1), 
                (2, 2, 1),
                (3, 4, 1), 
                (4, 5, 1), 
                (5, 1, 2), 
                (6, 1, 3), 
                (7, 2, 3), 
                (8, 1, 4), 
                (9, 2, 4), 
                (10, 3, 4), 
                (11, 6, 4), 
                (12, 7, 4), 
                (13, 8, 4);
      
COMMIT; 

SELECT * FROM employee;
SELECT * FROM employee_personal_information; 
SELECT * FROM department; 
SELECT * FROM project; 
SELECT * FROM employees_assigned_to_projects; 

--Question:  Who broke up the Jonas Brothers??? 
SELECT project.project_name, employee_personal_information.first_name
FROM project 
JOIN employees_assigned_to_projects ON employees_assigned_to_projects.project_id = project.id
JOIN employee ON employee.id = employees_assigned_to_projects.employee_id
JOIN employee_personal_information ON employee_personal_information.employee_id = employee.id
WHERE project.project_name ILIKE '%break%';

--Answer: Nick!!!!!
