package Subject;

import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import Observer.Obsever;

public class Subject {
    private List<Obsever> obsevers = new ArrayList<Obsever>();
    private int sate;

    public int getSate() {
        return sate;
    }

    public void setSate(int sate) {
        this.sate = sate;
    }

    public void attach(Obsever obsever){
        obsevers.add(obsever);
    }

    public void notifyAllObserver(){
        for (Obsever obsever : obsevers){
            obsever.update();
        }
    }
}
