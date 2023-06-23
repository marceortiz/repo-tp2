package ar.edu.unju.fi.service;

import java.util.List;

import ar.edu.unju.fi.entity.Provincia;

public interface IProvinciaService {

    //#region Methods
    public List<Provincia> getProvincias();

    public void saveNewProvincia(Provincia provinciaAgregar);

    public Provincia findProvinciaByIdentifier(Long identificador);

    // public void modifyProvinciaByIdentifier(Provincia provinciaModificar);

    public void deleteProvinciaByIdentifier(Provincia provinciaEliminar);
    
    public Provincia getProvincia();
    //#endregion

}