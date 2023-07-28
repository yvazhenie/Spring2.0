package makarovSSpring.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class Cart {
    private List<Integer> items = new ArrayList<>();

    public List<Integer> getItems() {
        return Collections.unmodifiableList(items);
    }

    public List<Integer> addItems(List<Integer> items) {
        this.items.addAll(items);
        return getItems();
    }
}