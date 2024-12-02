package SmartHome;

public class Radio {

    private int currentVolume;          // текущая громкость
    private int currentRadioStation;// текущая радиостанция
    private int currentStation;
    private int currentVolume;
    private int numberStation = 10;
    private int minStation = 0;
    private int maxStation = numberStation - 1;
    private int minVolume = 0;
    private int maxVolume = 100;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public Radio(int numberStation) { // конструктор для задания числа радиостанций
        this.maxStation = numberStation - 1;
    }

    public Radio() { // конструктор для задания числа радиостанций по умолчанию
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    // установка радиостанции;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            public void setCurrentStation ( int newCurrentStation){
                if (newCurrentStation < minStation) {
                    return;
                }
                if (newCurrentRadioStation < 0) {
                    if (newCurrentRadioStation > maxStation) {
                        return;
                    }
                    currentRadioStation = newCurrentRadioStation;
                    currentStation = newCurrentStation;
                }
            }

        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // увеличение громкости на 1;

    public void volumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation; // переход счетчика после 0 на 9
        }
    }


    // уменьшение громкости на 1;

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public Radio(int minVolume, int maxVolume) { // конструктор для задания уровня громкости
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // указываем границы диапазона
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // следующая радиостанция;

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
            public void increaseVolume () {
                if (currentVolume < maxVolume) {
                    currentVolume = currentVolume + 1;
                } else {
                    currentRadioStation = 0;
                    currentVolume = maxVolume;
                }
            }

            // предыдущая радиостанция;

            public void prev () {
                if (currentRadioStation > 0) {
                    currentRadioStation = currentRadioStation - 1;
                    public void decreaseVolume () {
                        if (currentVolume > minVolume) {
                            currentVolume = currentVolume - 1;
                        } else {
                            currentRadioStation = 9;
                            currentVolume = minVolume;
                        }
                    }
                }

            }