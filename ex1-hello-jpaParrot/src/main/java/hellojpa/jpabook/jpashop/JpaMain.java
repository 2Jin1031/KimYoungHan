package hellojpa.jpabook.jpashop;

import hellojpa.jpabook.jpashop.domain.Order;
import hellojpa.jpabook.jpashop.domain.OrderItem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Order order = new Order();
            em.persist(order);

            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(order);
            em.persist(orderItem);
            tx.commit();

        } catch (Exception e) {
            System.out.println("in catch");
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
