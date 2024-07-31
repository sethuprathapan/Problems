# Write your MySQL query statement below
with tabl as (select turn,person_id,person_name, sum(weight) over (order by turn asc) as cumilative_weight
from Queue )

select person_name from tabl where cumilative_weight=(select max(cumilative_weight) from tabl where cumilative_weight<=1000 ) 
