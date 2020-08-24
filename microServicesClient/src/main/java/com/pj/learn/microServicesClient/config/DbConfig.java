package com.pj.learn.microServicesClient.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;

/**
 * Any Spring Bean annotated by @RefreshScope will be refreshed at runtime.
 * And any components that are using them will get a new instance on the next method call,
 * fully initialized and injected with all dependencies.
 */
//@RefreshScope
@Configuration
@Data
public class DbConfig {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.jpa.properties.hibernate.dialect}")
    private String dialect;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Value("${spring.jpa.show-sql}")
    private String showSql;


    @Bean
    public DataSource ds1Datasource() {
System.out.println("~~~~~"+driverClassName);
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public EntityManager show()
    {
        LocalContainerEntityManagerFactoryBean factoryBean =  new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(ds1Datasource());

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

        factoryBean.setJpaVendorAdapter(vendorAdapter);

        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect", dialect);
        properties.put("hibernate.show-sql", showSql);
        factoryBean.setJpaPropertyMap(properties);
        factoryBean.afterPropertiesSet();
        EntityManagerFactory entityManagerFactory =  factoryBean.getNativeEntityManagerFactory();
        EntityManager entityManager =  entityManagerFactory.createEntityManager();
return entityManager;


    }

}
