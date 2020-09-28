package ru.appline.framework.tests;

import org.junit.Test;
import ru.appline.framework.base.BaseClass;

public class SberTest extends BaseClass {

    @Test
    public void sberMorgageTest(){
        app.getStartPage()
                .selectMenu("Ипотека")
                .selectSubMenu("Ипотека на готовое жильё")
                .fillField("Стоимость недвижимости", "5180000")
                .fillField("Первоначальный взнос", "3058000")
                .fillField("Срок кредита", "30")
                .switchButton("Страхование жизни", "false")
                .switchButton("Молодая семья", "true")
                .checkFieldValue("Сумма кредита", "2122000")
                .checkFieldValue("Ежемесячный платеж", "16017")
                .checkFieldValue("Необходимый доход", "20618")
                .checkFieldValue("Процентная ставка", "11%");
    }
}
