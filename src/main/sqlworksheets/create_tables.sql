CREATE TABLE USUARIO(
    id              NUMBER(20)      NOT NULL,
    clave           VARCHAR2(20)    NOT NULL,
    nombre          VARCHAR2(30)    NOT NULL,
    apellidos       VARCHAR2(50)    NOT NULL,
    usuario         VARCHAR2(20)    NOT NULL,
    CONSTRAINT usuario_pk           PRIMARY KEY(id)
);

CREATE TABLE PACIENTE(
    id              NUMBER(20)      NOT NULL,
    nss             VARCHAR2(11)    NOT NULL,
    num_tarjeta     VARCHAR2(30)    NOT NULL,
    telefono        VARCHAR2(9)     NOT NULL,
    direccion       VARCHAR2(100)   NOT NULL,
    CONSTRAINT paciente_pk          PRIMARY KEY(id),
    CONSTRAINT pac_usuario_fk       FOREIGN KEY(id)             REFERENCES USUARIO(id)  ON DELETE CASCADE
);

CREATE TABLE MEDICO(
    id              NUMBER(20)      NOT NULL,
    num_colegiado   VARCHAR2(9)     NOT NULL,
    CONSTRAINT medico_pk            PRIMARY KEY(id),
    CONSTRAINT med_usuario_fk       FOREIGN KEY(id)             REFERENCES USUARIO(id)  ON DELETE CASCADE
);

CREATE TABLE MEDICO_PACIENTE(
    medico          NUMBER(20)      NOT NULL,
    paciente        NUMBER(20)      NOT NULL,
    CONSTRAINT med_pac_pk           PRIMARY KEY(medico, paciente),
    CONSTRAINT med_pac_fk_med       FOREIGN KEY(medico)         REFERENCES MEDICO(id)   ON DELETE CASCADE,
    CONSTRAINT med_pac_fk_pac       FOREIGN KEY(paciente)       REFERENCES PACIENTE(id) ON DELETE CASCADE
);

CREATE TABLE DIAGNOSTICO(
    id              NUMBER(20)      NOT NULL,
    valoracion_esp  VARCHAR2(200)   NOT NULL,
    enfermedad      VARCHAR2(50)    NOT NULL,
    CONSTRAINT diag_pk              PRIMARY KEY(id)
);

CREATE TABLE CITA(
    id              NUMBER(20)      NOT NULL,
    fecha_hora      TIMESTAMP(2)    NOT NULL,
    motivo_cita     VARCHAR2(500)   NOT NULL,
    medico          NUMBER(20)      NOT NULL,
    paciente        NUMBER(20)      NOT NULL,
    diagnostico     NUMBER(20)      ,
    CONSTRAINT cita_pk              PRIMARY KEY(id),
    CONSTRAINT cita_medico_fk       FOREIGN KEY(medico)         REFERENCES MEDICO(id)   ON DELETE CASCADE,
    CONSTRAINT cita_paciente_fk     FOREIGN KEY(paciente)       REFERENCES PACIENTE(id) ON DELETE CASCADE,
    CONSTRAINT cita_diagnostico_fk  FOREIGN KEY(diagnostico)    REFERENCES DIAGNOSTICO(id)
);
