#<insert>
INSERT 
INTO
	USER_mst(
		um_code, 
		username, 
		PASSWORD, 
		NAME, 
		email, 
		create_date, 
		update_date
	)
VALUES
	(
		0,
		'kang1',
		'1234',
		'강민',
		'aaa@bbb.com',
		NOW(),
		NOW()
	)
;
		
INSERT 
INTO
	USER_mst
VALUES
	(
		0,
		'kang2',
		'2222',
		'강민2',
		'aaa@bbb.com',
		NOW(),
		NOW()
	)
;		
		
INSERT
INTO
	user_mst(
		um_code,
		username,
		PASSWORD,
		NAME,
		email,
		create_date,
		update_date
	)		
VALUES
	(
		0,
		'bbbb',
		'3333',
		'강민4',
		'bbb@ddd.com',
		NOW(),
		NOW()
	)		
;		
		
INSERT
INTO
	user_mst		
VALUES
	(
		0,
		'cccc',
		'4444',
		'강민',
		'ccc@ddd.com',
		NOW(),
		NOW()
	)		
;		

INSERT INTO
	product_mst
VALUES
	(
		0,
		'스타벅스 블루 텀블러',
		'1',
		NOW(),
		NOW()
	)
;

INSERT INTO
	product_mst
VALUES
	(
		0,
		'스타벅스 레드 텀블러',
		1,
		NOW(),
		NOW()	
	),
	(
		0,
		'스타벅스 레드1 텀블러',
		1,
		NOW(),
		NOW()	
	)
;


/*CREATE TABLE `product_mst1` (
	`pdm_code` INT NOT NULL AUTO_INCREMENT,
	`pdm_name` VARCHAR(50) NOT NULL,
	`ctg_code` INT NOT NULL,
	`create_date` DATETIME NOT NULL,
	`update_date` DATETIME NOT NULL,
	PRIMARY KEY (`pdm_code`)
)
COLLATE='utf8mb3_general_ci'
;



INSERT INTO
	product_mst1
VALUES
	(
		0,
		'스타벅스 블루 텀블러',
		'1',
		NOW(),
		NOW()	
	)
;
*/

INSERT INTO
	user_mst
VALUES(0, 'eee', '1234', '강민', 'aaa@ddd.com', NOW(), NOW()),
	(0, 'ssss', '1234', '강민1', 'aaa@ddd.com', NOW(), NOW())
;