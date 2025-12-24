@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 👇 TEST EXPECTS THIS FIELD
    private String body;

    private String category;
    private String experienceLevel;
    private boolean active = true;
    private String status;

    public Skill() {}

    // ===== REQUIRED GETTERS =====
    public Long getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getCategory() {
        return category;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public String getStatus() {
        return status;
    }

    public boolean isActive() {
        return active;
    }

    // ===== SETTERS =====
    public void setId(Long id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
