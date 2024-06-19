package com.sist.dao;

import lombok.Data;

@Data

public class EmpVO {
	private int empno, sal, performance, deptno;
	private String ename, job, admin, content, hiredate;
	
	private DeptVO dvo = new DeptVO();
}