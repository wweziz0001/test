package S2;

import android.media.AudioManager;
import android.os.Build;
import java.util.List;
import java.util.Map;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC0705o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static g f2022m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f2023l;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        N3.h.e(c0704n, "call");
        try {
            Object obj = c0704n.f8939b;
            N3.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj;
            String str = c0704n.f8938a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1758921066:
                        if (str.equals("getCommunicationDevice")) {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new A1.c(31);
                            }
                            g gVar = f2022m;
                            N3.h.b(gVar);
                            ((P2.c) interfaceC0706p).success(gVar.f());
                            return;
                        }
                        break;
                    case -1698305881:
                        if (str.equals("getDevices")) {
                            g gVar2 = f2022m;
                            N3.h.b(gVar2);
                            Object obj2 = list.get(0);
                            N3.h.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                            ((P2.c) interfaceC0706p).success(gVar2.g(((Integer) obj2).intValue()));
                            return;
                        }
                        break;
                    case -1679670739:
                        if (str.equals("isMicrophoneMute")) {
                            g gVar3 = f2022m;
                            N3.h.b(gVar3);
                            ((P2.c) interfaceC0706p).success(gVar3.t());
                            return;
                        }
                        break;
                    case -1582239800:
                        if (str.equals("getStreamMaxVolume")) {
                            g gVar4 = f2022m;
                            N3.h.b(gVar4);
                            Object obj3 = list.get(0);
                            N3.h.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                            ((P2.c) interfaceC0706p).success(gVar4.l(((Integer) obj3).intValue()));
                            return;
                        }
                        break;
                    case -1562927400:
                        if (str.equals("isSpeakerphoneOn")) {
                            g gVar5 = f2022m;
                            N3.h.b(gVar5);
                            ((P2.c) interfaceC0706p).success(gVar5.v());
                            return;
                        }
                        break;
                    case -1524320654:
                        if (str.equals("isHapticPlaybackSupported")) {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new A1.c(29);
                            }
                            N3.h.b(f2022m);
                            ((P2.c) interfaceC0706p).success(g.s());
                            return;
                        }
                        break;
                    case -1504647535:
                        if (str.equals("requestAudioFocus")) {
                            g gVar6 = f2022m;
                            N3.h.b(gVar6);
                            ((P2.c) interfaceC0706p).success(Boolean.valueOf(gVar6.y(list)));
                            return;
                        }
                        break;
                    case -1413157019:
                        if (str.equals("setMicrophoneMute")) {
                            g gVar7 = f2022m;
                            N3.h.b(gVar7);
                            Object obj4 = list.get(0);
                            N3.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            gVar7.C(((Boolean) obj4).booleanValue());
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case -1296413680:
                        if (str.equals("setSpeakerphoneOn")) {
                            g gVar8 = f2022m;
                            N3.h.b(gVar8);
                            Object obj5 = list.get(0);
                            N3.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            gVar8.E(((Boolean) obj5).booleanValue());
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case -1285190630:
                        if (str.equals("isBluetoothScoOn")) {
                            g gVar9 = f2022m;
                            N3.h.b(gVar9);
                            ((P2.c) interfaceC0706p).success(gVar9.r());
                            return;
                        }
                        break;
                    case -1197068311:
                        if (str.equals("adjustStreamVolume")) {
                            g gVar10 = f2022m;
                            N3.h.b(gVar10);
                            Object obj6 = list.get(0);
                            N3.h.c(obj6, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) obj6).intValue();
                            Object obj7 = list.get(1);
                            N3.h.c(obj7, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue2 = ((Integer) obj7).intValue();
                            Object obj8 = list.get(2);
                            N3.h.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            gVar10.b(iIntValue, iIntValue2, ((Integer) obj8).intValue());
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case -1091382445:
                        if (str.equals("getMicrophones")) {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new A1.c(28);
                            }
                            g gVar11 = f2022m;
                            N3.h.b(gVar11);
                            ((P2.c) interfaceC0706p).success(gVar11.h());
                            return;
                        }
                        break;
                    case -1079290158:
                        if (str.equals("setAllowedCapturePolicy")) {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new A1.c(29);
                            }
                            g gVar12 = f2022m;
                            N3.h.b(gVar12);
                            Object obj9 = list.get(0);
                            N3.h.c(obj9, "null cannot be cast to non-null type kotlin.Int");
                            gVar12.z(((Integer) obj9).intValue());
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case -1018676910:
                        if (str.equals("setBluetoothScoOn")) {
                            g gVar13 = f2022m;
                            N3.h.b(gVar13);
                            Object obj10 = list.get(0);
                            N3.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            gVar13.A(((Boolean) obj10).booleanValue());
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case -809761226:
                        if (str.equals("getStreamMinVolume")) {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new A1.c(28);
                            }
                            g gVar14 = f2022m;
                            N3.h.b(gVar14);
                            Object obj11 = list.get(0);
                            N3.h.c(obj11, "null cannot be cast to non-null type kotlin.Int");
                            ((P2.c) interfaceC0706p).success(gVar14.m(((Integer) obj11).intValue()));
                            return;
                        }
                        break;
                    case -763512583:
                        if (str.equals("loadSoundEffects")) {
                            g gVar15 = f2022m;
                            N3.h.b(gVar15);
                            gVar15.x();
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case -694417919:
                        if (str.equals("isMusicActive")) {
                            g gVar16 = f2022m;
                            N3.h.b(gVar16);
                            ((P2.c) interfaceC0706p).success(gVar16.u());
                            return;
                        }
                        break;
                    case -580980717:
                        if (str.equals("startBluetoothSco")) {
                            g gVar17 = f2022m;
                            N3.h.b(gVar17);
                            gVar17.F();
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case -445792758:
                        if (str.equals("setCommunicationDevice")) {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new A1.c(31);
                            }
                            g gVar18 = f2022m;
                            N3.h.b(gVar18);
                            Object obj12 = list.get(0);
                            N3.h.c(obj12, "null cannot be cast to non-null type kotlin.Int");
                            ((P2.c) interfaceC0706p).success(Boolean.valueOf(gVar18.B(((Integer) obj12).intValue())));
                            return;
                        }
                        break;
                    case -380792370:
                        if (str.equals("getStreamVolumeDb")) {
                            if (Build.VERSION.SDK_INT < 28) {
                                throw new A1.c(28);
                            }
                            g gVar19 = f2022m;
                            N3.h.b(gVar19);
                            Object obj13 = list.get(0);
                            N3.h.c(obj13, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue3 = ((Integer) obj13).intValue();
                            Object obj14 = list.get(1);
                            N3.h.c(obj14, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue4 = ((Integer) obj14).intValue();
                            Object obj15 = list.get(2);
                            N3.h.c(obj15, "null cannot be cast to non-null type kotlin.Int");
                            ((P2.c) interfaceC0706p).success(gVar19.o(iIntValue3, iIntValue4, ((Integer) obj15).intValue()));
                            return;
                        }
                        break;
                    case -75324903:
                        if (str.equals("getMode")) {
                            g gVar20 = f2022m;
                            N3.h.b(gVar20);
                            ((P2.c) interfaceC0706p).success(gVar20.i());
                            return;
                        }
                        break;
                    case 152385829:
                        if (str.equals("dispatchMediaKeyEvent")) {
                            g gVar21 = f2022m;
                            N3.h.b(gVar21);
                            Object obj16 = list.get(0);
                            N3.h.c(obj16, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                            gVar21.d((Map) obj16);
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 160987616:
                        if (str.equals("getParameters")) {
                            g gVar22 = f2022m;
                            N3.h.b(gVar22);
                            ((P2.c) interfaceC0706p).success(gVar22.j((String) list.get(0)));
                            return;
                        }
                        break;
                    case 186762163:
                        if (str.equals("stopBluetoothSco")) {
                            g gVar23 = f2022m;
                            N3.h.b(gVar23);
                            gVar23.G();
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 276698416:
                        if (str.equals("getStreamVolume")) {
                            g gVar24 = f2022m;
                            N3.h.b(gVar24);
                            Object obj17 = list.get(0);
                            N3.h.c(obj17, "null cannot be cast to non-null type kotlin.Int");
                            ((P2.c) interfaceC0706p).success(gVar24.n(((Integer) obj17).intValue()));
                            return;
                        }
                        break;
                    case 469094495:
                        if (str.equals("isBluetoothScoAvailableOffCall")) {
                            g gVar25 = f2022m;
                            N3.h.b(gVar25);
                            ((P2.c) interfaceC0706p).success(gVar25.q());
                            return;
                        }
                        break;
                    case 623794710:
                        if (str.equals("getRingerMode")) {
                            g gVar26 = f2022m;
                            N3.h.b(gVar26);
                            ((P2.c) interfaceC0706p).success(gVar26.k());
                            return;
                        }
                        break;
                    case 935118828:
                        if (str.equals("setParameters")) {
                            g gVar27 = f2022m;
                            N3.h.b(gVar27);
                            gVar27.D((String) list.get(0));
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 954131337:
                        if (str.equals("adjustVolume")) {
                            g gVar28 = f2022m;
                            N3.h.b(gVar28);
                            Object obj18 = list.get(0);
                            N3.h.c(obj18, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue5 = ((Integer) obj18).intValue();
                            Object obj19 = list.get(1);
                            N3.h.c(obj19, "null cannot be cast to non-null type kotlin.Int");
                            gVar28.c(iIntValue5, ((Integer) obj19).intValue());
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 976310915:
                        if (str.equals("isStreamMute")) {
                            g gVar29 = f2022m;
                            N3.h.b(gVar29);
                            Object obj20 = list.get(0);
                            N3.h.c(obj20, "null cannot be cast to non-null type kotlin.Int");
                            ((P2.c) interfaceC0706p).success(gVar29.w(((Integer) obj20).intValue()));
                            return;
                        }
                        break;
                    case 1084758859:
                        if (str.equals("getProperty")) {
                            g gVar30 = f2022m;
                            N3.h.b(gVar30);
                            String str2 = (String) list.get(0);
                            AudioManager audioManager = gVar30.f2034f;
                            N3.h.b(audioManager);
                            String property = audioManager.getProperty(str2);
                            N3.h.d(property, "getProperty(...)");
                            ((P2.c) interfaceC0706p).success(property);
                            return;
                        }
                        break;
                    case 1163405254:
                        if (str.equals("getAllowedCapturePolicy")) {
                            if (Build.VERSION.SDK_INT < 29) {
                                throw new A1.c(29);
                            }
                            g gVar31 = f2022m;
                            N3.h.b(gVar31);
                            AudioManager audioManager2 = gVar31.f2034f;
                            N3.h.b(audioManager2);
                            ((P2.c) interfaceC0706p).success(Integer.valueOf(audioManager2.getAllowedCapturePolicy()));
                            return;
                        }
                        break;
                    case 1187450940:
                        if (str.equals("setStreamVolume")) {
                            g gVar32 = f2022m;
                            N3.h.b(gVar32);
                            Object obj21 = list.get(0);
                            N3.h.c(obj21, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue6 = ((Integer) obj21).intValue();
                            Object obj22 = list.get(1);
                            N3.h.c(obj22, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue7 = ((Integer) obj22).intValue();
                            Object obj23 = list.get(2);
                            N3.h.c(obj23, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue8 = ((Integer) obj23).intValue();
                            AudioManager audioManager3 = gVar32.f2034f;
                            N3.h.b(audioManager3);
                            audioManager3.setStreamVolume(iIntValue6, iIntValue7, iIntValue8);
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 1241312831:
                        if (str.equals("clearCommunicationDevice")) {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new A1.c(31);
                            }
                            g gVar33 = f2022m;
                            N3.h.b(gVar33);
                            AudioManager audioManager4 = gVar33.f2034f;
                            N3.h.b(audioManager4);
                            audioManager4.clearCommunicationDevice();
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 1258134830:
                        if (str.equals("adjustSuggestedStreamVolume")) {
                            g gVar34 = f2022m;
                            N3.h.b(gVar34);
                            Object obj24 = list.get(0);
                            N3.h.c(obj24, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue9 = ((Integer) obj24).intValue();
                            Object obj25 = list.get(1);
                            N3.h.c(obj25, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue10 = ((Integer) obj25).intValue();
                            Object obj26 = list.get(2);
                            N3.h.c(obj26, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue11 = ((Integer) obj26).intValue();
                            AudioManager audioManager5 = gVar34.f2034f;
                            N3.h.b(audioManager5);
                            audioManager5.adjustSuggestedStreamVolume(iIntValue9, iIntValue10, iIntValue11);
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 1357290231:
                        if (str.equals("abandonAudioFocus")) {
                            g gVar35 = f2022m;
                            N3.h.b(gVar35);
                            ((P2.c) interfaceC0706p).success(Boolean.valueOf(gVar35.a()));
                            return;
                        }
                        break;
                    case 1378317714:
                        if (str.equals("unloadSoundEffects")) {
                            g gVar36 = f2022m;
                            N3.h.b(gVar36);
                            AudioManager audioManager6 = gVar36.f2034f;
                            N3.h.b(audioManager6);
                            audioManager6.unloadSoundEffects();
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 1397925922:
                        if (str.equals("setRingerMode")) {
                            g gVar37 = f2022m;
                            N3.h.b(gVar37);
                            Object obj27 = list.get(0);
                            N3.h.c(obj27, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue12 = ((Integer) obj27).intValue();
                            AudioManager audioManager7 = gVar37.f2034f;
                            N3.h.b(audioManager7);
                            audioManager7.setRingerMode(iIntValue12);
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 1504508844:
                        if (str.equals("playSoundEffect")) {
                            g gVar38 = f2022m;
                            N3.h.b(gVar38);
                            Object obj28 = list.get(0);
                            N3.h.c(obj28, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue13 = ((Integer) obj28).intValue();
                            Double d5 = (Double) list.get(1);
                            if (d5 != null) {
                                AudioManager audioManager8 = gVar38.f2034f;
                                N3.h.b(audioManager8);
                                audioManager8.playSoundEffect(iIntValue13, (float) d5.doubleValue());
                            } else {
                                AudioManager audioManager9 = gVar38.f2034f;
                                N3.h.b(audioManager9);
                                audioManager9.playSoundEffect(iIntValue13);
                            }
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 1570996442:
                        if (str.equals("getAvailableCommunicationDevices")) {
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new A1.c(31);
                            }
                            g gVar39 = f2022m;
                            N3.h.b(gVar39);
                            ((P2.c) interfaceC0706p).success(gVar39.e());
                            return;
                        }
                        break;
                    case 1984784677:
                        if (str.equals("setMode")) {
                            g gVar40 = f2022m;
                            N3.h.b(gVar40);
                            Object obj29 = list.get(0);
                            N3.h.c(obj29, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue14 = ((Integer) obj29).intValue();
                            AudioManager audioManager10 = gVar40.f2034f;
                            N3.h.b(audioManager10);
                            audioManager10.setMode(iIntValue14);
                            ((P2.c) interfaceC0706p).success(null);
                            return;
                        }
                        break;
                    case 1986792688:
                        if (str.equals("isVolumeFixed")) {
                            g gVar41 = f2022m;
                            N3.h.b(gVar41);
                            AudioManager audioManager11 = gVar41.f2034f;
                            N3.h.b(audioManager11);
                            ((P2.c) interfaceC0706p).success(Boolean.valueOf(audioManager11.isVolumeFixed()));
                            return;
                        }
                        break;
                    case 2093966320:
                        if (str.equals("generateAudioSessionId")) {
                            g gVar42 = f2022m;
                            N3.h.b(gVar42);
                            AudioManager audioManager12 = gVar42.f2034f;
                            N3.h.b(audioManager12);
                            ((P2.c) interfaceC0706p).success(Integer.valueOf(audioManager12.generateAudioSessionId()));
                            return;
                        }
                        break;
                }
            }
            ((P2.c) interfaceC0706p).notImplemented();
        } catch (Exception e5) {
            e5.printStackTrace();
            ((P2.c) interfaceC0706p).error("Error: " + e5, null, null);
        }
    }
}
