package jenga.jenga.mappers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class WebConfigMapper extends DelegatingWebMvcConfiguration {
    @Override
    protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        return new PathRequestMappingHandlerMapper();
    }

    @Bean
    @Primary
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        return this.requestMappingHandlerMapping();
    }
}
