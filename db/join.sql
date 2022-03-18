# <조인>
#LEFT OUTER JOIN == 왼쪽을 기준으로 조인한다는 뜻
/*
	user_mst um
	LEFT OUTER JOIN 
	user_dtl ud ON(ud.um_code = um.um_code) 조건은 항상 뒤에꺼를 기준으로 해서 만듬 on(ud = um)// on(um = ud)도 같은 값은 출력되지만 잘못됨
	
on() == 참 거짓을 말함
*/






SELECT * FROM
	countries c	LEFT OUTER join regions r ON(r.region_id = c.region_id)
	#LEFT OUTER join == 왼쪽을 기준으로 테이블을 합한다
	LEFT OUTER JOIN continents ct ON(ct.continent_id = r.region_id)
;
##################################################
SELECT
	*
FROM
	user_mst um
	LEFT OUTER JOIN user_dtl ud ON(0=0) # ON(0=0)은 boolean 참 거짓을 말한다, 0=0=>참
;

SELECT
	*
FROM
	user_mst um
	LEFT OUTER JOIN user_dtl ud ON(ud.um_code = um.um_code)
;

SELECT * FROM user_dtl WHERE um_code = 100; # ON(ud.um_code = 100)과 같다

#########################

SELECT * FROM 
	product_mst pm
	INNER join category_mst cm ON(cm.ctg_code = pm.ctg_code);
	#inner JOIN은 조인한 두 테이블에서 공통된 것만 출력

SELECT * FROM
	product_mst pm
	LEFT OUTER JOIN category_mst cm ON(cm.ctg_code = pm.ctg_code)
WHERE
	#pm.pdm_name LIKE '%텀블러'	
	cm.ctg_code = 1
ORDER BY
	pm.pdm_code desc
;









