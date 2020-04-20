Spring Boot
属性配置
    有内置属性和自定义属性，在application.properties文件中，这个文件相当于web.xml文件
    但是功能更强大
内置属性
    1.内置tomcat配置
        server.配置项
自定义属性配置
    无前缀：
        定义：自定义key=自定义value
        使用：属性上，@Value("${key}")注入
    有前缀：
        定义：前缀.自定义key=自定义value
        使用：2种方式
            1.属性上，@Value("${前缀.自定义key}")注入
            2.类上，@ConfigurationProperties(prefix = "前缀") + 属性上，@Value("${自定义key}")注入
    note：
        中文，自动转换为编码

properties文件注释#开头                