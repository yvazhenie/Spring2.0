package makarovSSpring.demo.service;

import java.util.List;

public interface OrderService {
    List<Integer> addAll(List<Integer> idList);

    List<Integer> getAll();
}
