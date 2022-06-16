# App Config Template

<br>

```java
package com.revature.spring_mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@EnableWebMvc
@Configuration
@ComponentScan("com.revature")
public class AppConfig implements WebMvcConfigurer, WebApplicationInitializer {

    /* onStartup is very similar to our ContextLoaderListener class. */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext beanContainer = new AnnotationConfigWebApplicationContext();

        /* register our configuration class to the bean container. */
        beanContainer.register(AppConfig.class);

        /* add our listener class. */
        servletContext.addListener(new ContextLoaderListener(beanContainer));

        /* we are adding our bean container to the DispatcherServlet because all of our controllers and services needs to be accessible. */
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(beanContainer));

        /* we set load on startup to be 1 so our dispatcher can create our container when we deploy to Tomcat. 1 == true, 0 == false. */
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}

```