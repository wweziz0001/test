package t3;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class M extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        LinkedHashSet linkedHashSet = new LinkedHashSet(C3.r.b0(4));
        C3.e.Y(new String[]{"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"}, linkedHashSet);
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || linkedHashSet.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
