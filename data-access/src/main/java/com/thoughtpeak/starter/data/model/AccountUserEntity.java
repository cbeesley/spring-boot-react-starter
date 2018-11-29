package com.thoughtpeak.starter.data.model;

import com.thoughtpeak.starter.data.converters.UserJsonConverter;
import com.thoughtpeak.starter.model.ui.User;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;

/**\
 * This is the mapping pojo that maps into your database table
 */
@Entity
@Table(name="account_users")
public class AccountUserEntity {

    /**
     * This is so you can get the auto incremented value from
     * the database
     */
    @Id
    @GeneratedValue
    private long pkId;

    private String uuid;
    private String username;
    private String auth_token;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isEnabled;
    private int roleCode;
    private int statusCode;
    private Date lastLoginTime;
    private int contectRef;
    private Date dateEntered;
    private Date dateModified;
    private boolean isResetCode;
    /**
     * You can create custom mappers such as Object to JSON
     * so that they can be stored to the DB's correct type
     */
    @Column(name = "json_config")
    @Convert(converter = UserJsonConverter.class)
    private Optional<User> jsonConfig;

    // Generated getter and setter OR use lombok for scala case class-like function


    public long getPkId() {
        return pkId;
    }

    public void setPkId(long pkId) {
        this.pkId = pkId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuth_token() {
        return auth_token;
    }

    public void setAuth_token(String auth_token) {
        this.auth_token = auth_token;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public int getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(int roleCode) {
        this.roleCode = roleCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getContectRef() {
        return contectRef;
    }

    public void setContectRef(int contectRef) {
        this.contectRef = contectRef;
    }

    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public boolean isResetCode() {
        return isResetCode;
    }

    public void setResetCode(boolean resetCode) {
        isResetCode = resetCode;
    }

    public Optional<User> getJsonConfig() {
        return jsonConfig;
    }

    public void setJsonConfig(Optional<User> jsonConfig) {
        this.jsonConfig = jsonConfig;
    }
}
