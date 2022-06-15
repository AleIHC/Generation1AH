select c.customerNumber , o.orderNumber, c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber
and c.customerNumber  = 496
order by c.orderNumber desc;


--inner JOIN
select c.customerNumber, o.orderNumber, c.customerName
from customers c 
inner join orders o 
on c.customerNumber = o.customerNumber
and c.customerNumber  = 496
order by o.orderNumber asc ;


