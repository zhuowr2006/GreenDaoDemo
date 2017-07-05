package com.hema.frame.greendaodemo.bean;

import com.hema.frame.greendaodemo.Base.AFaApplication;

import java.util.List;

/**
 * Created by handsome on 2016/4/19.
 */
public class ShopDaoUtils {

    /**
     * 添加数据
     *
     * @param shop
     */
    public static void insertLove(Shop shop) {
        AFaApplication.getApplication().getDaoSession().getShopDao().insert(shop);
    }

    /**
     * 删除数据
     *
     * @param id
     */
    public static void deleteLove(long id) {
        AFaApplication.getApplication().getDaoSession().getShopDao().deleteByKey(id);
    }

    /**
     * 更新数据
     *
     * @param shop
     */
    public static void updateLove(Shop shop) {
        AFaApplication.getApplication().getDaoSession().getShopDao().update(shop);
    }

    /**
     * 查询条件为Type=TYPE_LOVE的数据
     *
     * @return
     */
    public static List<Shop> queryLove() {
        return AFaApplication.getApplication().getDaoSession().getShopDao().queryBuilder().where(ShopDao.Properties.Type.eq(Shop.TYPE_LOVE)).list();
    }
}
