package com.example.shop.entity;

import com.example.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Item {
    private Long id; //상품코드
    private String itemNm; //상품명
    private int price; //가격
    private int stockNumber; //재고수량
    private String itemDetail; //상품상세설명
    private ItemSellStatus itemSellStatus; //상품판매상태
    private LocalDateTime regTime; //등록 시간
    private LocalDateTime updateTime; //수정 시간
}