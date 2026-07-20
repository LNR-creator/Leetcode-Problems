# Write your MySQL query statement below

Select employee_id 
from Employees e
left join 
Salaries s using(employee_id)
where s.salary is null

union

Select employee_id
from Salaries s 
left join 
Employees e using(employee_id)
where e.name is null

order by employee_id;