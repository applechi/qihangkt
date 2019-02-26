package cn.ybzy.qihangkt.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import cn.ybzy.qihangkt.model.User;

public interface UserService extends BaseService<User> {

	void addUser(User user, Integer[] roleIds);
	
	/**
	 * 获取所有的用户记录信息，实现关联查询，关联role
	 * @return
	 */
	List<User> selectRelevanceUsers();
	
	public PageInfo<User> selectUsersByPager(int pageNum,int pageSize);
	
	public User selectRelUserByUid(Integer uid);

	void updateUser(User user, Integer[] roleIds);

	void deleteByUidRelRole(Integer id);

	void batchDelUsersByIds(Integer[] uidArr);

	PageInfo<User> selectUsersBySearchPage(int pageNum, int pageSize,String userInfo);

	User login(String userInfo, String password);
	
	
}
