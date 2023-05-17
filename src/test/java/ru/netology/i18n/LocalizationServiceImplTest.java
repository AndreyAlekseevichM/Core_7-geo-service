package ru.netology.i18n;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;


public class LocalizationServiceImplTest {
    @Test
    public void localizationTest() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String result = localizationService.locale(Country.USA);
        String expected = "Welcome";
        Assertions.assertEquals(expected, result);
    }
}