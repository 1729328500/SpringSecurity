package top.whyh.service.impl;

import top.whyh.entity.User;
import top.whyh.mapper.UserMapper;
import top.whyh.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author whyh
 * @since 2024-11-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
