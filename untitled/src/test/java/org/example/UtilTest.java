package org.example;

import org.junit.jupiter.api.*;
/*
  @author   Dtest
  @project   untitled
  @class  UtilTest
  @version  1.0.0
  @since 15.02.2024 - 19.24
*/
class UtilTest {

    @BeforeAll
    static void init(){

    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void bye(){

    }

    @Test
    void whenRomanStringIsEmptyThenThrowsException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Util.convertRomanToArabic("");
        });
        Assertions.assertEquals("Not a valid Roman Numeral", exception.getMessage());
    }

    @Test
    void whenRomanStringIsNullThenThrowsException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Util.convertRomanToArabic(null);
        });
        Assertions.assertEquals("Not a valid Roman Numeral", exception.getMessage());
    }

    @Test
    void whenRomanStringIsTrashThenThrowsException() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Util.convertRomanToArabic("gfhrdht");
        });
        Assertions.assertEquals("Not a valid Roman Numeral", exception.getMessage());
    }

    @Test
    void whenRoman_I_Then_Arabic_1() {
        Assertions.assertEquals(1, Util.convertRomanToArabic("I"));
    }

    @Test
    void whenRoman_III_Then_Arabic_3() {
        Assertions.assertEquals(3, Util.convertRomanToArabic("III"));
    }

    @Test
    void whenRoman_IV_Then_Arabic_4() {
        Assertions.assertEquals(4, Util.convertRomanToArabic("IV"));
    }

    @Test
    void whenRoman_V_Then_Arabic_5() {
        Assertions.assertEquals(5, Util.convertRomanToArabic("V"));
    }

    @Test
    void whenRoman_IX_Then_Arabic_9() {
        Assertions.assertEquals(9, Util.convertRomanToArabic("IX"));
    }

    @Test
    void whenRoman_X_Then_Arabic_10() {
        Assertions.assertEquals(10, Util.convertRomanToArabic("X"));
    }

    @Test
    void whenRoman_XIV_Then_Arabic_14() {
        Assertions.assertEquals(14, Util.convertRomanToArabic("XIV"));
    }

    @Test
    void whenRoman_XV_Then_Arabic_15() {
        Assertions.assertEquals(15, Util.convertRomanToArabic("XV"));
    }

    @Test
    void whenRoman_XIX_Then_Arabic_19() {
        Assertions.assertEquals(19, Util.convertRomanToArabic("XIX"));
    }

    @Test
    void whenRoman_XX_Then_Arabic_20() {
        Assertions.assertEquals(20, Util.convertRomanToArabic("XX"));
    }

    @Test
    void whenRoman_XL_Then_Arabic_40() {
        Assertions.assertEquals(40, Util.convertRomanToArabic("XL"));
    }

    @Test
    void whenRoman_L_Then_Arabic_50() {
        Assertions.assertEquals(50, Util.convertRomanToArabic("L"));
    }

    @Test
    void whenRoman_XC_Then_Arabic_90() {
        Assertions.assertEquals(90, Util.convertRomanToArabic("XC"));
    }

    @Test
    void whenRoman_C_Then_Arabic_100() {
        Assertions.assertEquals(100, Util.convertRomanToArabic("C"));
    }

    @Test
    void whenRoman_CXL_Then_Arabic_140() {
        Assertions.assertEquals(140, Util.convertRomanToArabic("CXL"));
    }

    @Test
    void whenRoman_CL_Then_Arabic_150() {
        Assertions.assertEquals(150, Util.convertRomanToArabic("CL"));
    }

    @Test
    void whenRoman_CXC_Then_Arabic_190() {
        Assertions.assertEquals(190, Util.convertRomanToArabic("CXC"));
    }

    @Test
    void whenRoman_CC_Then_Arabic_200() {
        Assertions.assertEquals(200, Util.convertRomanToArabic("CC"));
    }

    @Test
    void whenRoman_CD_Then_Arabic_400() {
        Assertions.assertEquals(400, Util.convertRomanToArabic("CD"));
    }

    @Test
    void whenRoman_CDXCIX_Then_Arabic_499() {
        Assertions.assertEquals(499, Util.convertRomanToArabic("CDXCIX"));
    }

    @Test
    void whenRoman_D_Then_Arabic_500() {
        Assertions.assertEquals(500, Util.convertRomanToArabic("D"));
    }

    @Test
    void whenRoman_CM_Then_Arabic_900() {
        Assertions.assertEquals(900, Util.convertRomanToArabic("CM"));
    }

    @Test
    void whenRoman_CMXCIX_Then_Arabic_999() {
        Assertions.assertEquals(999, Util.convertRomanToArabic("CMXCIX"));
    }

    @Test
    void whenRoman_M_Then_Arabic_1000() {
        Assertions.assertEquals(1000, Util.convertRomanToArabic("M"));
    }

    @Test
    void whenRoman_MCD_Then_Arabic_1400() {
        Assertions.assertEquals(1400, Util.convertRomanToArabic("MCD"));
    }

    @Test
    void whenRoman_MD_Then_Arabic_1500() {
        Assertions.assertEquals(1500, Util.convertRomanToArabic("MD"));
    }

    @Test
    void whenRoman_MCM_Then_Arabic_1900() {
        Assertions.assertEquals(1900, Util.convertRomanToArabic("MCM"));
    }

    @Test
    void whenRoman_MM_Then_Arabic_2000() {
        Assertions.assertEquals(2000, Util.convertRomanToArabic("MM"));
    }

    @Test
    void whenRoman_MMCD_Then_Arabic_2400() {
        Assertions.assertEquals(2400, Util.convertRomanToArabic("MMCD"));
    }

    @Test
    void whenRoman_MMCM_Then_Arabic_2900() {
        Assertions.assertEquals(2900, Util.convertRomanToArabic("MMCM"));
    }

    @Test
    void whenRoman_MMM_Then_Arabic_3000() {
        Assertions.assertEquals(3000, Util.convertRomanToArabic("MMM"));
    }

    @Test
    void whenRoman_MMMCCX_Then_Arabic_3210() {
        Assertions.assertEquals(3210, Util.convertRomanToArabic("MMMCCX"));
    }

    @Test
    void whenRoman_MMMCD_Then_Arabic_3400() {
        Assertions.assertEquals(3400, Util.convertRomanToArabic("MMMCD"));
    }

    @Test
    void whenRoman_MMMD_Then_Arabic_3500() {
        Assertions.assertEquals(3500, Util.convertRomanToArabic("MMMD"));
    }

    @Test
    void whenRoman_MMMCM_Then_Arabic_3900() {
        Assertions.assertEquals(3900, Util.convertRomanToArabic("MMMCM"));
    }


    @Test
    void whenRoman_MMMCMXCIX_Then_Arabic_3999() {
        Assertions.assertEquals(3999, Util.convertRomanToArabic("MMMCMXCIX"));
    }

    @Test
    void whenRoman_MMMMMCMXCIX_Then_Arabic_Exception() {
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Util.convertRomanToArabic("MMMMMCMXCIX");
        });
        Assertions.assertEquals("Roman numeral should be less than or equal to 3999", exception.getMessage());
    }
}


