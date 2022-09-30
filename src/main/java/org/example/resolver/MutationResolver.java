package org.example.resolver;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.extern.slf4j.Slf4j;
import org.example.bean.Result;
import org.example.bean.UserInput;
import org.springframework.stereotype.Component;

/**
 * description：
 * time：2022/9/14 11:21
 */
@Slf4j
@Component
public class MutationResolver implements GraphQLMutationResolver {
    public Result addUser(UserInput input) {
        log.info(input.toString());
        return new Result(200, "success");
    }
}
