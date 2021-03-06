package com.ralap.blog.core.bean;

import java.util.Collection;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * 当前登录用户
 *
 * @author: ralap
 * @date: created at 2018/6/12 14:23
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CurrentUser extends User {

    private Long id;

    public CurrentUser(String username, String password, Long id,
            Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = id;
    }

    public CurrentUser(String username, String password, boolean enabled, boolean accountNonExpired,
            boolean credentialsNonExpired, boolean accountNonLocked,
            Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired,
                accountNonLocked,
                authorities);
    }

}
