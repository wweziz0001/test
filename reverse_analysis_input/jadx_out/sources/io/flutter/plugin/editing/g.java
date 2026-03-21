package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import m3.C0675i;
import o3.C0721a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements SpellCheckerSession.SpellCheckerSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0675i f6706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextServicesManager f6707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f6708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P2.c f6709d;

    public g(TextServicesManager textServicesManager, C0675i c0675i) {
        this.f6707b = textServicesManager;
        this.f6706a = c0675i;
        c0675i.f8712m = this;
    }

    public final void a(String str, String str2, P2.c cVar) {
        if (this.f6709d != null) {
            cVar.error("error", "Previous spell check request still pending.", null);
            return;
        }
        this.f6709d = cVar;
        Locale localeA = C0721a.a(str);
        if (this.f6708c == null) {
            this.f6708c = this.f6707b.newSpellCheckerSession(null, localeA, this, true);
        }
        this.f6708c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f6709d.success(new ArrayList());
            this.f6709d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f6709d.success(new ArrayList());
            this.f6709d = null;
            return;
        }
        for (int i = 0; i < sentenceSuggestionsInfo.getSuggestionsCount(); i++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap map = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i) + offsetAt;
                map.put("startIndex", Integer.valueOf(offsetAt));
                map.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z4 = false;
                for (int i5 = 0; i5 < suggestionsCount; i5++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i5);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z4 = true;
                    }
                }
                if (z4) {
                    map.put("suggestions", arrayList2);
                    arrayList.add(map);
                }
            }
        }
        this.f6709d.success(arrayList);
        this.f6709d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
