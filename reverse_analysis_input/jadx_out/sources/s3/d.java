package s3;

import O.j;
import Z1.i;
import Z1.l;
import a.AbstractC0149a;
import a0.C0200z;
import android.content.Context;
import android.util.Log;
import j3.C0524a;
import java.io.File;
import java.util.ArrayList;
import n3.InterfaceC0692b;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public class d implements j3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f9692l;

    public static void b(InterfaceC0696f interfaceC0696f, final d dVar) {
        C0200z c0200zQ = interfaceC0696f.q();
        C0801b c0801b = C0801b.f9689d;
        i iVar = new i(interfaceC0696f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath", c0801b, c0200zQ);
        if (dVar != null) {
            final int i = 0;
            iVar.E(new InterfaceC0692b(dVar) { // from class: s3.a

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f9688m;

                {
                    this.f9688m = dVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    switch (i) {
                        case 0:
                            d dVar2 = this.f9688m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f9692l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0149a.K(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f9688m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f9692l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0149a.K(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f9688m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f9692l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0149a.K(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f9688m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f9692l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0149a.K(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f9688m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f9692l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0149a.K(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f9688m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f9692l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0149a.K(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f9688m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((EnumC0802c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0149a.K(th7);
                            }
                            lVar.u(arrayList8);
                            break;
                    }
                }
            });
        } else {
            iVar.E(null);
        }
        i iVar2 = new i(interfaceC0696f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath", c0801b, interfaceC0696f.q());
        if (dVar != null) {
            final int i5 = 1;
            iVar2.E(new InterfaceC0692b(dVar) { // from class: s3.a

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f9688m;

                {
                    this.f9688m = dVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    switch (i5) {
                        case 0:
                            d dVar2 = this.f9688m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f9692l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0149a.K(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f9688m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f9692l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0149a.K(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f9688m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f9692l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0149a.K(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f9688m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f9692l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0149a.K(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f9688m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f9692l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0149a.K(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f9688m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f9692l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0149a.K(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f9688m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((EnumC0802c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0149a.K(th7);
                            }
                            lVar.u(arrayList8);
                            break;
                    }
                }
            });
        } else {
            iVar2.E(null);
        }
        i iVar3 = new i(interfaceC0696f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath", c0801b, interfaceC0696f.q());
        if (dVar != null) {
            final int i6 = 2;
            iVar3.E(new InterfaceC0692b(dVar) { // from class: s3.a

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f9688m;

                {
                    this.f9688m = dVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    switch (i6) {
                        case 0:
                            d dVar2 = this.f9688m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f9692l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0149a.K(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f9688m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f9692l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0149a.K(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f9688m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f9692l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0149a.K(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f9688m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f9692l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0149a.K(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f9688m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f9692l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0149a.K(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f9688m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f9692l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0149a.K(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f9688m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((EnumC0802c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0149a.K(th7);
                            }
                            lVar.u(arrayList8);
                            break;
                    }
                }
            });
        } else {
            iVar3.E(null);
        }
        i iVar4 = new i(interfaceC0696f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath", c0801b, interfaceC0696f.q());
        if (dVar != null) {
            final int i7 = 3;
            iVar4.E(new InterfaceC0692b(dVar) { // from class: s3.a

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f9688m;

                {
                    this.f9688m = dVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    switch (i7) {
                        case 0:
                            d dVar2 = this.f9688m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f9692l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0149a.K(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f9688m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f9692l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0149a.K(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f9688m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f9692l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0149a.K(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f9688m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f9692l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0149a.K(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f9688m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f9692l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0149a.K(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f9688m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f9692l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0149a.K(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f9688m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((EnumC0802c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0149a.K(th7);
                            }
                            lVar.u(arrayList8);
                            break;
                    }
                }
            });
        } else {
            iVar4.E(null);
        }
        i iVar5 = new i(interfaceC0696f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath", c0801b, interfaceC0696f.q());
        if (dVar != null) {
            final int i8 = 4;
            iVar5.E(new InterfaceC0692b(dVar) { // from class: s3.a

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f9688m;

                {
                    this.f9688m = dVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    switch (i8) {
                        case 0:
                            d dVar2 = this.f9688m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f9692l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0149a.K(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f9688m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f9692l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0149a.K(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f9688m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f9692l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0149a.K(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f9688m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f9692l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0149a.K(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f9688m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f9692l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0149a.K(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f9688m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f9692l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0149a.K(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f9688m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((EnumC0802c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0149a.K(th7);
                            }
                            lVar.u(arrayList8);
                            break;
                    }
                }
            });
        } else {
            iVar5.E(null);
        }
        i iVar6 = new i(interfaceC0696f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths", c0801b, interfaceC0696f.q());
        if (dVar != null) {
            final int i9 = 5;
            iVar6.E(new InterfaceC0692b(dVar) { // from class: s3.a

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f9688m;

                {
                    this.f9688m = dVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    switch (i9) {
                        case 0:
                            d dVar2 = this.f9688m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f9692l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0149a.K(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f9688m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f9692l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0149a.K(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f9688m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f9692l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0149a.K(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f9688m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f9692l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0149a.K(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f9688m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f9692l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0149a.K(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f9688m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f9692l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0149a.K(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f9688m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((EnumC0802c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0149a.K(th7);
                            }
                            lVar.u(arrayList8);
                            break;
                    }
                }
            });
        } else {
            iVar6.E(null);
        }
        i iVar7 = new i(interfaceC0696f, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths", c0801b, interfaceC0696f.q());
        if (dVar == null) {
            iVar7.E(null);
        } else {
            final int i10 = 6;
            iVar7.E(new InterfaceC0692b(dVar) { // from class: s3.a

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ d f9688m;

                {
                    this.f9688m = dVar;
                }

                @Override // n3.InterfaceC0692b
                public final void t(Object obj, l lVar) {
                    switch (i10) {
                        case 0:
                            d dVar2 = this.f9688m;
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, dVar2.f9692l.getCacheDir().getPath());
                            } catch (Throwable th) {
                                arrayList = AbstractC0149a.K(th);
                            }
                            lVar.u(arrayList);
                            break;
                        case 1:
                            d dVar3 = this.f9688m;
                            ArrayList arrayList2 = new ArrayList();
                            try {
                                Context context = dVar3.f9692l;
                                File filesDir = context.getFilesDir();
                                if (filesDir == null) {
                                    filesDir = new File(context.getDataDir().getPath(), "files");
                                }
                                arrayList2.add(0, filesDir.getPath());
                            } catch (Throwable th2) {
                                arrayList2 = AbstractC0149a.K(th2);
                            }
                            lVar.u(arrayList2);
                            break;
                        case 2:
                            d dVar4 = this.f9688m;
                            ArrayList arrayList3 = new ArrayList();
                            try {
                                Context context2 = dVar4.f9692l;
                                File dir = context2.getDir("flutter", 0);
                                if (dir == null) {
                                    dir = new File(context2.getDataDir().getPath(), "app_flutter");
                                }
                                arrayList3.add(0, dir.getPath());
                            } catch (Throwable th3) {
                                arrayList3 = AbstractC0149a.K(th3);
                            }
                            lVar.u(arrayList3);
                            break;
                        case 3:
                            d dVar5 = this.f9688m;
                            ArrayList arrayList4 = new ArrayList();
                            try {
                                arrayList4.add(0, dVar5.f9692l.getCacheDir().getPath());
                            } catch (Throwable th4) {
                                arrayList4 = AbstractC0149a.K(th4);
                            }
                            lVar.u(arrayList4);
                            break;
                        case 4:
                            d dVar6 = this.f9688m;
                            ArrayList arrayList5 = new ArrayList();
                            try {
                                String absolutePath = null;
                                File externalFilesDir = dVar6.f9692l.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    absolutePath = externalFilesDir.getAbsolutePath();
                                }
                                arrayList5.add(0, absolutePath);
                            } catch (Throwable th5) {
                                arrayList5 = AbstractC0149a.K(th5);
                            }
                            lVar.u(arrayList5);
                            break;
                        case 5:
                            d dVar7 = this.f9688m;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                dVar7.getClass();
                                ArrayList arrayList7 = new ArrayList();
                                for (File file : dVar7.f9692l.getExternalCacheDirs()) {
                                    if (file != null) {
                                        arrayList7.add(file.getAbsolutePath());
                                    }
                                }
                                arrayList6.add(0, arrayList7);
                            } catch (Throwable th6) {
                                arrayList6 = AbstractC0149a.K(th6);
                            }
                            lVar.u(arrayList6);
                            break;
                        default:
                            d dVar8 = this.f9688m;
                            ArrayList arrayList8 = new ArrayList();
                            try {
                                arrayList8.add(0, dVar8.a((EnumC0802c) ((ArrayList) obj).get(0)));
                            } catch (Throwable th7) {
                                arrayList8 = AbstractC0149a.K(th7);
                            }
                            lVar.u(arrayList8);
                            break;
                    }
                }
            });
        }
    }

    public final ArrayList a(EnumC0802c enumC0802c) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f9692l;
        switch (enumC0802c.ordinal()) {
            case 0:
                str = null;
                break;
            case 1:
                str = "music";
                break;
            case 2:
                str = "podcasts";
                break;
            case 3:
                str = "ringtones";
                break;
            case 4:
                str = "alarms";
                break;
            case 5:
                str = "notifications";
                break;
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "pictures";
                break;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "movies";
                break;
            case j.BYTES_FIELD_NUMBER /* 8 */:
                str = "downloads";
                break;
            case 9:
                str = "dcim";
                break;
            case 10:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + enumC0802c);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        try {
            b(c0524a.f7455c, this);
        } catch (Exception e5) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e5);
        }
        this.f9692l = c0524a.f7453a;
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        b(c0524a.f7455c, null);
    }
}
