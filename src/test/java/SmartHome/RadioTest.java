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

    @Test

    // увеличить громкость больше Max;

    public void increaseVolumeMoreMax() {
        radio.setCurrentVolume(100);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    //убавить громкость;

    public void decreaseVolume() {
        radio.setCurrentVolume(8);
        radio.volumeDown();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    //убавить громкость меньше Min;

    public void decreaseVolumeLessMin() {
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    //выбор станции;

    public void setStation() {
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    //выбор станции больше Max;

    public void setStationMoreMax() {
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    //выбор станции меньше Min;

    public void setStationLessMin() {
        radio.setCurrentRadioStation(-1);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test

    //следующая станция;

    public void nextStation() {
        radio.setCurrentRadioStation(3);
        radio.next();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    //следующая станция после Max;

    public void nextStationAfterMax() {
        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    //предыдущая станция;

    public void prevStation() {
        radio.setCurrentRadioStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    //предыдущая станция после Min;

    public void prevStationAfterMin() {
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}