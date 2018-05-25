@Controller
public class MileageFeeController {

    @Autowired
    private MileageFeeCalculator calc;

    @RequestMapping("/mileage/{miles}")
    @ResponseBody
    public float mileageFee(@PathVariable int miles) {
        return calc.mileageCharge(miles);
    }
}