@Controller
public class MileageFeeController {    
    @RequestMapping("/mileage/{miles}")
    @ResponseBody
    public float mileageFee(@PathVariable int miles) {
        MileageFeeCalculator calc = ApplicationContextHolder.getContext().getBean(MileageFeeCalculator.class);
        return calc.mileageCharge(miles);
    }
}