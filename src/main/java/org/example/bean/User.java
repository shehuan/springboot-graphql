package org.example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * description：
 * time：2022/9/9 14:44
 */
@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
}
