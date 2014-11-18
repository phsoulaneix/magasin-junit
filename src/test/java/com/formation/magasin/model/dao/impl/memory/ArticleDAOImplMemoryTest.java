package com.formation.magasin.model.dao.impl.memory;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.formation.magasin.model.dao.ArticleDAO;
import com.formation.magasin.model.dao.impl.memory.ArticleDAOImplMemory;
import com.formation.magasin.model.entity.memory.ArticleMemory;

/**
 * The Class ArgentDAOImplMemoryTest.
 */
@RunWith(JUnit4.class)
public class ArticleDAOImplMemoryTest {

	/**
	 * Sets the up.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test create.
	 */
	@Test
	public void testCreate() {
		final ArticleDAO articleDAO = new ArticleDAOImplMemory();

		try {
			Assert.assertTrue(articleDAO.create(new ArticleMemory(1,
					"Article 1", 10)));
			Assert.assertFalse(articleDAO.create(new ArticleMemory(null,
					"Article 2", 10)));
			Assert.assertFalse(articleDAO.create(new ArticleMemory(1,
					"Article 3", null)));
			Assert.assertFalse(articleDAO.create(new ArticleMemory(null,
					"Article 4", null)));
		} catch (final SQLException e1) {
			fail("Création impossible");
		}
	}

	/**
	 * Test delete.
	 */
	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	/**
	 * Test update.
	 */
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test find.
	 */
	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	/**
	 * Test equals.
	 */
	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

}
