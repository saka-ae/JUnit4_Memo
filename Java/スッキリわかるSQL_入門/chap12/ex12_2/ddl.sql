/* Create Tables */

-- 部署
CREATE TABLE Department
(
	-- 部署番号
	id varchar(2) PRIMARY KEY,
	-- 部署名
	name varchar(10) NOT NULL UNIQUE,
);


-- 社員
CREATE TABLE Employee
(
	-- 社員番号
	id char(5) PRIMARY KEY,
	-- 社員名
	name varbinary(10) NOT NULL,
	-- 年齢
	age varchar(2) DEFAULT '不明',
);


-- 役職
CREATE TABLE Post
(
	-- 役職コード
	code char(1) PRIMARY KEY,
	-- 役職名
	name varchar(10) NOT NULL UNIQUE,
);


-- 部員
CREATE TABLE Member
(
	-- 部署番号
	department_id varchar(2) REFERENCES Department (id),
	-- 社員番号
	id char(5) REFERENCES Employee (id),
	-- 役職コード
	post_code char(1) NOT NULL REFERENCES Post (code),

	PRIMARY KEY (department_id, id)
);


/* Create Indexes */

CREATE INDEX Department_Id			ON Department (id);
CREATE INDEX Employee_Id			ON Employee (id);
CREATE INDEX Member_Id				ON Member (id);
CREATE INDEX Member_Department_Id	ON Member (department_id);
CREATE INDEX Member_Position_Code	ON Member (post_code);
CREATE INDEX Position_Code			ON Post (code);
