package SmartHome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {
    Radio radio = new Radio();
    Radio radio = new Radio(30);

    @Test

    // увеличить громкость;

    public void increaseVolume() {
        radio.setCurrentVolume(5);
        radio.volumeUp();
        public void shouldNextStation () {
            Radio radio = new Radio(30);
            radio.setCurrentStation(26);

            int expected = 6;
            int actual = radio.getCurrentVolume();
            radio.nextStation();

            int expected = 27;
            int actual = radio.getCurrentStation();


            Assertions.assertEquals(expected, actual);
        }

        @Test

        // увеличить громкость больше Max;

        public void increaseVolumeMoreMax () {
            radio.setCurrentVolume(100);
            radio.volumeUp();
            public void shouldNextStationAfterMax () {
                radio.setCurrentStation(29);
            }

            int expected = 100;
            int actual = radio.getCurrentVolume();
            radio.nextStation();

            int expected = 0;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        //убавить громкость;

        public void decreaseVolume () {
            radio.setCurrentVolume(8);
            radio.volumeDown();

            int expected = 7;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldNextStationDefaultRadio () {
            Radio radio = new Radio();
            radio.setCurrentStation(6);

            radio.nextStation();

            int expected = 7;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }


        @Test

        //убавить громкость меньше Min;

        public void decreaseVolumeLessMin () {
            radio.setCurrentVolume(0);
            radio.volumeDown();
            public void shouldPreviousStationBeforeMin () {
                radio.setCurrentStation(0);
            }

            int expected = 0;
            int actual = radio.getCurrentVolume();
            radio.prevStation();

            int expected = 29;
            int actual = radio.getCurrentStation();


            Assertions.assertEquals(expected, actual);
        }

        @Test

        //выбор станции;

        public void setStation () {
            radio.setCurrentRadioStation(9);
            public void shouldStationAboveMax () {
                radio.setCurrentStation(31);
            }
            radio.nextStation();
            int expected = 1;
            int actual = radio.getCurrentStation();

            int expected = 9;
            int actual = radio.getCurrentRadioStation();
            Assertions.assertEquals(expected, actual);
        }

        @Test

        //выбор станции больше Max;

        public void setStationMoreMax () {
            radio.setCurrentRadioStation(10);
            public void shouldStationBelowMin () {
                radio.setCurrentStation(-2);
            }

            radio.prevStation();
            int expected = 29;
            int actual = radio.getCurrentStation();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        //выбор станции меньше Min;

        public void setStationLessMin () {
            radio.setCurrentRadioStation(-1);
            public void shouldSpecificallyStation () {
                radio.setCurrentStation(3);
            }

            int expected = 3;
            int actual = radio.getCurrentStation();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        //следующая станция;

        public void nextStation () {
            radio.setCurrentRadioStation(3);
            radio.next();
            public void shouldIncreaseVolume () {
                radio.setCurrentVolume(8);
            }
            radio.increaseVolume();

            int expected = 9;
            int actual = radio.getCurrentStation();

            int expected = 4;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }
        @Test

        //следующая станция после Max;

        public void nextStationAfterMax () {
            radio.setCurrentRadioStation(9);
            radio.next();
            public void shouldDecreaseVolume () {
                radio.setCurrentVolume(8);
            }

            radio.decreaseVolume();

            int expected = 7;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void shouldIncreaseVolumeMax () {
            radio.setCurrentVolume(100);

            radio.increaseVolume();

            int expected = 100;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void shouldDecreaseVolumeMin () {
            radio.setCurrentVolume(0);

            radio.decreaseVolume();

            int expected = 0;
            int actual = radio.getCurrentRadioStation();
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }

        @Test

        //предыдущая станция;

        public void prevStation () {
            radio.setCurrentRadioStation(5);
            radio.prev();
            public void shouldIncreaseVolumeAboveMax () {
                radio.setCurrentVolume(102);
            }

            radio.increaseVolume();

            int expected = 1;
            int actual = radio.getCurrentVolume();

            int expected = 4;
            int actual = radio.getCurrentRadioStation();

            Assertions.assertEquals(expected, actual);
        }
        @Test

        //предыдущая станция после Min;

        public void prevStationAfterMin () {
            radio.setCurrentRadioStation(0);
            radio.prev();
            public void shouldDecreaseVolumeBelowMin () {
                radio.setCurrentVolume(-3);

                radio.decreaseVolume();

                int expected = 0;
                int actual = radio.getCurrentVolume();

                int expected = 9;
                int actual = radio.getCurrentRadioStation();
                Assertions.assertEquals(expected, actual);
            }
        }
    }