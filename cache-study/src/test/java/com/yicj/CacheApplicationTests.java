package com.yicj;

import com.yicj.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheApplicationTests {

	@Autowired
	private MenuService menuService;

	@Test
	public void testCache() {
		System.out.println("call:"+menuService.getMenuList());
		System.out.println("call:"+menuService.getMenuList());
	}

}