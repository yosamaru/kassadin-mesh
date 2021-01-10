//package com.kassadin.cms.core.interceptor;
//
//import feign.RequestInterceptor;
//import feign.RequestTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//@Component
//public class OkHttpRequestInterceptor implements RequestInterceptor {
//    @Override
//    public void apply(RequestTemplate template) {
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//
//        if (attributes != null) {
//            attributes.getRequest();
//            template.header("sessionId", request.getHeader("sessionId"));
//        }
//    }
//}
