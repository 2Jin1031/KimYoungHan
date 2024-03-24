package jpabook.jpashopParrot.service;

import jpabook.jpashopParrot.domain.item.Book;
import jpabook.jpashopParrot.domain.item.Item;
import jpabook.jpashopParrot.repository.ItemRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

    @Autowired ItemService itemService;
    @Autowired
    ItemRepository itemRepository;

    @Test
    public void 상품등록 () throws Exception {
        //given
        Book book = new Book();
        book.setName("computer");

        //when
        itemService.saveItem(book);

        //then
        Item findBook = itemService.findOne(book.getId());

        Assertions.assertEquals(book.getName(), findBook.getName());
    }

//    @Test(expected = IllegalStateException.class)
//    public void 중복_예외() throws Exception {
//        //given
//        Book book1 = new Book();
//        book1.setId(1L);
//
//        Book book2 = new Book();
//        book2.setId(1L);
//
//        //when
//        itemService.saveItem(book1);
//        itemService.saveItem(book2);
//
//        //then
//        fail();
//    }
}