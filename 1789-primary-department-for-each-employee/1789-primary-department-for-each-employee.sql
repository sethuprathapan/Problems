select  employee_id,department_id


from Employee where  employee_id in (select employee_id from Employee group by employee_id having count(department_id )=1)
OR primary_flag='Y'
group by employee_id

