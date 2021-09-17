package com.metaenlace.services;

import java.util.List;

import com.metaenlace.model.Diagnostico;

public interface IDiagnosticoService {

	public List<Diagnostico> GetAllDiagnosticos();

    public Diagnostico GetDiagnosticoById(Long id);

    public Diagnostico AddDiagnostico(Diagnostico diagnostico);

    public Diagnostico DeleteDiagnostico(Long id);
}
