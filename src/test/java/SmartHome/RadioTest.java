package SmartHome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;



public class RadioTest {
    Radio radio = new Radio();

    @Test

    // увеличить громкость;

    public void increaseVolume() {
        radio.setCurrentVolume(4);
        radio.volumeUp();

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //граничные значения верхняя граница
    @Test

    public void changeVolumeHigher() {
        radio.setCurrentVolume(101);
        radio.volumeUp();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void changeVolumeBorder() {
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void changeVolumeBelow() {
        radio.setCurrentVolume(99);
        radio.volumeUp();

        int expected =99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    // граничные занчения нижняя граница
    @Test

    public void changeVolumeZero() {
        radio.setCurrentVolume(0);
        radio.volumeUp();

        int expected =0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void changeVolumeOne() {
        radio.setCurrentVolume(1);
        radio.volumeUp();

        int expected =1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void changeVolumeAnOne() {
        radio.setCurrentVolume(-1);
        radio.volumeUp();

        int expected =0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //убавить громкость;
    @Test

    public void decreaseVolume() {
        radio.setCurrentVolume(8);
        radio.volumeDown();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

   //Радио
    //выбор станции (граничные значения) верхняя граница;

    @Test

    public void setStation() {
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void setStationBelow() {
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    //выбор станции (граничные значения) нижняя граница

    @Test
    public void setStationtestzero() {
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationtestone() {
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void setStationtestmax() {
        radio.setCurrentRadioStation(14);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    //следующая станция;
    @Test

    public void nextStation() {
        radio.setCurrentRadioStation(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStationmax() {
        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextStationmin() {
        radio.setCurrentRadioStation(1);
        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //предыдущая станция;
    @Test

    public void prevStation() {
        radio.setCurrentRadioStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStationMax() {
        radio.setCurrentRadioStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void prevStationMin() {
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


}