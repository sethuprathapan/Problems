with c as (select 
reports_to as employee_id  , count(reports_to) as reports_count ,round(avg(age))  as average_age 
from Employees 
where reports_to is not null 
group by reports_to) 


select c.employee_id,t.name,c.reports_count,c.average_age 
from c left join Employees t
on  c.employee_id = t.employee_id 
order by employee_id