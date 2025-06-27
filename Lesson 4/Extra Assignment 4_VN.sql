use adventureworks;

-- Exercise 1: Subquery

-- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'.
select 
	p.productid, 
	p.name 
from 
	product p 
inner join 
	productsubcategory ps on p.ProductSubcategoryID = ps.ProductSubcategoryID
where ps.name in (
	select name 
    from productsubcategory 
    where name = 'Saddles'
);

-- Question 2: Thay đổi câu Query 1 để lấy được kết quả sau.
select
	p.productid, 
	p.name 
from 
	product p 
inner join 
	productsubcategory ps on p.ProductSubcategoryID = ps.ProductSubcategoryID
where ps.name in (
	select name
    from productsubcategory
    where name like 'Bo%'
);

-- Question 3: Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring Bike (nghĩa là ProductSubcategoryID = 3)
select 
	* 
from 
	product 
where ListPrice = (
	select min(ListPrice) 
    from product 
    where ProductSubcategoryID = 3
);

-- Exercise 2: JOIN nhiều bảng

-- Question 1: Viết query lấy danh sách tên country và province được lưu trong AdventureWorks2008sample database.
SELECT 
    sp.StateProvinceID as STT, cr.CountryRegionCode AS `Country`, cr.name as `Countryname`, sp.name AS `Province`
FROM
    stateprovince sp
INNER JOIN
    countryregion cr on sp.CountryRegionCode = cr.CountryRegionCode
ORDER BY 
	sp.StateProvinceID asc;

-- Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada

SELECT 
    sp.StateProvinceID AS STT,
    cr.CountryRegionCode AS `Country`,
    cr.name AS `Countryname`,
    sp.name AS `Province`
FROM
    stateprovince sp
INNER JOIN
    countryregion cr ON sp.CountryRegionCode = cr.CountryRegionCode
WHERE
    cr.name = 'Canada' OR cr.name = 'Germany'
ORDER BY 
	sp.StateProvinceID ASC;
    
-- Question 3:
select 
	so.salesorderid, 
	date(so.orderdate) as orderdate, 
	sp.salespersonid, 
	sp.salespersonid as businessentityid, 
	sp.bonus, 
	sp.salesytd
from 
	salesperson sp 
inner join 
	salesorderheader so on sp.salespersonid = so.salespersonid;

-- -- Question 4:
select 
	so.salesorderid, 
	date(so.orderdate) as orderdate, 
	e.title as jobttitle, 
	sp.bonus, 
	sp.salesytd
from 
	salesperson sp 
join 
	salesorderheader so on sp.salespersonid = so.salespersonid
join 
	employee e on sp.salespersonid = e.employeeid;