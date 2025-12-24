@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private String experienceLevel;
    private String urgencyLevel;
    private boolean active;
    private String status;

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getCategory() { return category; }
    public String getExperienceLevel() { return experienceLevel; }
    public String getUrgencyLevel() { return urgencyLevel; }
    public boolean isActive() { return active; }
    public String getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setCategory(String category) { this.category = category; }
    public void setExperienceLevel(String experienceLevel) { this.experienceLevel = experienceLevel; }
    public void setUrgencyLevel(String urgencyLevel) { this.urgencyLevel = urgencyLevel; }
    public void setActive(boolean active) { this.active = active; }
    public void setStatus(String status) { this.status = status; }
}
