package com.itzimo.giftledger.manager.api;

import com.itzimo.giftledger.manager.api.dto.GiftBooksDTO;

/**
 * 礼薄管理服务接口
 *
 * @author zimo
 * @date 2025/04/23
 */
public interface GiftBooksManager {
    /**
     * 创建
     *
     * @param dto dto
     * @return {@link Long }
     */
    Long create(GiftBooksDTO dto);

    /**
     * 更新
     *
     * @param dto dto
     */
    void update(GiftBooksDTO dto);

    /**
     * 获取
     *
     * @param id id
     * @return {@link GiftBooksDTO }
     */
    GiftBooksDTO get(Long id);

    /**
     * 删除
     *
     * @param id id
     */
    void delete(Long id);
}
