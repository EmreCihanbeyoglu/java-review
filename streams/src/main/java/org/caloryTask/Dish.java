package org.caloryTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {
    private String name;
    private boolean vegeterian;
    private int calories;
    private Type type;
}
