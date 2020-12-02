package pe.edu.upc.prueba.models;

import lombok.Data;


@Data
public class ResponseDepartment {
    private Long id;
    private String name;
    private Long buildingId;
    private Long condominiumId;
    private String secretCode;
    private Integer limiteRegister;
}
