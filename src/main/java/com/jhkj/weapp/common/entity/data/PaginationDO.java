package com.jhkj.weapp.common.entity.data;

import com.jhkj.weapp.common.entity.transfer.PaginationDTO;
import lombok.Data;

/**
 * @author 呉真 Kuretru < kuretru@gmail.com >
 */
@Data
public class PaginationDO {

    private Integer offset;

    private Integer limit;

    public PaginationDO(PaginationDTO dto) {
        if (dto == null) {
            return;
        }
        if (dto.getPage() != null && dto.getLimit() != null) {
            this.offset = dto.getPage() * dto.getLimit();
            this.limit = dto.getLimit();
        }
    }

    public PaginationDO() {
        super();
    }

}
