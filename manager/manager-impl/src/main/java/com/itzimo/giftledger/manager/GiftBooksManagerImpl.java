package com.itzimo.giftledger.manager;

import com.itzimo.giftledger.common.exception.ResourceNotFoundException;
import com.itzimo.giftledger.manager.api.GiftBooksManager;
import com.itzimo.giftledger.manager.api.dto.GiftBooksDTO;
import com.itzimo.giftledger.manager.mapping.GiftBooksMapping;
import com.itzimo.giftledger.repository.api.entity.GiftBooksDO;
import com.itzimo.giftledger.repository.api.service.GiftBooksService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 礼薄管理服务实现
 *
 * @author zimo
 * @date 2025/04/23
 */
@Component
public class GiftBooksManagerImpl implements GiftBooksManager {
    @Resource
    private GiftBooksService giftBooksService;

    @Override
    public Long create(GiftBooksDTO dto) {
        GiftBooksDO instance = GiftBooksMapping.INSTANCE.toDO(dto);
        instance.setUserId(1L);
        if (giftBooksService.save(instance)) {
            return instance.getId();
        }
        return 0L;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(GiftBooksDTO dto) {
        GiftBooksDO instance = giftBooksService.getById(dto.getId());
        if (Objects.isNull(instance)) {
            throw new ResourceNotFoundException();
        }
        GiftBooksDO updatedInstance = GiftBooksMapping.INSTANCE.toDO(dto);
        updatedInstance.setId(instance.getId());
        giftBooksService.updateById(updatedInstance);
    }

    @Override
    public GiftBooksDTO get(Long id) {
        GiftBooksDO instance = giftBooksService.getById(id);
        if (Objects.isNull(instance)) {
            throw new ResourceNotFoundException();
        }
        return GiftBooksMapping.INSTANCE.toDTO(instance);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(Long id) {
        GiftBooksDO instance = giftBooksService.getById(id);
        if (Objects.nonNull(instance)) {
            throw new ResourceNotFoundException();
        }
        giftBooksService.removeById(id);
    }
}
