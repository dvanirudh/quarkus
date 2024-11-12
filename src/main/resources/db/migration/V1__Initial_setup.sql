CREATE TABLE IF NOT EXISTS Employee (
    empId INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    hireDate DATE,
    role VARCHAR(255),
    department VARCHAR(255),
    salary DECIMAL(10, 2)
);

INSERT INTO Employee (name, hireDate, role, department, salary) VALUES
('Tony Stark', '2023-06-30', 'Manager', 'Sales', 95000.00),
('Harry Potter', '2024-03-22', 'Designer', 'Marketing', 65000.00),
('Klouse Nikol', '2019-10-05', 'Head', 'Research', 750000.00),
('John Wick', '2010-01-15', 'Developer', 'Engineering', 10000.00),
('Michael', '2022-11-10', 'Analyst', 'Finance', 80000.00);
