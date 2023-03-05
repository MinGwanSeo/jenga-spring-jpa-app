package jenga.jenga.mappers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PathRequestMappingHandlerMapper extends RequestMappingHandlerMapping {

    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {

        RequestMappingInfo methodMapping = super.getMappingForMethod(method, handlerType);

        if (methodMapping == null) {
            return null;
        }

        List<String> superclassUrlPatterns = new ArrayList<>();
        boolean springPath = false;

        for
        (
                Class<?> clazz = handlerType;  // 클래스 clazz 를 handlerType 로 초기화
                clazz != Object.class; // clazz 가 Object 클래스가 아니면, (조건식)
                clazz = clazz.getSuperclass() // clazz 에 clazz의 부모 class를 가져온다.
        ) {
            if (clazz.isAnnotationPresent(RequestMapping.class)) {
                if (springPath) {
                    superclassUrlPatterns.add(clazz.getAnnotation(RequestMapping.class).value()[0]);

                } else {
                    springPath = true;
                }
            }
        }

        if (!superclassUrlPatterns.isEmpty()) {
            RequestMappingInfo superclassRequestMappingInfo = new RequestMappingInfo("", new PatternsRequestCondition(String.join("", superclassUrlPatterns)), null, null, null, null, null, null);
            return superclassRequestMappingInfo.combine(methodMapping);
        } else {
            return methodMapping;
        }

    }

}
