Spring Boot
简介
    是由Pivotal团队提供的全新框架。
    让程序员更好的使用Spring，简化Spring应用的初始搭建（简化配置）以及开发过程。
Spring Boot特点
    1.搭建项目快，几秒钟就可以搭建完成；
    2.让测试变的简单，内置了JUnit、Spring Boot Test等多种测试框架，方便测试；
    3.Spring Boot让配置变的简单，Spring Boot的核心理念：约定大约配置，约定了某种命名规范，可以不用配置，就可以完成功能开发，比如模型和表名一致就可以不用配置，直接进行CRUD（增删改查）的操作，只有表名和模型不一致的时候，配置名称即可；
    4.内嵌容器，省去了配置Tomcat的繁琐；
    5.方便监控，使用Spring Boot Actuator组件提供了应用的系统监控，可以查看应用配置的详细信息；
使用IDEA创建一个springboot项目
    1.Spring Initializr创建项目
    2.项目配置
        Type属性可以下拉选择project或者pom，
        Packaging属性可下拉选择jar或者war（Maven的东西不需要再提了吧）。
    3.起步依赖配置，会引入相关很多依赖jar包  
        随便选择web
    4.随便写个controller，启动主类，访问http://localhost:8080/请求