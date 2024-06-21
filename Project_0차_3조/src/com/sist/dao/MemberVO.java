
package com.sist.dao;

import lombok.Data;

@Data

public class MemberVO {
	private String id, pwd, name, sex, phone, post, addr1, addr2, email, birthday, admin;
	private int empno;
}
