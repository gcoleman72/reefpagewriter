package au.gov.aims.ReefPageWriter;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

import au.gov.aims.ReefPageWriter.model.Comment;

public class commentReadTest {
	
	private static final String PERSISTENCE_UNIT_NAME = "comments";
	private EntityManagerFactory factory;
	
	@Test
	public void checkComments() throws Exception {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		// Read the existing entries and write to console.
		Query q = em.createQuery("Select c from Comment c");   //<-----SQL IN HERE!

		@SuppressWarnings("unchecked")
		List<Comment> commentList = q.getResultList();
		for (Comment comment : commentList) {
			System.out.println(comment.toString());
		}
		System.out.println("Size: " + commentList.size());
		em.close();
	}
}

