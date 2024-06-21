
package com.sist.dao;

import java.util.Date;

import lombok.Data;

@Data

public class OrdersVO {
	private int ordid, custid, goods_id;
	private Date regdate;
}
