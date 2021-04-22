package com.inst.mall.backstage.service;

import com.inst.mall.backstage.entity.po.UmsResource;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台资源表 服务类
 * </p>
 *
 * @author aaron
 * @since 2021-04-12
 */
public interface UmsResourceService extends IService<UmsResource> {


    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();
}
