
package resume;

import java.util.List;

public class Resume {
    private String fullName;
    private String title;
    private String email;
    private String phone;
    private String address;
    private String summary;
    private String photoPath;
    private Education education;
    private List<WorkExperience> workExperiences;
    private List<String> skills;
    private List<String> languages;

    public Resume(String fullName, String title, String email,
                  String phone, String address, String summary,
                  String photoPath, Education education,
                  List<WorkExperience> workExperiences,
                  List<String> skills, List<String> languages) {
        this.fullName = fullName;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.summary = summary;
        this.photoPath = photoPath;
        this.education = education;
        this.workExperiences = workExperiences;
        this.skills = skills;
        this.languages = languages;
    }

    public String getFullName() {
        return fullName;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getSummary() {
        return summary;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public Education getEducation() {
        return education;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public List<String> getSkills() {
        return skills;
    }

    public List<String> getLanguages() {
        return languages;
    }
}

