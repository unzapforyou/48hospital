package com.seoul.his.acc.closing.applicationService;

import com.seoul.his.acc.elementary.to.AccPridBean;

public interface DlineCarrforApplicationService {

    void modifyDlineYn(AccPridBean accPrid);

    void executeCarrfor(AccPridBean accPrid);

}
