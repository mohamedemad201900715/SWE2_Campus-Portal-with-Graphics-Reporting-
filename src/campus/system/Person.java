package campus.system;

import static campus.system.RunSystem.*;

import java.sql.SQLException;

public class Person extends course {

    public void SetPoineterStudentTable() throws SQLException {
        String sqlStudent = sql + "student";
        Rs = stmt.executeQuery(sqlStudent);
    }

    public void SetPoineterCoursesTable() throws SQLException {
        String sqlStudent = sql + "COURSES";
        Rs = stmt.executeQuery(sqlStudent);
    }

    public void SetPoineterStudentMarkTable() throws SQLException {
        String sqlStudent = sql + "MARK";
        Rs = stmt.executeQuery(sqlStudent);
    }

    public void SetPoineterProfessorsTable() throws SQLException {
        String sqlStudent = sql + "PROFESSOR";
        Rs = stmt.executeQuery(sqlStudent);
    }

}
