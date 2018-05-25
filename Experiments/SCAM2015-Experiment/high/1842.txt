@Configuration
public class Cfg {
    @Bean
    public String dir() {
        return "c:/work/";
    }

    @Bean
    public String file() {
        return "file.properties";
    }

    @Bean
    public String path() {
        return dir() + file();
    }
}