package makarovSSpring.demo.controller;

import makarovSSpring.demo.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @RequestMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items) {
        return orderService.addAll(items);
    }

    @RequestMapping("/get")
    public List<Integer> getItems() {
        return orderService.getAll();
    }
}