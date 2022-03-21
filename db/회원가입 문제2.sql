/*
	*게시글 작성
		제목 : 데이터 베이스 수업
		내용 :
			데이터베이스 CRUD 실습
			create(insert)
			read(select)
			update(update)
			delete(delete)
			
		이미지 : 
		create예제 캡쳐1.png 
		read예제 캡쳐1.png
		update예제 캡쳐1.png
		delete예제 캡쳐1.png
		
		insert에 트리거는 쓰지 않고 만들기
*/

INSERT INTO board_mst VALUES(0, '데이터 베이스 수업', '강민', 10, NOW(), NOW());

/*
트리거 없이 만들때 사용
만약 bm_code가 null일 경우 1로 바꿔라 - 최신글을 참조하기 위해
	SELECT 
		ifnull(MAX(bm_code), 1) AS bm_code 
	FROM board_mst;
*/

INSERT INTO board_dtl VALUES(0, 
			(SELECT 
			IFNULL(MAX(bm_code), 1) AS bm_code 
			FROM board_mst), 
			'데이터베이스 CRUD 실습
			create(insert)
			read(select)
			update(update)
			delete(delete)',
			NOW(),
			NOW()
			);

INSERT INTO board_img VALUES
	(0, (SELECT 
			IFNULL(MAX(bm_code), 1) AS bm_code 
			FROM board_mst), 'create예제 캡쳐1.png', NOW(), NOW()),
	(0, (SELECT 
			IFNULL(MAX(bm_code), 1) AS bm_code 
			FROM board_mst), 'read예제 캡쳐1.png', NOW(), NOW()),
	(0, (SELECT 
			IFNULL(MAX(bm_code), 1) AS bm_code 
			FROM board_mst), 'update예제 캡쳐1.png', NOW(), NOW()),
	(0, (SELECT 
			IFNULL(MAX(bm_code), 1) AS bm_code 
			FROM board_mst), 'delete예제 캡쳐1.png', NOW(), NOW());

#######################################################################
# 3개 테이블 조인
SELECT bm.bm_code, 
		bm.bm_title AS 제목, 
		bd.bd_contents AS 내용, 
		bm.bm_writer AS 작성자, 
		bi.bi_img_url AS 이미지,
		bm.bm_count AS 조회수 
FROM board_mst bm 
LEFT OUTER JOIN board_dtl bd ON(bd.bm_code = bm.bm_code) 
LEFT OUTER JOIN board_img bi ON(bi.bm_code = bm.bm_code)
WHERE bm.bm_code = 1;

#######################################################################
# 게시글 수정
/*
	해당 게시글 내용 수정
		기존글에서 맨 밑에 내용을 추가
			'DML 실습'
	
*/


UPDATE board_dtl 
SET bd_contents = concat(bd_contents, '\n', 'DML 실습')
WHERE bm_code = 1;

UPDATE board_img
SET bi_img_url = REPLACE(bi_img_url, '1', '2')
WHERE bm_code = 1;


