package Observer;

import android.widget.TextView;

import Subject.Subject;

public interface Obsever {
    void update();
    void setSubject(Subject subject,TextView textView);
}
