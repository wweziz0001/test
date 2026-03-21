package a4;

import a.AbstractC0149a;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3626a = 0;

    static {
        Object objP;
        Object objP2;
        Exception exc = new Exception();
        String simpleName = AbstractC0149a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objP = G3.b.class.getCanonicalName();
        } catch (Throwable th) {
            objP = i4.a.p(th);
        }
        if (B3.d.a(objP) != null) {
            objP = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objP2 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            objP2 = i4.a.p(th2);
        }
        if (B3.d.a(objP2) != null) {
            objP2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
