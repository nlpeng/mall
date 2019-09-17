package com.nlpeng.mall.dto;

import com.nlpeng.mall.model.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author Ferry NLP
 * @create 2019-09-17
 * @see
 * @since 1.0v9/30.
 */
public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
