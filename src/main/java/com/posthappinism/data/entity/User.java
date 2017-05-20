package com.posthappinism.data.entity;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by yh958 on 2017-05-16.
 */
@Data
@Entity
@EqualsAndHashCode( exclude = {"password"})
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    @NonNull
    private String username;

    @Column
    @NonNull
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return ImmutableSet.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
