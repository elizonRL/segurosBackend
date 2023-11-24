# segurosBackend
Este Proyectp utiliza sping boot para ser ejecutado, Desarrollado en java ☕
utiliza mySQL para persistencia de datos con las siginetes tablas:
`cleinte`, `poliza`, `vehiculo`, la consulta se realiza por medio del sigiente pocedimento al mecenado `delimiter $$
CREATE PROCEDURE obtener_poliza_por_numero(IN num_poliza VARCHAR(255))
BEGIN
  SELECT
    pc.*,
    v.marca,
    v.modelo,
    v.placa
  FROM (
    SELECT *
    FROM poliza
    WHERE num_poliza = num_poliza
  ) pc
  JOIN poliza_vehiculo pv ON pc.id = pv.poliza_id
  JOIN vehiculo v ON pv.vehiculo_id = v.id;
END$$` el nombre de la base de datos es `mydb`
