package A0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements l2.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f78l;

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b A[Catch: all -> 0x0069, TryCatch #0 {all -> 0x0069, blocks: (B:4:0x000b, B:6:0x0011, B:8:0x0015, B:11:0x001b, B:37:0x005c, B:39:0x0060, B:41:0x0064, B:46:0x006b, B:48:0x006f, B:50:0x0073, B:52:0x0077, B:54:0x0081, B:56:0x008d, B:59:0x0098), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    @Override // l2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean apply(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 2
            r2 = -1
            r3 = 1
            A0.u r4 = r8.f78l
            a0.p r9 = (a0.C0190p) r9
            java.lang.Object r5 = r4.f152c
            monitor-enter(r5)
            A0.m r6 = r4.f156g     // Catch: java.lang.Throwable -> L69
            boolean r6 = r6.f115v     // Catch: java.lang.Throwable -> L69
            if (r6 == 0) goto L97
            boolean r6 = r4.f155f     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L97
            int r6 = r9.f3402C     // Catch: java.lang.Throwable -> L69
            if (r6 == r2) goto L97
            if (r6 <= r1) goto L97
            java.lang.String r6 = r9.f3424n     // Catch: java.lang.Throwable -> L69
            if (r6 != 0) goto L21
        L1f:
            r1 = r0
            goto L58
        L21:
            int r7 = r6.hashCode()
            switch(r7) {
                case -2123537834: goto L49;
                case 187078296: goto L3e;
                case 187078297: goto L35;
                case 1504578661: goto L2a;
                default: goto L28;
            }
        L28:
            r1 = r2
            goto L53
        L2a:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L33
            goto L28
        L33:
            r1 = 3
            goto L53
        L35:
            java.lang.String r7 = "audio/ac4"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L53
            goto L28
        L3e:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L47
            goto L28
        L47:
            r1 = r3
            goto L53
        L49:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L52
            goto L28
        L52:
            r1 = r0
        L53:
            switch(r1) {
                case 0: goto L57;
                case 1: goto L57;
                case 2: goto L57;
                case 3: goto L57;
                default: goto L56;
            }
        L56:
            goto L1f
        L57:
            r1 = r3
        L58:
            r2 = 32
            if (r1 == 0) goto L6b
            int r1 = d0.AbstractC0370w.f5326a     // Catch: java.lang.Throwable -> L69
            if (r1 < r2) goto L97
            A0.p r1 = r4.f157h     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L97
            boolean r1 = r1.f120a     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L97
            goto L6b
        L69:
            r9 = move-exception
            goto L9a
        L6b:
            int r1 = d0.AbstractC0370w.f5326a     // Catch: java.lang.Throwable -> L69
            if (r1 < r2) goto L98
            A0.p r1 = r4.f157h     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L98
            boolean r2 = r1.f120a     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L98
            java.lang.Object r1 = r1.f121b     // Catch: java.lang.Throwable -> L69
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L69
            boolean r1 = A0.n.g(r1)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L98
            A0.p r1 = r4.f157h     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r1.f121b     // Catch: java.lang.Throwable -> L69
            android.media.Spatializer r1 = (android.media.Spatializer) r1     // Catch: java.lang.Throwable -> L69
            boolean r1 = A0.n.j(r1)     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L98
            A0.p r1 = r4.f157h     // Catch: java.lang.Throwable -> L69
            a0.c r2 = r4.i     // Catch: java.lang.Throwable -> L69
            boolean r9 = r1.a(r2, r9)     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L98
        L97:
            r0 = r3
        L98:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            return r0
        L9a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L69
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.h.apply(java.lang.Object):boolean");
    }
}
