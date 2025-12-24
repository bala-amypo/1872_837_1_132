@Entity
public class SkillMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Skill skill;

    @ManyToOne
    private UserProfile user;

    private String matchStatus;

    public Long getId() { return id; }
    public Skill getSkill() { return skill; }
    public UserProfile getUser() { return user; }
    public String getMatchStatus() { return matchStatus; }

    public void setSkill(Skill skill) { this.skill = skill; }
    public void setUser(UserProfile user) { this.user = user; }
    public void setMatchStatus(String matchStatus) { this.matchStatus = matchStatus; }
}
