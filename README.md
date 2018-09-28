###如何使用Spring AOP?
####通过xml文件来进行，大概有四种方式：
#####1.配置ProxyFactoryBean，显式地设置advisors, advice, target等。 
#####2.配置AutoProxyCreator，这种方式下，还是如以前一样使用定义的bean，但是从容器中获得的其实已经是代理对象。 
#####3.通过<aop:config>来配置。 
#####4.通过<aop: aspectj-autoproxy>来配置，使用AspectJ的注解来标识通知及切入点。 