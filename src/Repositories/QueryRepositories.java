package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Models.ConstructorMaxPoint;


public class QueryRepositories {

    String jdbcURL = "jdbc:postgresql://localhost:5432/Formula1N";
    String username = "postgres";
    String password = "admi123";

   

    public List<ConstructorMaxPoint> getConstructorsMaxPoints() {
        List<ConstructorMaxPoint> results = new ArrayList<>();

        String sql = "SELECT d.name, " +
                     "SUM(r.points) AS total_points " +
                     "FROM results as r " +
                     "JOIN constructors as d ON r.constructor_id = d.constructor_id " +
                     "GROUP BY d.name " +
                     "ORDER BY total_points DESC " +
                     "LIMIT 10;";

        try (Connection conn = DriverManager.getConnection(jdbcURL, username, password);
             PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                String constructorName = rs.getString("name");
                float points = rs.getFloat("total_points");

                ConstructorMaxPoint result = new ConstructorMaxPoint(constructorName, points);
                results.add(result);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return results;
    }
}
