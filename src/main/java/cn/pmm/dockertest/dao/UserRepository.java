package cn.pmm.dockertest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.pmm.dockertest.entity.User;

/**
 * @author panmiaomiao
 *
 * @date 2018年4月10日
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String userName);

}
