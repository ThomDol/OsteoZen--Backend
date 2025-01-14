package org.gestion_patient.service;


import org.gestion_patient.entityDto.AntecedentsBebeDto;

public interface AntecedentsBebeService {
    AntecedentsBebeDto create(AntecedentsBebeDto antecedentBebeDto, int idPatient) throws Exception;
    AntecedentsBebeDto update(int id, AntecedentsBebeDto antecedentBebeDtoUpdated) throws Exception;
    AntecedentsBebeDto getByIdPatient(int idPatient) throws Exception;
    void deleteAntecedentBebe (int id);
}