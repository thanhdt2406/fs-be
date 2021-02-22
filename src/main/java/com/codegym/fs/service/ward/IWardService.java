package com.codegym.fs.service.ward;

import com.codegym.fs.model.Ward;
import com.codegym.fs.service.IGeneralService;

public interface IWardService extends IGeneralService<Ward> {
    Iterable<Ward> findAllByDistrictId(Long id);
}
