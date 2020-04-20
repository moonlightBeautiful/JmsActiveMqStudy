Spring Boot
对事务的支持
在service的实现类上+
    @Transactional
insert  into `t_account`(`id`,`balance`,`user_name`) values (1,700,'zhangsan'),(2,300,'lisi');
