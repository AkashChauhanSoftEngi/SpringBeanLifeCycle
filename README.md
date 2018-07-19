# SpringBeanLifeCycle

* Spring 3 + J2EE (J2EE Container) + DI using setter and constructor + Bean Creation and management
* Used ApplicationContext Interface, and used ClassPathXmlApplicationContext Implementation class
* Used applicationContext.xml for defining beans
* Spring requires Spring JAR/Libraries and JDK Libraries to run an Spring based application 

* Spring Bean life cycle related functions, Interface, tags, and classes
```text
  Used @PreDestroy and @PostConstruct annotations
  to use these annotations you have to add bean for org.springframework.context.annotation.CommonAnnotationBeanPostProcessor
  or <context:annotation-config/> in XML file
```

```text
  Implementing InitializingBean, DisposableBean interfaces: so you can override afterPropertiesSet() and destroy() from these interfaces
  afterPropertiesSet(): This method runs just after object initialization and property set
  destroy(): to destroy the bean
```

```text
* Used init-method="init" destroy-method="destroy" in XMl file to directly give informations about methods, after property set and         destroy bean respectively
* You can use init-method="init" destroy-method="destroy" directly inside xsi:schemaLocation, when these are the default methods in    	   every bean
```

```text
  Implementing BeanPostProcessor interface and override postProcessBeforeInitialization and postProcessAfterInitialization
  postProcessBeforeInitialization(): runs before bean initialization for each bean in XML file, even before init() method
  postProcessAfterInitialization(): runs after init() method and bean initialization
```

* J2EE IOC
```java
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
```

> **###1. Technologies**
* Spring 3.0.1.RELEASE
