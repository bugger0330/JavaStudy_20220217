#회원가입

/*
	회원이름 : kang1
	비밀번호 : 1234
	이름 : 강민
	이메일 : aaa@ggg.com
*/
INSERT INTO user_mst VALUES(0, 'kang1', '1234', '강민', 'aaa@ggg.com', NOW(), NOW());

# 회원가입시 user_dtl의 um_code도 동시에  입력되야 한다
# user_mst 테이블에서 오른쪽 마우스- 새로생성-트리거
# 이벤트 BEFORE/AFTER , insert등등
# 뜻은 user_mst에서 insert등등을 실행한 전/후에~ 라는 뜻
/*
	BEGIN
	INSERT INTO user_dtl VALUES(0, NEW.um_code, NULL, NULL, NULL, NOW(), NOW());
	END
	입력 후 밑에 저장 눌러야함
*/

###########################################################
# 로그인

/*
	username : kang1
	password : 1234

*/
SELECT COUNT(um.username) + COUNT(um2.password) AS  로그인 
FROM user_mst um 
LEFT OUTER JOIN user_mst um2 on(um2.um_code = um.um_code AND um2.password = '1234')
WHERE um.username = 'kang1';

#로그인 성공 후 유저 정보 다 들고오기
SELECT um.um_code, ud.ud_code, 
	um.username, um.password, um.name, um.email, ud.ud_profile_img_url, ud.ud_introduction, ud.ud_phone 
FROM user_mst um
INNER JOIN user_dtl ud ON(ud.um_code = um.um_code)
WHERE um.username = 'kang1';

###########################################################
# 프로필 수정

#비밀번호 수정
UPDATE user_mst
SET PASSWORD = '2222'
WHERE username = 'kang1'; #유저 아이디가 kang1 인 데이터의 비밀번호를 2222로 바꾸어라
#where를 안주면 모든 데이터의 비밀번호가 바뀐다, 유일한 값을 조건으로 걸어야 한다

#프로필 수정
UPDATE user_dtl
SET ud_profile_img_url = '기본프로필.png',
	 ud_phone = '010-1111-2222'
WHERE um_code = (SELECT um_code FROM user_mst WHERE username = 'kang1'); # 서브 쿼리문

###########################################################
#회원 탈퇴

#delete는 컬럼 1개를 지우는게 아니라, 한줄 통쨰로 지운다
DELETE FROM user_mst
WHERE username = 'kang1';

/*
	지우기 전에 user_mst에서 트리거를 하나 더 만들어야 한다
	BEGIN
	DELETE FROM user_dtl
	WHERE um_code = OLD.um_code;
	END 
			user_mst가 삭제를 실행하기 전에 user_dtl을 먼저 지워야 한다(before  delete)
*/













































































































































