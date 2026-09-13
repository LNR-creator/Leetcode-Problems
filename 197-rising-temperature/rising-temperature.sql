# Write your MySQL query statement below

Select a.id from Weather a
Join Weather b
on DateDiff(a.recordDate,b.recordDate) = 1
where 
a.temperature > b.temperature;
