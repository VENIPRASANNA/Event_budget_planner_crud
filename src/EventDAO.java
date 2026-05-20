import java.sql.*;

public class EventDAO {

    public static void insert(Event e) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO events(event_name, date, venue, budget) VALUES (?, ?, ?, ?)");
            stmt.setString(1, e.getEventName());
            stmt.setString(2, e.getDate());
            stmt.setString(3, e.getVenue());
            stmt.setDouble(4, e.getBudget());
            stmt.executeUpdate();
            System.out.println("Event added successfully");
        } catch (Exception ex) { System.out.println(ex); }
    }

    public static void display() {
        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM events");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getString(4)+" | "+rs.getDouble(5));
            }
        } catch (Exception ex) { System.out.println(ex); }
    }

    public static void update(int id, double newBudget) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement("UPDATE events SET budget=? WHERE id=?");
            stmt.setDouble(1, newBudget);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("Updated Successfully");
        } catch (Exception ex) { System.out.println(ex); }
    }

    public static void delete(int id) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement("DELETE FROM events WHERE id=?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Deleted Successfully");
        } catch (Exception ex) { System.out.println(ex); }
    }
}
