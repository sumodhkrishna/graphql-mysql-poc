package com.sumodh.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sumodh.request.SampleRequest;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    public String genQuery(){
        return "First Query";
    }

    public String queryWithInput(SampleRequest request){
        return (request.getFirstInput()+request.getSecondInput()).hashCode()+"";
    }
}
