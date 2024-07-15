package com.example.targetconge.Services;

import com.example.targetconge.entity.ServiceComptable;

import java.util.List;

public interface IServiceComptableService {
    ServiceComptable ajoutServiceComptable(ServiceComptable serviveC);
    ServiceComptable updateServiceComptable(ServiceComptable serviveC);

    void deleteSServiceComptableById(long numerCom);
    ServiceComptable findServiceComptableById (long numerCom);
    List<ServiceComptable> findAllServiceComptable ();
}
