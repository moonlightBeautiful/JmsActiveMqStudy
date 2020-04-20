Spring Boot
对springDataJpa的支持
    需要依赖springDataJpa，底层使用了hibernate。
    1.Jpa帮我们实现了简单的crud，
    2.@query可以复杂的查询 
        1.取参数：?! 第一个参数
        2.默认hql查询，nativeQuery = true 改成sql查询
    3.specification 动态条件判断，需要继承接口 ,JpaSpecificationExecutor<Book>
        需要实现匿名内部类
编码实现：   
    1.application.yml配置数据源
    2.创建数据库db_springboot
    3.实体类：Book，hibernate相关的注解@Entity、@Table(name="t_book")等
    4.dao类 ：jpa接管dao，帮我们实例化dao并且完成常用相关的crud方法
        dao接口继承，extends JpaRepository<模型类, 主键>
        @query 复杂的sql查询 ?1 表示第一个参数
    5.controller层：直接使用dao
      @Resource
      private BookDao bookDao;      
    6.ftlh页面
        <#list bookList as book> 遍历
            ${book.id} 取值    
        </#list>

数据准备
    insert  into `t_book`(`id`,`author`,`name`) values (1,'java编程思想','小二'),(2,'php编程','老王');
           