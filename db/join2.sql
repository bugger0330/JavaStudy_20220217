
#로그인
SELECT 
*
FROM
	user_mst 
WHERE
	username = 'apple' AND PASSWORD = '12341234';	
###########################################################	
SELECT 
	COUNT(um.username) + COUNT(um2.password) AS flag #아이디 비번 둘다 존재하면 2가 출력
FROM
	user_mst um
	LEFT OUTER JOIN user_mst um2 ON(um2.um_code = um.um_code AND um2.password = '12341234')
WHERE
	um.username = 'apple'
#패스워드가 틀렸지만 LEFT OUTER JOIN 이니까 왼쪽 테이블은 출력된다
	;
		


























	
	
	
	
	
	
	
	