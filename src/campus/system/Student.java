package campus.system;

import static campus.system.RunSystem.*;
import java.sql.SQLException;

public class Student extends Person {

    private int id;

    Student(int ID) {
        id = ID;
    }

    private void searchStudent() throws SQLException {
        String sqlStudent = sql + "student";
        Rs = stmt.executeQuery(sqlStudent);
        while (Rs.next()) {
            if (id == (Rs.getInt("id"))) {

                break;
            }
        }
    }

    public String ShowStudentName() throws SQLException {
        searchStudent();
        return Rs.getString("NAME");
    }

    public String ShowFirstCOURSEName() throws SQLException {
        searchStudent();
        int COURSE1id = Rs.getInt("COURSE1ID");
        searchCourse(COURSE1id);
        return Rs.getString("NAME");

    }

    public String ShowFirstCourseBooklet() throws SQLException {
        searchStudent();
        int COURSE1id = Rs.getInt("COURSE1ID");
        searchCourse(COURSE1id);
        return Rs.getString("BOOKLET");
    }

    public String ShowFirstCourseVideo() throws SQLException {
        searchStudent();
        int COURSE1id = Rs.getInt("COURSE1ID");
        searchCourse(COURSE1id);
        return Rs.getString("VIDEO");
    }

    public String ShowFirstCourseBookletSOLUTION() throws SQLException {
        searchStudent();
        int COURSE1id = Rs.getInt("COURSE1ID");
        searchCourse(COURSE1id);
        return Rs.getString("TESTSOLUTION");
    }

    public String ShowFirstCourseDay() throws SQLException {
        searchStudent();
        int COURSE1id = Rs.getInt("COURSE1ID");
        searchCourse(COURSE1id);
        return Rs.getString("DATE");
    }

    public String ShowFirstCourseTime() throws SQLException {
        searchStudent();
        int COURSE1id = Rs.getInt("COURSE1ID");
        searchCourse(COURSE1id);
        return Rs.getString("TIME");
    }

    public double ShowFirstCourseMark() throws SQLException {
        searchStudent();
        int COURSE1id = Rs.getInt("COURSE1ID");
        GetStudentCourse(COURSE1id);
        return Rs.getDouble("MARK");
    }

    public String ShowSecondCourseName() throws SQLException {
        searchStudent();
        int COURSE2id = Rs.getInt("COURSE2ID");
        searchCourse(COURSE2id);
        return Rs.getString("NAME");

    }

    public String ShowSecondCourseBooklet() throws SQLException {
        searchStudent();
        int COURSE2id = Rs.getInt("COURSE2ID");
        searchCourse(COURSE2id);
        return Rs.getString("BOOKLET");
    }

    public String ShowSecondCourseVideo() throws SQLException {
        searchStudent();
        int COURSE2id = Rs.getInt("COURSE2ID");
        searchCourse(COURSE2id);
        return Rs.getString("VIDEO");
    }

    public String ShowSecondCourseBookletSOLUTION() throws SQLException {
        searchStudent();
        int COURSE2id = Rs.getInt("COURSE2ID");
        searchCourse(COURSE2id);
        return Rs.getString("TESTSOLUTION");
    }

    public String ShowSecondCourseDay() throws SQLException {
        searchStudent();
        int COURSE2id = Rs.getInt("COURSE2ID");
        searchCourse(COURSE2id);
        return Rs.getString("DATE");
    }

    public String ShowSecondCourseTime() throws SQLException {
        searchStudent();
        int COURSE2id = Rs.getInt("COURSE2ID");
        searchCourse(COURSE2id);
        return Rs.getString("TIME");
    }

    public double ShowSecondCourseMark() throws SQLException {
        searchStudent();
        int COURSE2id = Rs.getInt("COURSE2ID");
        GetStudentCourse(COURSE2id);
        return Rs.getDouble("MARK");
    }

    private void GetStudentCourse(int courseId) throws SQLException {
        String sqlMarks = sql + "mark";
        Rs = stmt.executeQuery(sqlMarks);
        Rs.absolute(0);
        while (Rs.next()) {
            if (id == (Rs.getInt("id"))) {
                if (courseId == (Rs.getInt("COURSEID"))) {
                    break;

                }
            }
        }

    }

}
