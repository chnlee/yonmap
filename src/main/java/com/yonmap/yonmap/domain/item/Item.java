package com.yonmap.yonmap.domain.item;
import lombok.Data;

@Data
public class Item { // 강의
    // 강의실 index
    private Long id;
    // 강의실 번호
    private Integer Name;
    // 건물명
    private String Building;
    // 강좌 정보
    private String Subject;
    // x 좌표
    private Double pos_x;
    // y 좌표
    private Double pos_y;

    public Item() {
    }

    public Item(Integer Name, String Building, String Subject, Double pos_x, Double pos_y) {
        this.Name = Name;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.Building = Building;
        this.Subject = Subject;
    }
}

