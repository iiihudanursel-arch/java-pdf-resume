
package resume;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Education education = new Education(
                "Kırklareli University",
                "Software Engineering",
                "2025",
                "2029"
        );

        WorkExperience job1 = new WorkExperience(
                "Yapi Kredi Bankasi",
                "Software Engineer",
                "June 2029",
                "August 2029",
                "Worked on banking software and application development."
        );

        WorkExperience job2 = new WorkExperience(
                "Google",
                "Software Development Engineer",
                "June 2030",
                "August 2030",
                "Contributed to software development and testing."
        );

        WorkExperience job3 = new WorkExperience(
                "Kuveyt Türk Bankasi",
                "Software Engineer",
                "June 2031",
                "August 2031",
                "Worked on financial software systems and bug fixing."
        );

        List<WorkExperience> experiences =
                Arrays.asList(job1, job2, job3);

        List<String> skills = Arrays.asList(
                "Java",
                "C",
                "Object-Oriented Programming",
                "Problem Solving"
        );

        List<String> languages = Arrays.asList(
                "Turkish - Native",
                "English - Intermediate"
        );

        Resume resume = new Resume(
                "Huda Nur Sel",
                "Software Engineer",
                "huda@example.com",
                "+90 555 000 00 00",
                "Istanbul, Turkey",
                "Motivated software engineering professional interested in "
                        + "software development, problem solving and technology.",
                "image/pp/im1.jpg",
                education,
                experiences,
                skills,
                languages
        );

        PdfGenerator generator = new PdfGenerator();
        generator.generate(resume, "output/resume.pdf");
    }
}
