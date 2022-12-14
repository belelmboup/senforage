package sn.isi.mapping;

import org.mapstruct.Mapper;

import sn.isi.dto.Facture;
import sn.isi.entities.FactureEntity;

@Mapper
public interface FactureMapper {
    Facture toFacture(FactureEntity facture);
    FactureEntity fromFacture(Facture facture);
}
