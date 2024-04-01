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
//            // 비영속
//            Member findMember = em.find(Member.class, 150L);
//            System.out.println("findMember = " + findMember);
//            findMember.setName("ZZZZZZZ");
//
//            System.out.println("=========");
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
