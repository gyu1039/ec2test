package hello.itemservice.domain.item;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {

//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    ItemRepository itemRepository = new ItemRepository();
//
//
//    @Test
//    void test() {
//        assertNull(jdbcTemplate);
//    }
//
////    @AfterEach
////    void afterEach() {
////        itemRepository.clearStore();
////    }
//
//    @Test
//    void save() {
//        // given
//        Item item = new Item("itemA", 10000, 10);
//
//        //when
//        Item savedItem = itemRepository.save(item);
//
//        //then
//        Item findItem = itemRepository.findById(item.getId());
//        assertThat(findItem).isEqualTo(savedItem);
//    }
//
//    @Test
//    void findAll() {
//        //given
//        Item item1 = new Item("item1", 10000, 10);
//        Item item2 = new Item("item2", 20000, 20);
//
//        itemRepository.save(item1);
//        itemRepository.save(item2);
//
//        //when
//        List<Item> result = itemRepository.findAll();
//
//        //then
//        assertThat(result.size()).isEqualTo(2);
//        assertThat(result).contains(item1, item2);
//    }
//
//    @Test
//    void updateItem() {
//        //given
//        Item item = new Item("item1", 10000, 10);
//
//        Item savedItem = itemRepository.save(item);
//        Long itemId = savedItem.getId();
//
//        //when
//        Item updateParam = new Item("item2", 20000, 30);
//        itemRepository.update(itemId, updateParam);
//
//        Item findItem = itemRepository.findById(itemId);
//
//        //then
//        assertThat(findItem.getItemName()).isEqualTo(updateParam.getItemName());
//        assertThat(findItem.getPrice()).isEqualTo(updateParam.getPrice());
//        assertThat(findItem.getQuantity()).isEqualTo(updateParam.getQuantity());
//    }


}