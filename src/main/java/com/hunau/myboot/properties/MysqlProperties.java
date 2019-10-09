package com.hunau.myboot.properties;

/**
 * @param $params$
 * @Description:
 * @Return: $returns$
 * @Author: 曹佳怡
 * @单位：湖南农业大学物联网工程专业
 * @Date: $date$ $time$
 * 开发版本：综合练习V0.1
 */
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component                              //构件
@ConfigurationProperties(prefix="mysql")      //配置属性类prefix="mysql"
public class MysqlProperties {
    private String jdbcName;
    private String dbUrl;
    private String userName;
    private String password;
    public String getJdbcName() {
        return jdbcName;
    }
    public void setJdbcName(String jdbcName) {
        this.jdbcName = jdbcName;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}