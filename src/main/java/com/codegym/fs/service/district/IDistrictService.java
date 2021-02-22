package com.codegym.fs.service.district;

import com.codegym.fs.model.District;
import com.codegym.fs.service.IGeneralService;

public interface IDistrictService extends IGeneralService<District> {
    Iterable<District> findAllByProvinceId(Long id);
}
