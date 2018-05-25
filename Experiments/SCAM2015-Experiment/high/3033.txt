@Service
@Configurable
public class MileageFeeCalculator {

    @Autowired
    private MileageRateService rateService;

    public float mileageCharge(final int miles) {
        return (miles * rateService.ratePerMile());
    }
}