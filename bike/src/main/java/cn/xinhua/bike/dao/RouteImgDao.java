package cn.xinhua.bike.dao;

import cn.xinhua.bike.domain.RouteImg;

import java.util.List;

public interface RouteImgDao {

    /**
     * 根据route的id查询图片
     * @param rid
     * @return
     */
    public List<RouteImg> findByRid(int rid);
}
