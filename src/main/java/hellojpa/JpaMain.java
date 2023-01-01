package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            //회원 저장
            Member member = new Member();
            member.setUsername("member1");
            member.setTeam(team);
            em.persist(member);

            tx.commit();
        } catch (Exception exception) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
