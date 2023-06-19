package mate.academy.service;

import java.util.List;
import mate.academy.model.Order;
import mate.academy.model.ShoppingCart;
import mate.academy.model.User;

public interface OrderService {
    List<Order> getOrdersHistory(User user);

    Order completeOrder(ShoppingCart shoppingCart);
}
