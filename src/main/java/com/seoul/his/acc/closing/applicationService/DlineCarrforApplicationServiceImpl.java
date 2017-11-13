package com.seoul.his.acc.closing.applicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seoul.his.acc.elementary.dao.AccPridDAO;
import com.seoul.his.acc.elementary.to.AccPridBean;

@Service
public class DlineCarrforApplicationServiceImpl implements DlineCarrforApplicationService{
    @Autowired
    AccPridDAO accPridDAO;

    @Override
    public void modifyDlineYn(AccPridBean accPrid) {
        accPridDAO.updateAccPridDline(accPrid);
    }

    @Override
    public void executeCarrfor(AccPridBean accPrid) {
        accPridDAO.callCarrfor(accPrid);
    }

}
