package com.model2.mvc.service.product.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/commonservice.xml"})
public class ProductServiceTest {

	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;
	
	@Test
	public void testAddUser() throws Exception{
		Product product = new Product();
		product.setProdName("testProductName");
		product.setProdDetail("testProdDetail");
		product.setManuDate("111111");
		product.setPrice(123);
		product.setFileName("333333");
		
//		productService.addProduct(product);
		
//		product = productService.getProduct(10060);
//		System.out.println("=====================");
//		System.out.println(product);
//		
//		Assert.assertEquals("testProductName", product.getProdName());
//		Assert.assertEquals("testProdDetail", product.getProdDetail());
//		Assert.assertEquals("111111", product.getManuDate());
//		Assert.assertEquals(123, product.getPrice());
//		Assert.assertEquals("333333", product.getFileName());
	}
	
}
