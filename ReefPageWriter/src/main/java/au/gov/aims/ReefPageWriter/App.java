package au.gov.aims.ReefPageWriter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import au.gov.aims.ReefPageWriter.model.Comment;
@ViewScoped
public class App {

	private static final String PERSISTENCE_UNIT_NAME = "comments";
	private static EntityManagerFactory factory;
	private List<Comment> commentsList = new ArrayList<Comment>();
	@SuppressWarnings("unchecked")
	public App(){
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		// Read the existing entries and write to console.
		Query q = em.createQuery("Select c from Comment c", Comment.class);   //<-----SQL IN HERE!
		this.commentsList.addAll((List<Comment>)q.getResultList());
		em.close();
	}
	public List<Comment> getCommentsList() {
		return commentsList;
	}
	
}
