package T;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import b3.AbstractC0307a;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import m.B0;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final byte[] f2059A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f2060B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f2061C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final byte[] f2062D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final d f2063E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final d[][] f2064F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final d[] f2065G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final HashMap[] f2066H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final HashMap[] f2067I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final HashSet f2068J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final HashMap f2069K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final Charset f2070L;
    public static final byte[] M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final byte[] f2071N;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f2072l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f2073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f2074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f2075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f2076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f2077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final byte[] f2078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte[] f2079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f2080t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f2081u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f2082v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f2083w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f2084x;
    public static final byte[] y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f2085z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileDescriptor f2086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AssetManager.AssetInputStream f2087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap[] f2089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f2090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteOrder f2091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2093h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2094j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2095k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f2073m = new int[]{8, 8, 8};
        f2074n = new int[]{8};
        f2075o = new byte[]{-1, -40, -1};
        f2076p = new byte[]{102, 116, 121, 112};
        f2077q = new byte[]{109, 105, 102, 49};
        f2078r = new byte[]{104, 101, 105, 99};
        f2079s = new byte[]{79, 76, 89, 77, 80, 0};
        f2080t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f2081u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f2082v = new byte[]{101, 88, 73, 102};
        f2083w = new byte[]{73, 72, 68, 82};
        f2084x = new byte[]{73, 69, 78, 68};
        y = new byte[]{82, 73, 70, 70};
        f2085z = new byte[]{87, 69, 66, 80};
        f2059A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f2060B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f2061C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f2062D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr = {new d(254, "NewSubfileType", 4), new d(255, "SubfileType", 4), new d(256, 3, 4, "ImageWidth"), new d(257, 3, 4, "ImageLength"), new d(258, "BitsPerSample", 3), new d(259, "Compression", 3), new d(262, "PhotometricInterpretation", 3), new d(270, "ImageDescription", 2), new d(271, "Make", 2), new d(272, "Model", 2), new d(273, 3, 4, "StripOffsets"), new d(274, "Orientation", 3), new d(277, "SamplesPerPixel", 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d(282, "XResolution", 5), new d(283, "YResolution", 5), new d(284, "PlanarConfiguration", 3), new d(296, "ResolutionUnit", 3), new d(301, "TransferFunction", 3), new d(305, "Software", 2), new d(306, "DateTime", 2), new d(315, "Artist", 2), new d(318, "WhitePoint", 5), new d(319, "PrimaryChromaticities", 5), new d(330, "SubIFDPointer", 4), new d(513, "JPEGInterchangeFormat", 4), new d(514, "JPEGInterchangeFormatLength", 4), new d(529, "YCbCrCoefficients", 5), new d(530, "YCbCrSubSampling", 3), new d(531, "YCbCrPositioning", 3), new d(532, "ReferenceBlackWhite", 5), new d(33432, "Copyright", 2), new d(34665, "ExifIFDPointer", 4), new d(34853, "GPSInfoIFDPointer", 4), new d(4, "SensorTopBorder", 4), new d(5, "SensorLeftBorder", 4), new d(6, "SensorBottomBorder", 4), new d(7, "SensorRightBorder", 4), new d(23, "ISO", 3), new d(46, "JpgFromRaw", 7), new d(700, "Xmp", 1)};
        d[] dVarArr2 = {new d(33434, "ExposureTime", 5), new d(33437, "FNumber", 5), new d(34850, "ExposureProgram", 3), new d(34852, "SpectralSensitivity", 2), new d(34855, "PhotographicSensitivity", 3), new d(34856, "OECF", 7), new d(34864, "SensitivityType", 3), new d(34865, "StandardOutputSensitivity", 4), new d(34866, "RecommendedExposureIndex", 4), new d(34867, "ISOSpeed", 4), new d(34868, "ISOSpeedLatitudeyyy", 4), new d(34869, "ISOSpeedLatitudezzz", 4), new d(36864, "ExifVersion", 2), new d(36867, "DateTimeOriginal", 2), new d(36868, "DateTimeDigitized", 2), new d(36880, "OffsetTime", 2), new d(36881, "OffsetTimeOriginal", 2), new d(36882, "OffsetTimeDigitized", 2), new d(37121, "ComponentsConfiguration", 7), new d(37122, "CompressedBitsPerPixel", 5), new d(37377, "ShutterSpeedValue", 10), new d(37378, "ApertureValue", 5), new d(37379, "BrightnessValue", 10), new d(37380, "ExposureBiasValue", 10), new d(37381, "MaxApertureValue", 5), new d(37382, "SubjectDistance", 5), new d(37383, "MeteringMode", 3), new d(37384, "LightSource", 3), new d(37385, "Flash", 3), new d(37386, "FocalLength", 5), new d(37396, "SubjectArea", 3), new d(37500, "MakerNote", 7), new d(37510, "UserComment", 7), new d(37520, "SubSecTime", 2), new d(37521, "SubSecTimeOriginal", 2), new d(37522, "SubSecTimeDigitized", 2), new d(40960, "FlashpixVersion", 7), new d(40961, "ColorSpace", 3), new d(40962, 3, 4, "PixelXDimension"), new d(40963, 3, 4, "PixelYDimension"), new d(40964, "RelatedSoundFile", 2), new d(40965, "InteroperabilityIFDPointer", 4), new d(41483, "FlashEnergy", 5), new d(41484, "SpatialFrequencyResponse", 7), new d(41486, "FocalPlaneXResolution", 5), new d(41487, "FocalPlaneYResolution", 5), new d(41488, "FocalPlaneResolutionUnit", 3), new d(41492, "SubjectLocation", 3), new d(41493, "ExposureIndex", 5), new d(41495, "SensingMethod", 3), new d(41728, "FileSource", 7), new d(41729, "SceneType", 7), new d(41730, "CFAPattern", 7), new d(41985, "CustomRendered", 3), new d(41986, "ExposureMode", 3), new d(41987, "WhiteBalance", 3), new d(41988, "DigitalZoomRatio", 5), new d(41989, "FocalLengthIn35mmFilm", 3), new d(41990, "SceneCaptureType", 3), new d(41991, "GainControl", 3), new d(41992, "Contrast", 3), new d(41993, "Saturation", 3), new d(41994, "Sharpness", 3), new d(41995, "DeviceSettingDescription", 7), new d(41996, "SubjectDistanceRange", 3), new d(42016, "ImageUniqueID", 2), new d(42032, "CameraOwnerName", 2), new d(42033, "BodySerialNumber", 2), new d(42034, "LensSpecification", 5), new d(42035, "LensMake", 2), new d(42036, "LensModel", 2), new d(42240, "Gamma", 5), new d(50706, "DNGVersion", 1), new d(50720, 3, 4, "DefaultCropSize")};
        d[] dVarArr3 = {new d(0, "GPSVersionID", 1), new d(1, "GPSLatitudeRef", 2), new d(2, 5, 10, "GPSLatitude"), new d(3, "GPSLongitudeRef", 2), new d(4, 5, 10, "GPSLongitude"), new d(5, "GPSAltitudeRef", 1), new d(6, "GPSAltitude", 5), new d(7, "GPSTimeStamp", 5), new d(8, "GPSSatellites", 2), new d(9, "GPSStatus", 2), new d(10, "GPSMeasureMode", 2), new d(11, "GPSDOP", 5), new d(12, "GPSSpeedRef", 2), new d(13, "GPSSpeed", 5), new d(14, "GPSTrackRef", 2), new d(15, "GPSTrack", 5), new d(16, "GPSImgDirectionRef", 2), new d(17, "GPSImgDirection", 5), new d(18, "GPSMapDatum", 2), new d(19, "GPSDestLatitudeRef", 2), new d(20, "GPSDestLatitude", 5), new d(21, "GPSDestLongitudeRef", 2), new d(22, "GPSDestLongitude", 5), new d(23, "GPSDestBearingRef", 2), new d(24, "GPSDestBearing", 5), new d(25, "GPSDestDistanceRef", 2), new d(26, "GPSDestDistance", 5), new d(27, "GPSProcessingMethod", 7), new d(28, "GPSAreaInformation", 7), new d(29, "GPSDateStamp", 2), new d(30, "GPSDifferential", 3), new d(31, "GPSHPositioningError", 5)};
        d[] dVarArr4 = {new d(1, "InteroperabilityIndex", 2)};
        d[] dVarArr5 = {new d(254, "NewSubfileType", 4), new d(255, "SubfileType", 4), new d(256, 3, 4, "ThumbnailImageWidth"), new d(257, 3, 4, "ThumbnailImageLength"), new d(258, "BitsPerSample", 3), new d(259, "Compression", 3), new d(262, "PhotometricInterpretation", 3), new d(270, "ImageDescription", 2), new d(271, "Make", 2), new d(272, "Model", 2), new d(273, 3, 4, "StripOffsets"), new d(274, "ThumbnailOrientation", 3), new d(277, "SamplesPerPixel", 3), new d(278, 3, 4, "RowsPerStrip"), new d(279, 3, 4, "StripByteCounts"), new d(282, "XResolution", 5), new d(283, "YResolution", 5), new d(284, "PlanarConfiguration", 3), new d(296, "ResolutionUnit", 3), new d(301, "TransferFunction", 3), new d(305, "Software", 2), new d(306, "DateTime", 2), new d(315, "Artist", 2), new d(318, "WhitePoint", 5), new d(319, "PrimaryChromaticities", 5), new d(330, "SubIFDPointer", 4), new d(513, "JPEGInterchangeFormat", 4), new d(514, "JPEGInterchangeFormatLength", 4), new d(529, "YCbCrCoefficients", 5), new d(530, "YCbCrSubSampling", 3), new d(531, "YCbCrPositioning", 3), new d(532, "ReferenceBlackWhite", 5), new d(33432, "Copyright", 2), new d(34665, "ExifIFDPointer", 4), new d(34853, "GPSInfoIFDPointer", 4), new d(50706, "DNGVersion", 1), new d(50720, 3, 4, "DefaultCropSize")};
        f2063E = new d(273, "StripOffsets", 3);
        f2064F = new d[][]{dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, new d[]{new d(256, "ThumbnailImage", 7), new d(8224, "CameraSettingsIFDPointer", 4), new d(8256, "ImageProcessingIFDPointer", 4)}, new d[]{new d(257, "PreviewImageStart", 4), new d(258, "PreviewImageLength", 4)}, new d[]{new d(4371, "AspectFrame", 3)}, new d[]{new d(55, "ColorSpace", 3)}};
        f2065G = new d[]{new d(330, "SubIFDPointer", 4), new d(34665, "ExifIFDPointer", 4), new d(34853, "GPSInfoIFDPointer", 4), new d(40965, "InteroperabilityIFDPointer", 4), new d(8224, "CameraSettingsIFDPointer", 1), new d(8256, "ImageProcessingIFDPointer", 1)};
        f2066H = new HashMap[10];
        f2067I = new HashMap[10];
        f2068J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2069K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f2070L = charsetForName;
        M = "Exif\u0000\u0000".getBytes(charsetForName);
        f2071N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            d[][] dVarArr6 = f2064F;
            if (i >= dVarArr6.length) {
                HashMap map = f2069K;
                d[] dVarArr7 = f2065G;
                map.put(Integer.valueOf(dVarArr7[0].f2053a), 5);
                map.put(Integer.valueOf(dVarArr7[1].f2053a), 1);
                map.put(Integer.valueOf(dVarArr7[2].f2053a), 2);
                map.put(Integer.valueOf(dVarArr7[3].f2053a), 3);
                map.put(Integer.valueOf(dVarArr7[4].f2053a), 7);
                map.put(Integer.valueOf(dVarArr7[5].f2053a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2066H[i] = new HashMap();
            f2067I[i] = new HashMap();
            for (d dVar : dVarArr6[i]) {
                f2066H[i].put(Integer.valueOf(dVar.f2053a), dVar);
                f2067I[i].put(dVar.f2054b, dVar);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:12:0x0039, B:18:0x0056, B:20:0x0061, B:28:0x0077, B:23:0x0068, B:26:0x0070, B:27:0x0074, B:29:0x0081, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:42:0x00aa), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.io.ByteArrayInputStream r9) {
        /*
            r8 = this;
            r8.<init>()
            T.d[][] r0 = T.g.f2064F
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r8.f2089d = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r2 = r0.length
            r1.<init>(r2)
            r8.f2090e = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r8.f2091f = r1
            r1 = 0
            boolean r2 = T.g.f2072l
            java.lang.String r3 = "ExifInterface"
            r8.f2087b = r1
            r8.f2086a = r1
            r1 = 0
            r4 = r1
        L21:
            int r5 = r0.length     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r4 >= r5) goto L39
            java.util.HashMap[] r5 = r8.f2089d     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r6.<init>()     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r5[r4] = r6     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r4 = r4 + 1
            goto L21
        L30:
            r9 = move-exception
            goto Lb0
        L33:
            r9 = move-exception
            goto La8
        L36:
            r9 = move-exception
            goto La8
        L39:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r9, r4)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r9 = r8.f(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.f2088c = r9     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r4 = 14
            r5 = 13
            r6 = 9
            r7 = 4
            if (r9 == r7) goto L81
            if (r9 == r6) goto L81
            if (r9 == r5) goto L81
            if (r9 != r4) goto L56
            goto L81
        L56:
            T.f r9 = new T.f     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f2088c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r1 = 12
            if (r0 != r1) goto L65
            r8.d(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L65:
            r1 = 7
            if (r0 != r1) goto L6c
            r8.g(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L6c:
            r1 = 10
            if (r0 != r1) goto L74
            r8.k(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L77
        L74:
            r8.j(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L77:
            int r0 = r8.f2093h     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.b(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r8.u(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L81:
            T.b r9 = new T.b     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            int r0 = r8.f2088c     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            if (r0 != r7) goto L8e
            r8.e(r9, r1, r1)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L8e:
            if (r0 != r5) goto L94
            r8.h(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L94:
            if (r0 != r6) goto L9a
            r8.i(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
            goto L9f
        L9a:
            if (r0 != r4) goto L9f
            r8.l(r9)     // Catch: java.lang.Throwable -> L30 java.lang.UnsupportedOperationException -> L33 java.io.IOException -> L36
        L9f:
            r8.a()
            if (r2 == 0) goto Lbf
        La4:
            r8.p()
            goto Lbf
        La8:
            if (r2 == 0) goto Lb9
            java.lang.String r0 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r3, r0, r9)     // Catch: java.lang.Throwable -> L30
            goto Lb9
        Lb0:
            r8.a()
            if (r2 == 0) goto Lb8
            r8.p()
        Lb8:
            throw r9
        Lb9:
            r8.a()
            if (r2 == 0) goto Lbf
            goto La4
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.<init>(java.io.ByteArrayInputStream):void");
    }

    public static ByteOrder q(b bVar) throws IOException {
        short s4 = bVar.readShort();
        boolean z4 = f2072l;
        if (s4 == 18761) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s4 == 19789) {
            if (z4) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s4));
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap[] mapArr = this.f2089d;
        if (strB != null && b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strB.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(f2070L);
            map.put("DateTime", new c(bytes, 2, bytes.length));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", c.a(0L, this.f2091f));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", c.a(0L, this.f2091f));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", c.a(0L, this.f2091f));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", c.a(0L, this.f2091f));
        }
    }

    public final String b(String str) {
        c cVarC = c(str);
        if (cVarC != null) {
            if (!f2068J.contains(str)) {
                return cVarC.f(this.f2091f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = cVarC.f2049a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                e[] eVarArr = (e[]) cVarC.g(this.f2091f);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f2057a / eVar.f2058b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f2057a / eVar2.f2058b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f2057a / eVar3.f2058b)));
            }
            try {
                return Double.toString(cVarC.d(this.f2091f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f2072l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f2064F.length; i++) {
            c cVar = (c) this.f2089d[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    public final void d(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                i.a(mediaMetadataRetriever, new a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f2089d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", c.c(Integer.parseInt(strExtractMetadata), this.f2091f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", c.c(Integer.parseInt(strExtractMetadata2), this.f2091f));
                }
                if (strExtractMetadata3 != null) {
                    int i = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", c.c(i != 90 ? i != 180 ? i != 270 ? 1 : 8 : 3 : 6, this.f2091f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.b(i5);
                    byte[] bArr = new byte[6];
                    if (fVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    if (fVar.read(bArr2) != i8) {
                        throw new IOException("Can't read exif");
                    }
                    this.f2093h = i7;
                    r(0, bArr2);
                }
                if (f2072l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(T.b r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.e(T.b, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.f(java.io.BufferedInputStream):int");
    }

    public final void g(f fVar) throws IOException {
        int i;
        int i5;
        j(fVar);
        HashMap[] mapArr = this.f2089d;
        c cVar = (c) mapArr[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f2052d);
            fVar2.f2046m = this.f2091f;
            byte[] bArr = f2079s;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.b(0L);
            byte[] bArr3 = f2080t;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.b(12L);
            }
            s(fVar2, 6);
            c cVar2 = (c) mapArr[7].get("PreviewImageStart");
            c cVar3 = (c) mapArr[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", cVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) mapArr[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.g(this.f2091f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i6 = iArr[2];
                int i7 = iArr[0];
                if (i6 <= i7 || (i = iArr[3]) <= (i5 = iArr[1])) {
                    return;
                }
                int i8 = (i6 - i7) + 1;
                int i9 = (i - i5) + 1;
                if (i8 < i9) {
                    int i10 = i8 + i9;
                    i9 = i10 - i9;
                    i8 = i10 - i9;
                }
                c cVarC = c.c(i8, this.f2091f);
                c cVarC2 = c.c(i9, this.f2091f);
                mapArr[0].put("ImageWidth", cVarC);
                mapArr[0].put("ImageLength", cVarC2);
            }
        }
    }

    public final void h(b bVar) throws IOException {
        if (f2072l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f2046m = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f2081u;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i5 = length + 8;
                if (i5 == 16 && !Arrays.equals(bArr2, f2083w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f2084x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f2082v)) {
                    byte[] bArr3 = new byte[i];
                    if (bVar.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + D1.b.g(bArr2));
                    }
                    int i6 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i6) {
                        this.f2093h = i5;
                        r(0, bArr3);
                        x();
                        u(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i6 + ", calculated CRC value: " + crc32.getValue());
                }
                int i7 = i + 4;
                bVar.a(i7);
                length = i5 + i7;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(b bVar) throws IOException {
        boolean z4 = f2072l;
        if (z4) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i5 = ByteBuffer.wrap(bArr2).getInt();
        int i6 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i5];
        bVar.a(i - bVar.f2047n);
        bVar.read(bArr4);
        e(new b(bArr4), i, 5);
        bVar.a(i6 - bVar.f2047n);
        bVar.f2046m = ByteOrder.BIG_ENDIAN;
        int i7 = bVar.readInt();
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i7);
        }
        for (int i8 = 0; i8 < i7; i8++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f2063E.f2053a) {
                short s4 = bVar.readShort();
                short s5 = bVar.readShort();
                c cVarC = c.c(s4, this.f2091f);
                c cVarC2 = c.c(s5, this.f2091f);
                HashMap[] mapArr = this.f2089d;
                mapArr[0].put("ImageLength", cVarC);
                mapArr[0].put("ImageWidth", cVarC2);
                if (z4) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s4) + ", width: " + ((int) s5));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void j(f fVar) throws IOException {
        o(fVar);
        s(fVar, 0);
        w(fVar, 0);
        w(fVar, 5);
        w(fVar, 4);
        x();
        if (this.f2088c == 8) {
            HashMap[] mapArr = this.f2089d;
            c cVar = (c) mapArr[1].get("MakerNote");
            if (cVar != null) {
                f fVar2 = new f(cVar.f2052d);
                fVar2.f2046m = this.f2091f;
                fVar2.a(6);
                s(fVar2, 9);
                c cVar2 = (c) mapArr[9].get("ColorSpace");
                if (cVar2 != null) {
                    mapArr[1].put("ColorSpace", cVar2);
                }
            }
        }
    }

    public final void k(f fVar) throws IOException {
        if (f2072l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        j(fVar);
        HashMap[] mapArr = this.f2089d;
        c cVar = (c) mapArr[0].get("JpgFromRaw");
        if (cVar != null) {
            e(new b(cVar.f2052d), (int) cVar.f2051c, 5);
        }
        c cVar2 = (c) mapArr[0].get("ISO");
        c cVar3 = (c) mapArr[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", cVar2);
    }

    public final void l(b bVar) throws IOException {
        if (f2072l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f2046m = ByteOrder.LITTLE_ENDIAN;
        bVar.a(y.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = f2085z;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i5 = bVar.readInt();
                int i6 = length + 8;
                if (Arrays.equals(f2059A, bArr2)) {
                    byte[] bArr3 = new byte[i5];
                    if (bVar.read(bArr3) == i5) {
                        this.f2093h = i6;
                        r(0, bArr3);
                        u(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + D1.b.g(bArr2));
                    }
                }
                if (i5 % 2 == 1) {
                    i5++;
                }
                length = i6 + i5;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i5);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void m(b bVar, HashMap map) throws IOException {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int iE = cVar.e(this.f2091f);
        int iE2 = cVar2.e(this.f2091f);
        if (this.f2088c == 7) {
            iE += this.i;
        }
        if (iE > 0 && iE2 > 0 && this.f2087b == null && this.f2086a == null) {
            bVar.skip(iE);
            bVar.read(new byte[iE2]);
        }
        if (f2072l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iE + ", length: " + iE2);
        }
    }

    public final boolean n(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.e(this.f2091f) <= 512 && cVar2.e(this.f2091f) <= 512;
    }

    public final void o(f fVar) throws IOException {
        ByteOrder byteOrderQ = q(fVar);
        this.f2091f = byteOrderQ;
        fVar.f2046m = byteOrderQ;
        int unsignedShort = fVar.readUnsignedShort();
        int i = this.f2088c;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i5 = fVar.readInt();
        if (i5 < 8) {
            throw new IOException(AbstractC0307a.i("Invalid first Ifd offset: ", i5));
        }
        int i6 = i5 - 8;
        if (i6 > 0) {
            fVar.a(i6);
        }
    }

    public final void p() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f2089d;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbJ = B0.j(i, "The size of tag group[", "]: ");
            sbJ.append(mapArr[i].size());
            Log.d("ExifInterface", sbJ.toString());
            for (Map.Entry entry : mapArr[i].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.f(this.f2091f) + "'");
            }
            i++;
        }
    }

    public final void r(int i, byte[] bArr) throws IOException {
        f fVar = new f(bArr);
        o(fVar);
        s(fVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(T.f r29, int r30) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.g.s(T.f, int):void");
    }

    public final void t(int i, String str, String str2) {
        HashMap[] mapArr = this.f2089d;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void u(b bVar) throws IOException {
        c cVar;
        int iE;
        HashMap map = this.f2089d[4];
        c cVar2 = (c) map.get("Compression");
        if (cVar2 == null) {
            m(bVar, map);
            return;
        }
        int iE2 = cVar2.e(this.f2091f);
        if (iE2 != 1) {
            if (iE2 == 6) {
                m(bVar, map);
                return;
            } else if (iE2 != 7) {
                return;
            }
        }
        c cVar3 = (c) map.get("BitsPerSample");
        if (cVar3 != null) {
            int[] iArr = (int[]) cVar3.g(this.f2091f);
            int[] iArr2 = f2073m;
            if (Arrays.equals(iArr2, iArr) || (this.f2088c == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((iE = cVar.e(this.f2091f)) == 1 && Arrays.equals(iArr, f2074n)) || (iE == 6 && Arrays.equals(iArr, iArr2))))) {
                c cVar4 = (c) map.get("StripOffsets");
                c cVar5 = (c) map.get("StripByteCounts");
                if (cVar4 == null || cVar5 == null) {
                    return;
                }
                long[] jArrQ = D1.b.q(cVar4.g(this.f2091f));
                long[] jArrQ2 = D1.b.q(cVar5.g(this.f2091f));
                if (jArrQ == null || jArrQ.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrQ2 == null || jArrQ2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrQ.length != jArrQ2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j5 = 0;
                for (long j6 : jArrQ2) {
                    j5 += j6;
                }
                byte[] bArr = new byte[(int) j5];
                this.f2092g = true;
                int i = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < jArrQ.length; i6++) {
                    int i7 = (int) jArrQ[i6];
                    int i8 = (int) jArrQ2[i6];
                    if (i6 < jArrQ.length - 1 && i7 + i8 != jArrQ[i6 + 1]) {
                        this.f2092g = false;
                    }
                    int i9 = i7 - i;
                    if (i9 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j7 = i9;
                    if (bVar.skip(j7) != j7) {
                        Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                        return;
                    }
                    int i10 = i + i9;
                    byte[] bArr2 = new byte[i8];
                    if (bVar.read(bArr2) != i8) {
                        Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                        return;
                    }
                    i = i10 + i8;
                    System.arraycopy(bArr2, 0, bArr, i5, i8);
                    i5 += i8;
                }
                if (this.f2092g) {
                    long j8 = jArrQ[0];
                    return;
                }
                return;
            }
        }
        if (f2072l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void v(int i, int i5) {
        HashMap[] mapArr = this.f2089d;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z4 = f2072l;
        if (zIsEmpty || mapArr[i5].isEmpty()) {
            if (z4) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) mapArr[i].get("ImageLength");
        c cVar2 = (c) mapArr[i].get("ImageWidth");
        c cVar3 = (c) mapArr[i5].get("ImageLength");
        c cVar4 = (c) mapArr[i5].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (z4) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (z4) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iE = cVar.e(this.f2091f);
        int iE2 = cVar2.e(this.f2091f);
        int iE3 = cVar3.e(this.f2091f);
        int iE4 = cVar4.e(this.f2091f);
        if (iE >= iE3 || iE2 >= iE4) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i5];
        mapArr[i5] = map;
    }

    public final void w(f fVar, int i) throws IOException {
        c cVarC;
        c cVarC2;
        HashMap[] mapArr = this.f2089d;
        c cVar = (c) mapArr[i].get("DefaultCropSize");
        c cVar2 = (c) mapArr[i].get("SensorTopBorder");
        c cVar3 = (c) mapArr[i].get("SensorLeftBorder");
        c cVar4 = (c) mapArr[i].get("SensorBottomBorder");
        c cVar5 = (c) mapArr[i].get("SensorRightBorder");
        if (cVar != null) {
            if (cVar.f2049a == 5) {
                e[] eVarArr = (e[]) cVar.g(this.f2091f);
                if (eVarArr == null || eVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                    return;
                }
                cVarC = c.b(eVarArr[0], this.f2091f);
                cVarC2 = c.b(eVarArr[1], this.f2091f);
            } else {
                int[] iArr = (int[]) cVar.g(this.f2091f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                cVarC = c.c(iArr[0], this.f2091f);
                cVarC2 = c.c(iArr[1], this.f2091f);
            }
            mapArr[i].put("ImageWidth", cVarC);
            mapArr[i].put("ImageLength", cVarC2);
            return;
        }
        if (cVar2 != null && cVar3 != null && cVar4 != null && cVar5 != null) {
            int iE = cVar2.e(this.f2091f);
            int iE2 = cVar4.e(this.f2091f);
            int iE3 = cVar5.e(this.f2091f);
            int iE4 = cVar3.e(this.f2091f);
            if (iE2 <= iE || iE3 <= iE4) {
                return;
            }
            c cVarC3 = c.c(iE2 - iE, this.f2091f);
            c cVarC4 = c.c(iE3 - iE4, this.f2091f);
            mapArr[i].put("ImageLength", cVarC3);
            mapArr[i].put("ImageWidth", cVarC4);
            return;
        }
        c cVar6 = (c) mapArr[i].get("ImageLength");
        c cVar7 = (c) mapArr[i].get("ImageWidth");
        if (cVar6 == null || cVar7 == null) {
            c cVar8 = (c) mapArr[i].get("JPEGInterchangeFormat");
            c cVar9 = (c) mapArr[i].get("JPEGInterchangeFormatLength");
            if (cVar8 == null || cVar9 == null) {
                return;
            }
            int iE5 = cVar8.e(this.f2091f);
            int iE6 = cVar8.e(this.f2091f);
            fVar.b(iE5);
            byte[] bArr = new byte[iE6];
            fVar.read(bArr);
            e(new b(bArr), iE5, i);
        }
    }

    public final void x() {
        v(0, 5);
        v(0, 4);
        v(5, 4);
        HashMap[] mapArr = this.f2089d;
        c cVar = (c) mapArr[1].get("PixelXDimension");
        c cVar2 = (c) mapArr[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            mapArr[0].put("ImageWidth", cVar);
            mapArr[0].put("ImageLength", cVar2);
        }
        if (mapArr[4].isEmpty() && n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }
}
