package org.vinci.springBootLearn.Conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Jao on 2017/6/24.
 */
@Configuration
public class MvcConf extends WebMvcConfigurerAdapter {
    @Value("${app.web.path:}")
    String webPath;

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (!StringUtils.isEmpty(this.webPath)) {
            registry.addResourceHandler(new String[]{"/**"}).addResourceLocations(new String[]{"file:" + this.webPath + "/"});
            super.addResourceHandlers(registry);
        } else {
            throw new RuntimeException("app.web.path为空, 请配置前端路径.");
        }
    }
}
