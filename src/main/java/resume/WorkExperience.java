
package resume;

public class WorkExperience {
    private String companyName;
    private String jobTitle;
    private String startDate;
    private String endDate;
    private String description;

    public WorkExperience(String companyName, String jobTitle,
                          String startDate, String endDate,
                          String description) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }
}

