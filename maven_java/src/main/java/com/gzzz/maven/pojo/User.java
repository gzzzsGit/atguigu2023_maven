package com.gzzz.maven.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * className: User
 * Package : com.gzzz.maven.pojo
 * Description:
 *
 * @Author gzzz
 * @Create 2023/11/23 10:12
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
}
