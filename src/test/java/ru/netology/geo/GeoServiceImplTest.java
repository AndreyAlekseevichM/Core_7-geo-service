package ru.netology.geo;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Location;

public class GeoServiceImplTest {
    @Test
    public void IpTest() {
        GeoService geoService = new GeoServiceImpl();
        Location result = geoService.byIp("172.0.32.11");
        Assertions.assertNotNull(String.valueOf(result));
    }
}