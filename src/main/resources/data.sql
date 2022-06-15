DROP TABLE IF EXISTS employee;
  
CREATE TABLE employee (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  gender VARCHAR(250) NOT NULL,
  age INT,
  salary INT
   
);
  
INSERT INTO employee (name,gender,age,salary) VALUES('James', 'Male', 23, 45000);
INSERT INTO employee (name,gender,age,salary) VALUES('Saaya', 'Female', 21, 52000);