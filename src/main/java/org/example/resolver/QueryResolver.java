package org.example.resolver;


import graphql.kickstart.tools.GraphQLQueryResolver;
import org.example.bean.User;
import org.example.bean.UserInput;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * description：
 * time：2022/9/9 14:49
 */

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public User user(String name, Integer age) {
        return new User(1L, name, age);
    }

    public List<User> users(UserInput input) {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "aaa", 10));
        users.add(new User(2L, "bbb", 11));
        return users;
    }
}