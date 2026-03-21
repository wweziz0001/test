package k0;

import B0.t;
import a0.C0157H;
import android.net.Uri;
import android.text.TextUtils;
import f0.C0415j;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class f implements t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f7561l = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // B0.t
    public final Object l(Uri uri, C0415j c0415j) throws IOException {
        String line = new BufferedReader(new InputStreamReader(c0415j, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f7561l.matcher(line);
            if (!matcher.matches()) {
                throw C0157H.b("Couldn't parse timestamp: " + line, null);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j5 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long j6 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j6 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j5;
            }
            return Long.valueOf(time);
        } catch (ParseException e5) {
            throw C0157H.b(null, e5);
        }
    }
}
