////package org.example.exception;
////
////public class sql {
////}
//# a6 DB 삭제/생성/선택
//DROP DATABASE IF EXISTS a6;
//CREATE DATABASE a6;
//USE a6;
//
//# 부서(홍보, 기획)
//
//CREATE TABLE dept(
//        id INT (5) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
//dName CHAR (30) NOT NULL
//)
//INSERT INTO dept
//SET dName = '홍보';
//
//INSERT INTO dept
//SET dName = '기획';
//
//SELECT *
//FROM dept;
//# 사원(홍길동/홍보/5000만원, 홍길순/홍보/6000만원, 임꺽정/기획/4000만원)
//
//CREATE TABLE emp(
//        id INT (10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
//eName CHAR (30)NOT NULL,
//dNo INT (10) NOT NULL,
//price INT (10)NOT NULL
//);
//
//INSERT INTO emp
//        SET eName = '홍길동'
//                , dNo = '1'
//                , price = 5000;
//
//INSERT INTO emp
//        SET eName = '홍길순'
//                , dNo = '1'
//                , price = 6000;
//
//INSERT INTO emp
//        SET eName = '임꺽정'
//                , dNo = '2'
//                , price = 4000;
//
//SELECT *
//FROM emp
//
//# 사원 수 출력
//
//SELECT COUNT(*)
//FROM emp;
//
//# 가장 큰 사원 번호 출력
//
//SELECT *
//FROM emp
//ORDER BY id DESC LIMIT 1;
//
//        # 가장 고액 연봉
//
//SELECT *
//FROM emp;
//
//SELECT *
//FROM emp
//ORDER BY price DESC LIMIT 1;
//
//        # 가장 저액 연봉
//
//SELECT *
//FROM emp
//ORDER BY price ASC LIMIT 1;
//
//        # 회사에서 1년 고정 지출(인건비)
//
//SELECT SUM(price)
//FROM emp
//WHERE price;
//
//# 부서별, 1년 고정 지출(인건비)
//
//SELECT *
//FROM emp
//INNER JOIN dept
//ON emp.dNo = dept.id
//
//SELECT dept.dName AS '부서이름'
//        , SUM(emp.price) AS '고정지출'
//FROM emp
//INNER JOIN dept
//ON emp.dNo = dept.id
//GROUP BY emp.dNo;
//
//# 부서별, 최고연봉
//
//SELECT dept.dName, MAX(emp.price)
//FROM emp
//INNER JOIN dept
//ON emp.dNo = dept.id
//GROUP BY emp.dNo;
//
//# 부서별, 최저연봉
//
//SELECT dept.dName, MIN(emp.price)
//FROM emp
//INNER JOIN dept
//ON emp.dNo = dept.id
//GROUP BY emp.dNo;
//
//# 부서별, 평균연봉
//
//SELECT dept.dName, AVG(emp.price)
//FROM emp
//INNER JOIN dept
//ON emp.dNo = dept.id
//GROUP BY emp.dNo;
//
//# 부서별, 부서명, 사원리스트, 평균연봉, 최고연봉, 최소연봉, 사원수
//## V1(조인 안한 버전)
//
//SELECT *
//FROM dept;
//
//SELECT *
//FROM emp;
//
//## V2(조인해서 부서명까지 나오는 버전)
//
//SELECT *
//FROM emp
//INNER JOIN dept
//ON emp.dNo = dept.id
//
//## V3(V2에서 평균연봉이 5000이상인 부서로 추리기)
//
//## V4(V3에서 HAVING 없이 서브쿼리로 수행)
//### HINT, UNION을 이용한 서브쿼리
//# SELECT *
//        # FROM (
//# select 1 AS id
//                # union
//                # select 2
//                # UNION
//                # select 3
//                # ) AS A

// HAVING은 그룹다음에