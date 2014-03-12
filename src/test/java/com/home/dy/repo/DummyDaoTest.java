package com.home.dy.repo;

import com.home.dy.entities.Dummy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Project: SpringData
 * Author: Yermiichuk Dmitrii
 * Date: 3/11/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app.xml")
public class DummyDaoTest {

	@Autowired
	private DummyDao dummyDao;

	@Before
	public void beforeTest() {
		dummyDao.save(new Dummy("a"));
		dummyDao.save(new Dummy("b"));
		dummyDao.save(new Dummy("c"));
	}

	@Test
	public void dummyDaoTest() {
		Assert.assertEquals(2, dummyDao.findAllByNameIn("a", "b").size());
	}
}
