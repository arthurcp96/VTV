package com.example.PruebaVTV.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.PruebaVTV.connectors.Connector;
import com.example.PruebaVTV.entities.Auto;

public class AutoRepository {
    private Connection conn = Connector.getConnection();
    
    public void save(Auto auto) {
        if(auto == null) return;
        try (PreparedStatement ps = conn.prepareStatement(
            "insert into autos (dominio, marca, modelo, nombrePropietario, fechaVencimiento) values (?,?,?,?,?)",
             PreparedStatement.RETURN_GENERATED_KEYS)) {
        ps.setString(1, auto.getDominio());
        ps.setString(2, auto.getMarca());
        ps.setString(3, auto.getModelo());
        ps.setString(4, auto.getNombrePropietario());
        ps.setInt(5, auto.getFechaVencimiento());
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next())
            auto.setId(rs.getInt(1));
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
