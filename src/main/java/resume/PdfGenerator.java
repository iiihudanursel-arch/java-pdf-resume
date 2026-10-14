
package resume;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Image;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Element;
import com.lowagie.text.pdf.PdfWriter;


public class PdfGenerator {

    public void generate(Resume resume, String outputPath) {
        Document document = new Document();

        try {
            File outputFile = new File(outputPath);
            Files.createDirectories(outputFile.toPath().getParent());

            PdfWriter.getInstance(
                    document,
                    new FileOutputStream(outputFile)
            );

            document.open();

            Font titleFont = FontFactory.getFont(
                    FontFactory.HELVETICA, 20, Font.BOLD
            );

            Font headingFont = FontFactory.getFont(
                    FontFactory.HELVETICA, 14, Font.BOLD
            );

            Font normalFont = FontFactory.getFont(
                    FontFactory.HELVETICA, 11, Font.NORMAL
            );

            Paragraph title = new Paragraph(
                    resume.getFullName(), titleFont
            );
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);

            Paragraph jobTitle = new Paragraph(
                    resume.getTitle(), normalFont
            );
            jobTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(jobTitle);

            document.add(new Paragraph(" "));

            File photo = new File(resume.getPhotoPath());

            if (photo.exists()) {
                Image image = Image.getInstance(
                        resume.getPhotoPath()
                );
                image.scaleToFit(120, 120);
                image.setAlignment(Element.ALIGN_CENTER);
                document.add(image);
            } else {
                document.add(new Paragraph(
                        "Photo not found: " + resume.getPhotoPath(),
                        normalFont
                ));
            }

            document.add(new Paragraph(" "));
            document.add(new Paragraph(
                    "CONTACT INFORMATION", headingFont
            ));
            document.add(new Paragraph(
                    "Email: " + resume.getEmail(), normalFont
            ));
            document.add(new Paragraph(
                    "Phone: " + resume.getPhone(), normalFont
            ));
            document.add(new Paragraph(
                    "Address: " + resume.getAddress(), normalFont
            ));

            document.add(new Paragraph(" "));
            document.add(new Paragraph(
                    "PROFESSIONAL SUMMARY", headingFont
            ));
            document.add(new Paragraph(
                    resume.getSummary(), normalFont
            ));

            document.add(new Paragraph(" "));
            document.add(new Paragraph(
                    "EDUCATION", headingFont
            ));

            Education education = resume.getEducation();

            document.add(new Paragraph(
                    education.getSchoolName(), normalFont
            ));
            document.add(new Paragraph(
                    education.getDepartment(), normalFont
            ));
            document.add(new Paragraph(
                    education.getStartYear() + " - "
                            + education.getGraduationYear(),
                    normalFont
            ));

            document.add(new Paragraph(" "));
            document.add(new Paragraph(
                    "WORK EXPERIENCE", headingFont
            ));

            for (WorkExperience job : resume.getWorkExperiences()) {
                document.add(new Paragraph(
                        job.getCompanyName() + " - "
                                + job.getJobTitle(),
                        headingFont
                ));

                document.add(new Paragraph(
                        job.getStartDate() + " - "
                                + job.getEndDate(),
                        normalFont
                ));

                document.add(new Paragraph(
                        job.getDescription(), normalFont
                ));

                document.add(new Paragraph(" "));
            }

            document.add(new Paragraph(
                    "TECHNICAL SKILLS", headingFont
            ));

            for (String skill : resume.getSkills()) {
                document.add(new Paragraph(
                        "- " + skill, normalFont
                ));
            }

            document.add(new Paragraph(" "));
            document.add(new Paragraph(
                    "LANGUAGES", headingFont
            ));

            for (String language : resume.getLanguages()) {
                document.add(new Paragraph(
                        "- " + language, normalFont
                ));
            }

            System.out.println(
                    "Resume PDF created: " + outputPath
            );

        } catch (Exception e) {
            System.out.println(
                    "Error creating PDF: " + e.getMessage()
            );
            e.printStackTrace();

        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }
    }
}
