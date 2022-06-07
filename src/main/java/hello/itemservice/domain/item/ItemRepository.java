package hello.itemservice.domain.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Item save(Item item) {
        String query = "Insert into item(itemName, price, quantity) values(?,?,?)";
        jdbcTemplate.update(query, item.getItemName(), item.getPrice(), item.getQuantity());

        return item;
    }

    public Item findById(Long id) {
        Item item1 = jdbcTemplate.queryForObject("select * from item where id = ?"
                , (rs, rowNum) -> {
                    Item item = new Item();
                    item.setId(rs.getLong("id"));
                    item.setItemName(rs.getString("itemName"));
                    item.setPrice(rs.getInt("price"));
                    item.setQuantity(rs.getInt("quantity"));
                    return item;
                }, new Long[]{id});
        return item1;
    }

    public List<Item> findAll() {
        List<Item> results = jdbcTemplate.query("select * from item",
                (rs, rowNum) -> {
                    Item item = new Item();
                    item.setId(rs.getLong("id"));
                    item.setItemName(rs.getString("itemName"));
                    item.setPrice(rs.getInt("price"));
                    item.setQuantity(rs.getInt("quantity"));
                    return item;
                });
        return results;
    }

    public void update(Long itemId, Item updateParam) {
        jdbcTemplate.update("update item set itemname = ?, price = ?, quantity = ? where id = ?",
                updateParam.getItemName(), updateParam.getPrice(), updateParam.getQuantity(), itemId);

    }

    public void clearStore() {
        jdbcTemplate.update("delete from item");
    }


}
