package b3;

import android.content.Context;
import androidx.work.WorkerParameters;
import dev.fluttercommunity.workmanager.BackgroundWorker;
import e3.C0394c;
import io.flutter.view.FlutterCallbackInformation;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import n3.C0707q;

/* JADX INFO: renamed from: b3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0308b implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BackgroundWorker f4909m;

    public /* synthetic */ RunnableC0308b(BackgroundWorker backgroundWorker, int i) {
        this.f4908l = i;
        this.f4909m = backgroundWorker;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        BackgroundWorker backgroundWorker = this.f4909m;
        switch (this.f4908l) {
            case 0:
                C0394c c0394c = backgroundWorker.f5455s;
                if (c0394c != null) {
                    c0394c.a();
                }
                backgroundWorker.f5455s = null;
                return;
            default:
                h3.f fVar = BackgroundWorker.f5451w;
                Context context = backgroundWorker.f1832l;
                N3.h.d(context, "getApplicationContext(...)");
                long j5 = context.getSharedPreferences("flutter_workmanager_plugin", 0).getLong("be.tramckrijte.workmanager.CALLBACK_DISPATCHER_HANDLE_KEY", -1L);
                FlutterCallbackInformation flutterCallbackInformationLookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j5);
                String str4 = BackgroundWorker.f5451w.f6324d.f6308b;
                WorkerParameters workerParameters = backgroundWorker.f5452p;
                Object obj = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.IS_IN_DEBUG_MODE_KEY");
                boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false;
                Context context2 = backgroundWorker.f1832l;
                if (zBooleanValue) {
                    DateFormat dateFormat = AbstractC0311e.f4915a;
                    N3.h.d(context2, "getApplicationContext(...)");
                    Object obj2 = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.DART_TASK");
                    String str5 = obj2 instanceof String ? (String) obj2 : null;
                    N3.h.b(str5);
                    Object obj3 = workerParameters.f4779b.f1824a.get("be.tramckrijte.workmanager.INPUT_DATA");
                    String str6 = obj3 instanceof String ? (String) obj3 : null;
                    StringBuilder sb = new StringBuilder();
                    List listQ = C3.g.Q("👷\u200d♀️", "👷\u200d♂️");
                    N3.h.e(P3.d.f1700l, "random");
                    if (listQ.isEmpty()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    sb.append((String) listQ.get(P3.d.f1701m.b(listQ.size())));
                    sb.append(' ');
                    sb.append(AbstractC0311e.f4915a.format(new Date()));
                    String string = sb.toString();
                    StringBuilder sbM = AbstractC0307a.m("\n            • dartTask: ", str5, "\n            • inputData: ");
                    String str7 = "not found";
                    if (str6 == null) {
                        str6 = "not found";
                    }
                    sbM.append(str6);
                    sbM.append("\n            • callbackHandle: ");
                    sbM.append(j5);
                    sbM.append(" \n            • callBackName: ");
                    if (flutterCallbackInformationLookupCallbackInformation == null || (str = flutterCallbackInformationLookupCallbackInformation.callbackName) == null) {
                        str = "not found";
                    }
                    sbM.append(str);
                    sbM.append("\n            • callbackClassName: ");
                    if (flutterCallbackInformationLookupCallbackInformation == null || (str2 = flutterCallbackInformationLookupCallbackInformation.callbackClassName) == null) {
                        str2 = "not found";
                    }
                    sbM.append(str2);
                    sbM.append("\n            • callbackLibraryPath: ");
                    if (flutterCallbackInformationLookupCallbackInformation != null && (str3 = flutterCallbackInformationLookupCallbackInformation.callbackLibraryPath) != null) {
                        str7 = str3;
                    }
                    sbM.append(str7);
                    sbM.append("\n            • dartBundlePath: ");
                    sbM.append(str4);
                    sbM.append("\"\n            ");
                    AbstractC0311e.a(context2, backgroundWorker.f5454r, string, U3.e.b0(sbM.toString()));
                }
                C0394c c0394c2 = backgroundWorker.f5455s;
                if (c0394c2 != null) {
                    f3.b bVar = c0394c2.f5607c;
                    C0707q c0707q = new C0707q(bVar, "be.tramckrijte.workmanager/background_channel_work_manager");
                    backgroundWorker.f5453q = c0707q;
                    c0707q.b(backgroundWorker);
                    bVar.a(new Z1.s(context2.getAssets(), str4, flutterCallbackInformationLookupCallbackInformation, 5));
                    return;
                }
                return;
        }
    }
}
