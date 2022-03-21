###########################################################
# 문제

/*
	게시판 테이블 생성
	board_mst
		bm_code(pk, auto)
		bm_title(제목) not null
		bm_writer(작성자) nou null
		bm_count(조회수) 기본값 0
		create_date
		update_date
	
	board_dtl
		bd_code(pk, auto)
		bm_code 참조키
		bd_contents(내용) TEXT
		
	board_img
		bi_code(pk, auto)
		bm_code
		bi_img_url(사진파일 경로)
		create_date
		update_date
		
		*** 트리거X ***
		게시글 작성시 3개의 테이블에 동시에 데이터가 입력되야 한다
		
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
		
		
		
*/

INSERT INTO board_mst VALUES(0, '안녕하세요', '강짱', 0, NOW(), NOW());

















