package com.ralap.blog.bussiness.service;

import com.github.pagehelper.PageInfo;
import com.ralap.blog.bussiness.vo.ResourceConditionVO;
import com.ralap.blog.framework.objecct.AbstractService;
import com.ralap.blog.persistent.beans.SysResources;
import com.ralap.blog.persistent.entity.Resources;

/**
 * @author: ralap
 * @date: created at 2018/6/25 11:25
 */
public interface SysResourcesService extends AbstractService<SysResources, Long> {


    PageInfo<Resources> findPageBreakByCondition(ResourceConditionVO vo);
}
