@RestController
@RequestMapping("/api/skills")
public class SkillController {

    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    public List<Skill> list() {
        return skillService.getAllSkills();
    }

    public Skill update(Long id, Skill skill) {
        return skillService.update(id, skill);
    }
}
