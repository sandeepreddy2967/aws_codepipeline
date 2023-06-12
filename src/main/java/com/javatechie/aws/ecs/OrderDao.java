package com.javatechie.aws.ecs;

import java.util.Arrays;
import java.util.List;

public class OrderDao {

    public List<Order> getOrders(){
        return Arrays.asList(new Order(1, "order1", 45), new Order(2, "order2", 34));
    }
}
