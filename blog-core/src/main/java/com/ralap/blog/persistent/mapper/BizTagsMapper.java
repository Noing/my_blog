package com.ralap.blog.persistent.mapper;

import com.ralap.blog.bussiness.vo.TagsConditionVO;
import com.ralap.blog.persistent.beans.BizTags;
import com.ralap.blog.plugin.BaseMapper;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface BizTagsMapper extends BaseMapper<BizTags> {

    List<BizTags> findPageBreakByCondition(TagsConditionVO vo);

}