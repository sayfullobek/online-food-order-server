package it.revo.Online.food.order.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResToken {
    private final String name = "Bearer";
    private String token;
}
