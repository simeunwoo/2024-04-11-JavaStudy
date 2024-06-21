
/*
		 ZIPCODE                                             VARCHAR2(7)
 SIDO          VARCHAR2(50)
 GUGUN         VARCHAR2(50)
 DONG           VARCHAR2(100)
 BUNJI           VARCHAR2(17)
 */
package com.sist.dao;

import lombok.Data;

@Data
public class ZipVO {
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;
}
