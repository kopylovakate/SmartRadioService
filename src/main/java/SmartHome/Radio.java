package SmartHome;

public class Radio {

    private int currentVolume;          // текущая громкость
    private int currentRadioStation;        // текущая радиостанция

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    // установка радиостанции;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
           return;
        }
        currentVolume = newCurrentVolume;
    }

    // увеличение громкости на 1;

    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
    // уменьшение громкости на 1;

    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    // следующая радиостанция;

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    // предыдущая радиостанция;

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }

}