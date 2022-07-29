package com.yonmap.yonmap.web.item.basic;

import com.yonmap.yonmap.domain.item.Item;
import com.yonmap.yonmap.domain.item.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class BasicItemController {
    private final ItemRepository itemRepository;

    @GetMapping("/all")
    public List<Item> items() {
        List<Item> items = itemRepository.findAll();
        return items;
    }

    @GetMapping("/subject")
    public Optional<Item> item(@RequestParam String subject) {
        return itemRepository.findBySubject(subject);
    }

    /**
     * 테스트용 데이터 추가
     */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item(503,"연세대학교 제2공학관","공학수학",37.5624,126.9352));
        itemRepository.save(new Item(403,"연세대학교 외솔관","유체역학",37.5665,126.937));
  }
}