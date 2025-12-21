@RestController
@RequestMapping("/api/requests")
public class SkillRequestController {

    private final SkillRequestService service;

    public SkillRequestController(SkillRequestService service) {
        this.service = service;
    }

    // ================= CREATE =================
    @PostMapping
    public SkillRequest create(@RequestBody SkillRequest request) {
        return service.createRequest(request);
    }

    // ================= READ =================
    @GetMapping("/{id}")
    public SkillRequest get(@PathVariable Long id) {
        return service.getRequest(id);
    }

    // ================= READ (FILTER) =================
    @GetMapping("/open")
    public List<SkillRequest> getOpen() {
        return service.getOpenRequests();
    }

    // ================= UPDATE =================
    @PutMapping("/{id}/status")
    public SkillRequest updateStatus(
            @PathVariable Long id,
            @RequestParam String status) {

        SkillRequest req = service.getRequest(id);
        req.setStatus(status);
        return service.createRequest(req);
    }

    // ================= DELETE =================
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteRequest(id);
    }
}
