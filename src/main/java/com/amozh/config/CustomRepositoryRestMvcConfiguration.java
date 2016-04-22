package com.amozh.config;

import com.amozh.Api;
import com.amozh.storage.Storage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

/**
 * Created by Andrii Mozharovskyi on 08.04.2016.
 */
@Configuration
public class CustomRepositoryRestMvcConfiguration extends RepositoryRestMvcConfiguration {

    @Override
    public RepositoryRestConfiguration config(){
        RepositoryRestConfiguration config = super.config();
        config.setBasePath(Api.CONTEXT);

        config.exposeIdsFor(Storage.class);

//        config.setPageParamName("p")
//                .setLimitParamName("l")
//                .setSortParamName("q");

        return config;
    }

}