@Service
public class Testing {

@Autowired
private IntegrationRestService integrationRestService;

public static void main(String args[])  {
    final AbstractApplicationContext context = new ClassPathXmlApplicationContext("/app-context.xml");
    Testing t = context.getBean(Testing.class);
    t.checkNull();
}

private void checkNull() {
    if(integrationRestService == null) System.err.println("FAIL...");
    else System.out.println("SUCCESS!");
}

}