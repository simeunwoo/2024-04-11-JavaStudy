
package com.sist.dao;

import java.util.*;
import lombok.Data;

@Data

public class EmpVO {
	private int empno, sal, performance, deptno;
	private String ename, job, admin, content,hiredate;
	private Date regdate;
	private DeptVO dvo = new DeptVO();
}
