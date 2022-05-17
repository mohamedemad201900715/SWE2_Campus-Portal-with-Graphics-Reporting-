package campus.system;

import static campus.system.RunSystem.*;
import java.sql.SQLException;

public class professor extends Person {

    private int id;

    professor(int Id) {
        this.id = Id;
    }

    public int GetProfessorCourse() throws SQLException {
        int CourseId = 0;
        String sqlProfessor = sql + "professor";
        Rs = stmt.executeQuery(sqlProfessor);
        Rs.absolute(0);
        while (Rs.next()) {
            if (id == (Rs.getInt("id"))) {
                CourseId = Rs.getInt("COURSEID");

                return CourseId;
            }
        }
        return 0;
    }

    public void InsertBookletLink(String BookletLink) throws SQLException {
        int CourseId = GetProfessorCourse();
        if (CourseId != 0) {
            String sqlcourses = sql + "courses";
            Rs = stmt.executeQuery(sqlcourses);
            Rs.absolute(0);
            while (Rs.next()) {
                if (CourseId == (Rs.getInt("id"))) {
                    Rs.updateString(3, BookletLink);
                    Rs.updateRow();
                    break;
                }
            }
        }

    }

    public void InsertBookletSolutionLink(String TestSolutionLink) throws SQLException {
        int CourseId = GetProfessorCourse();
        if (CourseId != 0) {
            String sqlcourses = sql + "courses";
            Rs = stmt.executeQuery(sqlcourses);
            Rs.absolute(0);
            while (Rs.next()) {
                if (CourseId == (Rs.getInt("id"))) {
                    Rs.updateString(5, TestSolutionLink);
                    Rs.updateRow();
                    break;
                }
            }
        }

    }

    public void InsertVideoLink(String VideoLink) throws SQLException {
        int CourseId = GetProfessorCourse();
        if (CourseId != 0) {
            String sqlcourses = sql + "courses";
            Rs = stmt.executeQuery(sqlcourses);
            Rs.absolute(0);
            while (Rs.next()) {
                if (CourseId == (Rs.getInt("id"))) {
                    Rs.updateString(4, VideoLink);
                    Rs.updateRow();
                    break;
                }
            }
        }

    }

    public void InsertMark(int StudentId, double Marks) throws SQLException {
        int CourseId = GetProfessorCourse();
        if (CourseId != 0) {
            String sqlMarks = sql + "mark";
            Rs = stmt.executeQuery(sqlMarks);
            Rs.absolute(0);
            while (Rs.next()) {
                if (StudentId == (Rs.getInt("id"))) {
                    if (CourseId == (Rs.getInt("COURSEID"))) {
                        Rs.updateDouble(3, Marks);
                        Rs.updateRow();
                        break;
                    }
                }
            }

        }

    }

}
