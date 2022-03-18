#<select>

#전체 조회
SELECT
	um_code,
	username,
	PASSWORD,
	NAME,
	email,
	create_date,
	update_date
FROM
	user_mst;

##################################
#전체 조회, 모든 칼럼을 선택할땐 *
SELECT
	*
FROM
	user_mst;

##################################
#조회 조건(where) - 이름이 '강민' 인 데이터만 조회
SELECT
	*
FROM
	user_mst
WHERE
	NAME = '강민';
#############
SELECT
	*
FROM
	user_mst
WHERE
	NAME = '강민' AND email = 'aaa@ddd.com'
	;
##################################
#조회 조건(like)
SELECT
	*
FROM
	USER_mst
WHERE
	email LIKE '%ddd%' or NAME LIKE ' 강%'; 
#이메일에 ddd 가 포함된 모든 이메일을 검색(앞뒤 %는 의미 없다)

##################################
# 그룹(group by)
SELECT
	NAME,
	COUNT(NAME)
FROM
	user_mst
GROUP BY
	NAME;
################ nation.sql 불러옴 ##################
SELECT 
	region_id,
	COUNT(region_id)
FROM countries
GROUP BY
	region_id
;

##################################
#정렬(order by) - desc는 역순 정렬
SELECT
	*
FROM countries
ORDER BY
	region_id,
	AREA DESC
	LIMIT 1
;
#전체 응용
SELECT
	country_id,
	NAME,
	AREA,
	region_id
FROM
	countries
WHERE
	region_id IN (2, 8) # region_id = 2 or region_id = 8 
ORDER BY
	region_id,
	AREA DESC;






































