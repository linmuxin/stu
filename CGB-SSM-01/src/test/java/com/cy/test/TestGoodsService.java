package com.cy.test;

import java.util.List;
import org.junit.Test;
import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;

public class TestGoodsService extends TestBean {
	
	@Test
	public void testFindGoods() {
		GoodsService gs = ctx.getBean("goodsServiceImpl", GoodsService.class);
		List<Goods> list = gs.findGoods();
		for (Goods goods : list) {
			System.out.println(goods);
		}
	}

}
