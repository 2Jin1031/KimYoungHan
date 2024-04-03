//package hellojpa;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
//public class JpaMain {
//
//    public static void main(String[] args) {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
//
//            Team team = new Team();
//            team.setName("TeamA");
//
//            Member member = new Member();
//            member.setName("memberA");
//            member.setTeam(team);
//            team.getMembers().add(member);
//
//            em.persist(team);
//            em.persist(member);
//
//
//
//            em.flush();
//            em.clear();
//
//            tx.commit();
//        } catch (Exception e) {
//            System.out.println("in catch");
//            tx.rollback();
//        } finally {
//            em.close();
//        }
//
//        emf.close();
//    }
//}
