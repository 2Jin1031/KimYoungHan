//package hello.coreparrot;
//
//import hello.coreparrot.member.Member;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//import java.util.List;
//
//public class JpaMain {
//
//    public static void main(String[] args) {
//
//        // 엔티티 매니저 팩토리 - 생성
//        EntityManagerFactory emf =
//                Persistence.createEntityManagerFactory("jpabook");
//
//        // 엔티티 매니저 - 생성 (엔티티 매니저는 JPA의 기능 대부분을 제공, 내부에 대이터소스를 유지하면서 데이터베이스와 통신
//        EntityManager em = emf.createEntityManager();
//
//        // 트랜젝션 - 획득
//        EntityTransaction tx = em.getTransaction();
//
//        try {
//
//            tx.begin(); // 트랜잭션 - 시작
//            logic(em); // 비지니스 로직 실행
//            tx.commit(); // 트랜잭션 - 커밋
//        } catch (Exception e) {
//            tx.rollback();; // 트랜잭션 - 롤백
//        } finally {
//            em.close(); // 엔티티 매니저 - 종료
//        }
//        em.close(); // 엔티티 매니저 팩토리 - 종료
//    }
//
//    private static void logic(EntityManager em) {
//
//        Long id = 1L;
//        Member member = new Member();
//        member.setId(id);
//        member.setName("지한");
//        member.setAge(2);
//
//        // 등록
//        em.persist(member);
//
//        // 수정
//        member.setAge(20);
//
//        // 한 건 조회
//        Member findMember = em.find(Member.class, id);
//        System.out.println("findMember = " + findMember.getName()
//        + ", age = " + findMember.getAge());
//
//        // 목록 조회
//        List<Member> members =
//                em.createQuery("select  m from Member m", Member.class)
//                        .getResultList();
//        System.out.println("members.size = " + members.size());
//
//        // 삭제
//        em.remove(member);
//    }
//
//}
