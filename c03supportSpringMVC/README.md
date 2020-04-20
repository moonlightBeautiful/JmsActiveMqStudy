Spring Boot
对springMVC的支持：不用组件扫描，自动扫描，怎么个机制，不懂
   1.@controller 标记类为控制器，用来处理http请求
   2.@requestMapping 映射请求
   3.@restController 处理ajax请求  = 
   3.@RequestParam 和 @PathVariable
pom中添加其他jar支持快捷键Alt+Insert
resources下面static和templates说明： 
    SpringBoot里面没有我们之前常规web开发的WebContent（WebApp），它只有src目录
    在src/main/resources下面有两个文件夹，static和templates
    static中放静态页面，而templates中放动态页面
    静态页面：
        url直接访问的是static的文件
        这里我们直接在static放一个hello.html,
        然后直接输入http://localhost:8080/hello.html便能成功访问  
        也可以通过controller跳转：返回需要带html后缀
    动态页面：
        动态页面需要先请求服务器，访问后台应用程序，然后再转向到页面，
        比如访问JSP。spring boot建议不要使用JSP，默认使用Thymeleaf来做动态页面。    
        在tempates文件夹中也新建一个hello.tld
        然后先试一下直接访问该页面。输入http://localhost:8080/hello.html： 访问不到
        然后我们现在再试一下用controller
        动态跳转会覆盖默认的静态跳转，默认就会跳转到/templates/index.html
        注意看两者return代码也有区别，动态没有html后缀。
    静态页面也静态页面区别：
        1.是否可以直接访问页面
        2.controller返回是否有后缀
           