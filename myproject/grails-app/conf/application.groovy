dataSource {
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
    logSql = true
}

environments {
    development {
        dataSource {
            pooled = false
            dbCreate = "update"
            url = 'jdbc:mysql://localhost:3306/my_project_dev_db?useUnicode=true&characterEncoding=utf8'
            username = 'root'
            password = "nextdefault"
        }
    }
    production {
        dataSource {
            pooled = false
            dbCreate = "update"
            url = 'jdbc:mysql://localhost:3306/my_project_prod_db?autoreconnect=true&allowMultiQueries=true&useUnicode=true&characterEncoding=utf8'
            username = 'root'
            password = "nextdefault"
        }
    }
}