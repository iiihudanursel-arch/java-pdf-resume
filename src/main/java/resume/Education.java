
package resume;

public class Education {
    private String schoolName;
    private String department;
    private String startYear;
    private String graduationYear;

    public Education(String schoolName, String department,
                     String startYear, String graduationYear) {
        this.schoolName = schoolName;
        this.department = department;
        this.startYear = startYear;
        this.graduationYear = graduationYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getDepartment() {
        return department;
    }

    public String getStartYear() {
        return startYear;
    }

    public String getGraduationYear() {
        return graduationYear;
    }
}
