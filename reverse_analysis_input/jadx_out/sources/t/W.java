package t;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import x.AbstractC0953b;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static X a(Person person) {
        CharSequence name = person.getName();
        IconCompat iconCompatD = person.getIcon() != null ? IconCompat.d(person.getIcon()) : null;
        String uri = person.getUri();
        String key = person.getKey();
        boolean zIsBot = person.isBot();
        boolean zIsImportant = person.isImportant();
        X x4 = new X();
        x4.f9725a = name;
        x4.f9726b = iconCompatD;
        x4.f9727c = uri;
        x4.f9728d = key;
        x4.f9729e = zIsBot;
        x4.f9730f = zIsImportant;
        return x4;
    }

    public static Person b(X x4) {
        Person.Builder name = new Person.Builder().setName(x4.f9725a);
        Icon iconF = null;
        IconCompat iconCompat = x4.f9726b;
        if (iconCompat != null) {
            iconCompat.getClass();
            iconF = AbstractC0953b.f(iconCompat, null);
        }
        return name.setIcon(iconF).setUri(x4.f9727c).setKey(x4.f9728d).setBot(x4.f9729e).setImportant(x4.f9730f).build();
    }
}
