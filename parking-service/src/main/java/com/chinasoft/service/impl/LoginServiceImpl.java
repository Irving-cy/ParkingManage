package com.chinasoft.service.impl;




import com.chinasoft.dao.LoginDao;
import com.chinasoft.dao.RoleDao;
import com.chinasoft.domain.UserInfo;
import com.chinasoft.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Autowired
    private RoleDao roleDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        // 需要给该对象提供username password authorities
        UserInfo userInfo = loginDao.findUserByName(username);
        String roleName = roleDao.findRoleNameById(userInfo.getRole());
        System.out.println("aaaaaaa"+userInfo.getName()+"  "+userInfo.getPassword()+"  "+userInfo.getRole());
        User user = new User(userInfo.getName(),userInfo.getPassword(),true,true,true,true,getAuthority(roleName));
        return user;
    }


    public List<SimpleGrantedAuthority> getAuthority(String roleName){
        ArrayList<SimpleGrantedAuthority> list = new ArrayList<>();
        list.add(new SimpleGrantedAuthority("ROLE_"+roleName));
        return list;
    }
}
