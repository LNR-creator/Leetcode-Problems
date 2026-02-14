# Write your MySQL query statement below
select a.id
from Weather a
join Weather b
on DateDiff(a.recordDate,b.recordDate) = 1
where a.temperature > b.temperature;