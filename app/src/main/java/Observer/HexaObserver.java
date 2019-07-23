package Observer;

import android.util.Log;
import android.widget.TextView;

import Subject.Subject;

public class HexaObserver implements Obsever {
    Subject subject;

    @Override
    public void update() {
        Log.d("123123",Integer.toHexString(subject.getSate()));
    }

    @Override
    public void setSubject(Subject subject,TextView textView) {
        this.subject = subject;
        subject.attach(this);
        textView.setText("Hexa : " + Integer.toHexString(subject.getSate()));
    }
}
