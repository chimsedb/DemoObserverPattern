package Observer;

import android.util.Log;
import android.widget.TextView;


import Subject.Subject;

public class OctalObserver implements Obsever {
    Subject subject;

    @Override
    public void update() {
        Log.d("123123",Integer.toOctalString(subject.getSate()));

    }

    @Override
    public void setSubject(Subject subject,TextView textView) {
        this.subject =subject;
        subject.attach(this);
        textView.setText("Octal : " + Integer.toOctalString(subject.getSate()));
    }
}
