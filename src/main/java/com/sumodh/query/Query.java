package com.sumodh.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    public String genQuery(){
        return "First Query";
    }

    public String queryWithInput(String firstInput, String secondInput){
        return (firstInput+secondInput).hashCode()+"";
    }
}
