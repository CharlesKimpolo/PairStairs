package twza_pairstairs_kimpolo.web.views;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.MergedContextConfiguration;
import org.springframework.test.context.support.AbstractContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;

import javax.servlet.ServletContext;

/**
 * Needed until Spring provides a WebApplicationContext test context
 * See: https://jira.springsource.org/browse/SPR-5243
 */
public class MockServletContextLoader extends AbstractContextLoader {

    @Override
    public String getResourceSuffix() {
        return "-context.xml";
    }

    @Override
    public ApplicationContext loadContext(MergedContextConfiguration mergedConfig) throws Exception {
        return loadContext(mergedConfig.getLocations());
    }

    @Override
    public ApplicationContext loadContext(String... locations) throws Exception {
        ServletContext servletContext = new MockServletContext("src/main/webapp", new FileSystemResourceLoader());

        GenericWebApplicationContext webContext = new GenericWebApplicationContext();
        servletContext.setAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE, webContext);
        webContext.setServletContext(servletContext);

        new XmlBeanDefinitionReader(webContext).loadBeanDefinitions(locations);
        AnnotationConfigUtils.registerAnnotationConfigProcessors(webContext);

        webContext.refresh();
        webContext.registerShutdownHook();
        return webContext;
    }
}