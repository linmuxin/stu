package com.cy.test;

import java.util.List;
import org.junit.Test;
import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;
public class TestGoodsDao extends TestBean{
	
	@Test
	public void testFindGoods() {
		GoodsDao dao = ctx.getBean("goodsDao", GoodsDao.class);
		List<Goods> list = dao.findGoods();
		for (Goods goods : list) {
			System.out.println(goods);
		}
	}
}
