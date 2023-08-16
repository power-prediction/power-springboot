@RestController
@RequestMapping("/api/powerinfo")
public class Power_Controller {
    @Autowired
    private Power_Repository power_repository;
    
    @PostMapping
    public Power_Repository createdb(@RequestBody Power powerinfo) {
        return power_repository.save(powerinfo);
    }
}

